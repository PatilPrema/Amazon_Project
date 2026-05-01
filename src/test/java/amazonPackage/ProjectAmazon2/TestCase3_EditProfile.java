package amazonPackage.ProjectAmazon2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass_Amazon;
import Utility.ListnersLogic;

@Listeners(ListnersLogic.class)
public class TestCase3_EditProfile extends BaseClass_Amazon {

	@Test
	public void Testcase3()
	{
		LoginPage_Amazon l1=new LoginPage_Amazon(driver);
		l1.UN("8095378203");
		l1.PWD("PreLax@#1234");
		HomePage_Amazon am = new HomePage_Amazon(driver);
		am.AccountlistFeild();
		am.YourAccountFeild();
		am.EditAccountFeild();
		am.EditInfo();
		am.EditFullName("Pisutre");
	}
}
