package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class FirstSearchresultsPage 
{
	private WebDriver driver;
	
	//@FindBy(xpath="//a[text()='Write a review']") private WebElement writrbtn;
	@FindBy(xpath="//div[@class='hotels-community-content-common-ContextualCTA__contextualCTA--3K7gq']") private WebElement writrbtn;
	
	public FirstSearchresultsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	public void writrbtnclick()
	{
	driver.get("https://www.tripadvisor.in/Hotel_Review-g641714-d1156207-Reviews-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");
	String pwh=driver.getWindowHandle();
	driver.switchTo().window(pwh);
	//Reporter.log(driver.getTitle(),true);
	WebDriverWait wait=new WebDriverWait(driver,25);
	wait.until(ExpectedConditions.visibilityOf(writrbtn));
    writrbtn.click();
	}
}
