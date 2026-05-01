package amazonPackage.ProjectAmazon2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass_Amazon;
import Utility.ListnersLogic;
@Listeners(ListnersLogic.class)
public class Testcase2_LoginNegavtiveTC extends BaseClass_Amazon{

	
	@Test
	public void Tc1()
	{
		LoginPage_NegativeTC tc = new LoginPage_NegativeTC(driver);
		tc.UN();
		tc.PWD();
		

		String errormessage = driver.findElement(By.xpath("//div[@id='auth-error-message-box']")).getText();
		Assert.assertEquals(errormessage, "Successful Login", "password is incorrect please enter corrrect password");
}}
