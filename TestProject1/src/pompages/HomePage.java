package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage 
{
private WebDriver driver;
@FindBy(xpath="//input[@type='search' and @name='q']") private WebElement searchbox;
@FindBy(xpath="//span[@class='_2LyoLJ4U _2HBN-k68']") private WebElement gobtn;
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	this.driver=driver;
}
public void entersearchtext()
{
	try
{
	searchbox.sendKeys("Club Mahindra");
}
catch(Exception e)
{   Reporter.log("Where to?---------- present instead of the search box ",true);
	Reporter.log("Closing the browser and hence re reun the testng.xml to see the Assignment 2 running successfully",true);
	driver.close();
	
}
}

public void clickgobtn()
{
	gobtn.click();
}

}