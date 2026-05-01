package amazonPackage.ProjectAmazon2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WaitUtils;

public class Product_details_Page {
	
	WebDriver driver;
	WaitUtils wait;
	
	
	@FindBy(xpath="//div[@id='corePriceDisplay_desktop_feature_div']//span[contains(@class,'a-price-whole')]")
	WebElement ProductPrice;
	
	@FindBy(xpath="//h2[text()='Product details']")
	WebElement ProdcutDescription;
	
	@FindBy(xpath="//h2[text()='Customer reviews']")
	WebElement ProductReview;
	
	public boolean isPrisceDisplayed()	
	{
		return wait.waitForElementVisible(ProductPrice).isDisplayed();
	}
	public boolean isDescriptionDisplayed()	
	{
		return wait.waitForElementVisible(ProdcutDescription).isDisplayed();
	}
	public boolean isProductRevoew()	
	{
		return wait.waitForElementVisible(ProductReview).isDisplayed();
	}
	
	public Product_details_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		 wait=new WaitUtils(driver);
	}
	
	

}
