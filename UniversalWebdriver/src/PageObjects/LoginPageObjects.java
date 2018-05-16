package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.Driver;

public class LoginPageObjects 
{
	By username = new By.ById("txtUserName");
	By password = new By.ById("txtPassword");
	By btnEnter = new By.ById("ibtnEnter");
	By forgotPwd = new By.ById("HyperLink1");
	By logoImg = new By.ByXPath("//form[@id='form1']//a[@href='Default.aspx']/img[@alt='NWNT']");
	
	public WebElement ele_logoImg()
	{
		WebElement ele = Driver.instance.findElement(logoImg);
		return ele;
	}
	public WebElement ele_username()
	{
		WebElement ele = Driver.instance.findElement(username);
		return ele;
	}
	
	public WebElement ele_password()
	{
		WebElement ele = Driver.instance.findElement(password);
		return ele;
	}
	
	public WebElement ele_btnEnter()
	{
		WebElement ele = Driver.instance.findElement(btnEnter);
		return ele;
	}
	
	public WebElement ele_forgotPwd()
	{
		WebElement ele = Driver.instance.findElement(forgotPwd);
		return ele;
	}

}
