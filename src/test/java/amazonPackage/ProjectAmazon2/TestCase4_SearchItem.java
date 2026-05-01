package amazonPackage.ProjectAmazon2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass_Amazon;
import Utility.ExcelUtil;
import Utility.ListnersLogic;

@Listeners(ListnersLogic.class)
public class TestCase4_SearchItem extends BaseClass_Amazon
{

	@Test(dataProvider="amazonData")
	public void SearchItem(String username, String password, String item)
	{
		LoginPage_Amazon l1=new LoginPage_Amazon(driver);
		l1.UN(username);
		l1.PWD(password);
		HomePage_Amazon Home = new HomePage_Amazon(driver);
		Home.SearchItem(item);
		WaitForUrlConatins(item);
		String url =Home.getcurrentURL();
		
		Assert.assertTrue(url.contains(item));
		
	}
	@DataProvider(name="amazonData")
	public Object[][] getData() throws Exception
	{
		return ExcelUtil.getData("testdata.xlsx", "Sheet1");
		
	}
}
