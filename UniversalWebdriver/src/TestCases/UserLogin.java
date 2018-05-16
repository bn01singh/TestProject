package TestCases;

import org.testng.annotations.Test;

import PageObjects.UserLoginPageObject;
import Utilities.Driver;
import Utilities.TestBase;

public class UserLogin extends TestBase
{
	@Test
	public void user_login()
	{
		Driver.instance.navigate().to("http://noworrynotension.net/SignIn/UserLogin.aspx");
		UserLoginPageObject userLoginPage = new UserLoginPageObject();
		userLoginPage.inputUsername("NWNT011154");
		userLoginPage.inputPassword("Amritesh@321");
		userLoginPage.clickSubmit();
		
	}

}
