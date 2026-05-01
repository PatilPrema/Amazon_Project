package amazonPackage.ProjectAmazon2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_NegativeTC {

	WebDriver driver;
	
	   @FindBy(name="email")
	   WebElement Username;
	   
	   @FindBy(id="continue")
	   WebElement UN_Continue;
	   
	   @FindBy(xpath="//input[@type='password']")
	   WebElement Password;

	   @FindBy(id="signInSubmit")
	   WebElement SignInButton;
	   
	  //2nd step
	   
	   public void UN()
	   {
		   Username.sendKeys("918095378203");
		   UN_Continue.click();
		  
	   }
	   public void PWD()
	   {
		   Password.sendKeys("PreLa@#1234");
		   SignInButton.click();
	   }
	   
	  //3rd step
	   
	  public LoginPage_NegativeTC(WebDriver driver)
	   {
		  this.driver = driver;
		   PageFactory.initElements(driver, this);
	   }

}
