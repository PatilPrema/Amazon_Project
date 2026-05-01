package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass_Amazon {

	protected WebDriver driver;
	protected WebDriverWait wait;

	@Parameters("browser")
	@BeforeMethod
	public void Launch(String nameOfTheBrowser)
	{
		if(nameOfTheBrowser.equals("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(nameOfTheBrowser.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else if(nameOfTheBrowser.equals("edge"))
		{
			 driver = new EdgeDriver();
		}
		else
		{
			throw new IllegalArgumentException("Invalid Browser name");
		}
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//Reusable wait method
	
	public void WaitForUrlConatins(String value)
	{
		wait.until(ExpectedConditions.urlContains(value));
	}
	
	public void waitForElementVisible(WebElement element)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForElementClickable(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForElementToBeInVisible(By locator)
	{
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	@AfterMethod
	public void testcase2()
	{
		driver.quit();
	}
		
	


}

//<class name="amazonPackage.ProjectAmazon2.Testcase1_LoginAmazon2"/>
//<class name="amazonPackage.ProjectAmazon2.TestCase3_EditProfile"/>
//<class name="amazonPackage.ProjectAmazon2.TestCase4_SearchItem"/>
