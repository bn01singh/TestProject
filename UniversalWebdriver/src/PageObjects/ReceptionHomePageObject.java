package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.Driver;

public class ReceptionHomePageObject 
{
	By home = new By.ByXPath("//*[@class='lnk03']//*[text()='Home']");
	By yourProfile = new By.ByXPath("//*[contains(text(), 'Your Profile')]");
	By changePassword = new By.ByXPath("//*[@class='lnk03']//*[href='/Authentication/ChangePassword.aspx']");
	By appointment = new By.ByLinkText("Appointment");
	By logout = new By.ByLinkText("Logout");
	By btnSearch = new By.ByXPath("//*[@id='ctl00_CenterAreaHolder_BtnSearch']");
	By ddlSearchBy = new By.ByXPath("//*[@id='ctl00_CenterAreaHolder_DropDownListSearchBy']");
	By searchCriteria = new By.ByXPath("//*[@id='ctl00_CenterAreaHolder_TextBoxSearchedValue']");
	By addNewVisitor = new By.ByXPath("//*[@id='ctl00_CenterAreaHolder_BtnAddNewVisitor']");
	
	public WebElement clickHome()
	{
		WebElement lnk_home = Driver.instance.findElement(home);
		return lnk_home;
	}
	
	public WebElement ele_YourProfile()
	{
		WebElement lnk_yourProfile = Driver.instance.findElement(yourProfile);
		return lnk_yourProfile;
	}
	
	public WebElement ele_ChangePassword()
	{
		WebElement lnk_chngPass = Driver.instance.findElement(changePassword);
		return lnk_chngPass;
	}
	
	public WebElement ele_lnkAppointment()
	{
		WebElement lnk_appointment = Driver.instance.findElement(appointment);
		return lnk_appointment;
	}
	
	public WebElement ele_lnkLogout()
	{
		WebElement lnk_logout = Driver.instance.findElement(logout);
		return lnk_logout;
	}
	
	public WebElement ele_btnSearch()
	{
		WebElement Btn_search = Driver.instance.findElement(btnSearch);
		return Btn_search;
	}
	
	public WebElement ele_ddlSearchBy()
	{
		WebElement ele = Driver.instance.findElement(ddlSearchBy);
		return ele;
	}
	
	public WebElement ele_txtSearchCriteria()
	{
		WebElement criteria = Driver.instance.findElement(searchCriteria);
		return criteria;
		
	}
	
	public WebElement ele_btnAddNewVisitor()
	{
		WebElement add_visitor = Driver.instance.findElement(addNewVisitor);
		return add_visitor;
	}

	
	/*public void selectSearchByOption()
	{
		String expectedOption = "Relationship Number";
		Select searchby = new Select(Driver.instance.findElement(ddlSearchBy));
		List<WebElement> allOptions = searchby.getOptions();
		int optionSize = allOptions.size();
		for(int i=0; i<optionSize; i++)
		{
			String optionText = allOptions.get(i).getText();
			if(optionText.equals(expectedOption))
			{
				searchby.selectByVisibleText(optionText);
			}
		}
	}*/
	
	/*public void inputSearchCriteria()
	{
		clickSearchCriteria().click();
		clickSearchCriteria().sendKeys("NWNT011154");
		
	}*/
	
	/*public void SearchbyRelationshipNumber() throws Exception
	{
		selectSearchByOption();
		Thread.sleep(3000);
		ele_txtSearchCriteria();
		ele_btnSearch();
	}*/

}
