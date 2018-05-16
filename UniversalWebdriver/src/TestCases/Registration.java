package TestCases;

import java.io.IOException;

import PageObjects.ReceptionHomePageObject;
import PageObjects.RegistrationPO;

public class Registration 
{
	public void User_registration() throws Exception
	{
		RegistrationPO registration = new RegistrationPO();
		ReceptionHomePageObject rec = new ReceptionHomePageObject();
		
		rec.ele_btnAddNewVisitor().click();
		registration.uploadImage().click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\IT\\Desktop\\ImageUpload.exe");
		Thread.sleep(5000);
	}

}
