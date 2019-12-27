package pompages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SearchresultsPage
{
	private WebDriver driver;
@FindBy(xpath="(//div[@class='result-title'])[1]") private WebElement firstopt;


public SearchresultsPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	this.driver=driver;
}

public void clickfirstoption()
{   //Reporter.log(driver.getTitle(),true);
	firstopt.click();
}

}
