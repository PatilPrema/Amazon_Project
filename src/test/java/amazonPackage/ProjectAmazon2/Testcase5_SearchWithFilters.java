package amazonPackage.ProjectAmazon2;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.BaseClass_Amazon;

//verify that search with filters(e.g categpry, price range)yields accurate results - search-shoe-kids-
public class Testcase5_SearchWithFilters extends BaseClass_Amazon
{
@Test
public void Testcase5_SerachwithFilter()
{
	LoginPage_Amazon l1=new LoginPage_Amazon(driver);
	l1.UN("8095378203");
	l1.PWD("PreLax@#1234");
	HomePage_Amazon Home = new HomePage_Amazon(driver);
	Home.SearchItem("shoe");
	WaitForUrlConatins("shoe");
	Home.SearchItemWithFilter();
	String url =Home.getcurrentURL();
	
	
	Assert.assertTrue(url.contains("shoe"));
	Assert.assertTrue(url.contains("kids"));
	
}
}
