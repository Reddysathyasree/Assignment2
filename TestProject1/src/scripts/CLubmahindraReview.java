package scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericmethods.BaseClass;
import pompages.FirstSearchresultsPage;
import pompages.HomePage;
import pompages.ReviewsPage;
import pompages.SearchresultsPage;


public class CLubmahindraReview extends BaseClass
{
public static String amazonprice;
public String flipkartprice;
public static int amazonphprice;

@Test(invocationCount=1,priority=0)
public void clubmahindra() throws InterruptedException
{
	HomePage hp=new HomePage(driver);
	hp.entersearchtext();
	hp.clickgobtn();
	SearchresultsPage sp=new SearchresultsPage(driver);
    sp.clickfirstoption();
	FirstSearchresultsPage fsp=new FirstSearchresultsPage(driver);
    fsp.writrbtnclick();
	ReviewsPage rp=new ReviewsPage(driver);
	rp.clicktheratebutton();
}
}
