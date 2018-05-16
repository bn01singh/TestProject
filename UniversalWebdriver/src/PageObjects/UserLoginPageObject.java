package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.Driver;

public class UserLoginPageObject 
{
	By home = new By.ByLinkText("Home");
	By aboutUs = new By.ByLinkText("About Us");
	By stressometer = new By.ByLinkText("Stress-o-meter");
	By contactUs = new By.ByLinkText("Contact Us");
	By signUp = new By.ByLinkText(" Sign Up");
	By relationshipNumber = new By.ByXPath("//*[@class='col-md-6']//[@id='ctl00_ContentPlaceHolder1_RadioButton1']");
	By userName = new By.ByXPath("//*[@class='col-md-6']//[@id='ctl00_ContentPlaceHolder1_RadioButton2']");
	By usernameType = new By.ByClassName("row");
	By username = new By.ById("ctl00_ContentPlaceHolder1_UserName");
	By password = new By.ById("ctl00_ContentPlaceHolder1_Password");
	By submit = new By.ById("ctl00_ContentPlaceHolder1_btnsubmit");
	By cancel = new By.ById("ctl00_ContentPlaceHolder1_btncancel");
	By registerNew = new By.ByLinkText("Register Now");
	By forgotPass= new By.ByLinkText("Forgot password?");
	
	WebDriver dr = Driver.instance;
	
	public By getHome() {
		return home;
	}

	public By getAboutUs() {
		return aboutUs;
	}

	public By getStressometer() {
		return stressometer;
	}

	public By getContactUs() {
		return contactUs;
	}

	public By getSignUp() {
		
		return signUp;
	}

	public By getRelationshipNumber() {
		return relationshipNumber;
	}

	public By getUserName() {
		
		return getUserName();
	}

	public By getUsernameType() {
		return usernameType;
	}

	public void inputUsername(String userName) {
		dr.findElement(username).sendKeys(userName);
	}
	
	public void inputPassword(String pwd) {
		dr.findElement(password).sendKeys(pwd);
	}
	
	public void clickSubmit() {
		dr.findElement(submit).click();
	}

	public WebElement getCancel() {
		WebElement btn_cancel = dr.findElement(cancel);
		return btn_cancel;
	}

	public By getRegisterNew() {
		return registerNew;
	}

	public By getForgotPass() {
		return forgotPass;
	}
	
	

}
