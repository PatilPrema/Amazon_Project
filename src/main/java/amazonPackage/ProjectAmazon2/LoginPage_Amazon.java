package amazonPackage.ProjectAmazon2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WaitUtils;

public class LoginPage_Amazon
{
	WebDriver driver;
	WaitUtils wait;
	
	
	
	   @FindBy(name="email")
	   WebElement Username;
	   
	   @FindBy(id="continue")
	   WebElement UN_Continue;
	   
	   @FindBy(id="ap_password")
	   WebElement Password;

	   @FindBy(id="signInSubmit")
	   WebElement SignInButton;
	   
	  //2nd step
	   
	   public void UN(String Uname)
	   {
		   wait.waitForElementVisible(Username).sendKeys(Uname);
		   wait.waitForElementClickable(UN_Continue).click();
		  
	   }
	   public void PWD(String PWD)
	   {
	  wait.waitForElementVisible(Password).sendKeys(PWD);
		  wait.waitForElementClickable(SignInButton).click();
	   }
	   
	  //3rd step
	   
	  public LoginPage_Amazon(WebDriver driver)
	   {
		  this.driver=driver;
		   PageFactory.initElements(driver, this);
		  this.wait= new WaitUtils(driver);
		  
	   }
	
}
