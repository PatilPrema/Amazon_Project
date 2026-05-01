package amazonPackage.ProjectAmazon2;
//verify that product detials page desplays all necessary information (proce, review, description)

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.BaseClass_Amazon;

public class Testcase7_ProductDetails extends BaseClass_Amazon {

	@Test
	public void VerifyProductDetailsPageInfo() {
	LoginPage_Amazon l1=new LoginPage_Amazon(driver);
	l1.UN("8095378203");
	l1.PWD("PreLax@#1234");
	HomePage_Amazon Home = new HomePage_Amazon(driver);
	Home.SearchItem("shoe");
	Home.ClickOnFirstShoe();
	
	Set<String> AllWindows =driver.getWindowHandles();
	for(String window:AllWindows)
	{
		driver.switchTo().window(window);
	}
	
	Product_details_Page details=new Product_details_Page(driver);
	Assert.assertTrue(details.isPrisceDisplayed(), "Price not dispalyed");
	Assert.assertTrue(details.isDescriptionDisplayed(), "Discrition not dispalyed");
	Assert.assertTrue(details.isProductRevoew(), "Reviews not dispalyed");
}
}
