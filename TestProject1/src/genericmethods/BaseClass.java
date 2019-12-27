package genericmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass implements IAutoconst
{
	public WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	
	@BeforeMethod
    
	public void launchapplication()
	{   ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
		   
	}
	
@AfterMethod
public void closeapplication()
{
	driver.quit();
}
}
