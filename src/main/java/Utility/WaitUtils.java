package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils
{
	WebDriver driver;
	WebDriverWait wait;

	public WaitUtils(WebDriver driver)
	{
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	//wait for url contians
	
	public void waitForURLcontains(String value)
	{
		wait.until(ExpectedConditions.urlContains(value));
	}
	//wait for element visible
	public WebElement waitForElementVisible(WebElement element)
	{
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	//wait for elemtn to be clickable
	public WebElement waitForElementClickable(WebElement element)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	//wait for elemtn to be invisible
		public boolean waitForelementInvisible(By locator)
		{
			return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		}
		
	//wait for presence of element
				public WebElement waitForelementPresence(By locator)
				{
					return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				}
	//wait for title conatins
				public void waitFortitleconatins(String title)
				{
					 wait.until(ExpectedConditions.titleContains(title));
				}
		
}
