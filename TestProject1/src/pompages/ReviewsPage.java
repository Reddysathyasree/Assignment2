package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class ReviewsPage {
	
	private WebDriver driver;
	@FindBy(xpath="//div[@class='easyClear bigRatingParent']/child::span[@id='bubble_rating']") private WebElement cliktorate;
	@FindBy(xpath="//input[@name='ReviewTitle']") private WebElement reviewtxt;
	@FindBy(xpath="//textarea[@id='ReviewText']") private WebElement yourrview;
	@FindBy(xpath="//div[@id='SUBMIT']") private WebElement submtbtn;
	@FindBy(xpath="//div[@data-category='Business']") private WebElement busbtn;
	@FindBy(xpath="//select[@id='trip_date_month_year']") private WebElement selectbtn;
	@FindBy(xpath="//input[@id='noFraud']") private WebElement agreebtn;
	@FindBy(xpath="//span[@id='qid12_bubbles']") private WebElement hotelbtn;
	
	public ReviewsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void clicktheratebutton() throws InterruptedException
	
	
	{
		
		driver.get("https://www.tripadvisor.in/UserReviewEdit-g641714-d1156207-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");
		String pwh=driver.getWindowHandle();
		driver.switchTo().window(pwh);
		Actions act=new Actions(driver);
		act.moveToElement(cliktorate).click().perform();
		reviewtxt.sendKeys("Sathya");		
	    yourrview.sendKeys("sree dsddgdgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggfffffffffffffffffffffffffffffffffffffffffffffffffffff ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg tyhftytuu hjgj fgdfhfhfghyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
		busbtn.click();
		Select sel=new Select(selectbtn);
		sel.selectByIndex(1);
		agreebtn.click();
		submtbtn.click();
		Thread.sleep(2000);
		
		}
	
	

}
