package TestCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjects.ReceptionHomePageObject;
import Utilities.Driver;
import Utilities.FindBrokenLinks;
import Utilities.TestBase;

public class ReceptionHome extends TestBase
{
	ReceptionHomePageObject recHome = new ReceptionHomePageObject();
	FindBrokenLinks fbl = new FindBrokenLinks();
	
	/*Check all broken links on the page*/
	@Test(testName="checkBroken", groups= {"regression","functional"})
	public void checkBrokenlink()
	{
		fbl.FindAllLinks();
	}
	
	/*Search visitor by user given Relationship number*/
	@Test(testName="searchbyRelatioshship", groups= {"regression","functional"})
	public void searchVisitorbyRelationshipnumber() throws Exception
	{
		String C_url = Driver.instance.getCurrentUrl();
		if(C_url.contains("/Users.aspx"))
		{
		selectSearchByOption();
		Thread.sleep(5000);
		recHome.ele_txtSearchCriteria().sendKeys("NWNT011154");
		recHome.ele_btnSearch().click();
		}
		else
		{
			recHome.clickHome();
			selectSearchByOption();
			Thread.sleep(5000);
			recHome.ele_txtSearchCriteria().sendKeys("NWNT011154");
			recHome.ele_btnSearch().click();
		}
	}
	
	/*Check the profile of the user*/
	@Test
	public void checkLoginedvisitorProfile()
	{
		recHome.ele_YourProfile().click();
	}
	
	public void selectSearchByOption()
	{
		String expectedOption = "Relationship Number";
		//Select searchby = new Select(Driver.instance.findElement();
		WebElement ele1 = recHome.ele_ddlSearchBy();
		Select search_by = new Select(ele1);
		List<WebElement> allOptions = search_by.getOptions();
		int optionSize = allOptions.size();
		for(int i=0; i<optionSize; i++)
		{
			String optionText = allOptions.get(i).getText();
			if(optionText.equals(expectedOption))
			{
				search_by.selectByVisibleText(optionText);
			}
		}
	}

}
