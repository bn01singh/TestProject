package TestCases;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Config.Configuration;
import PageObjects.LoginPageObjects;
import Utilities.CaptureScreen;
import Utilities.Driver;
import Utilities.FindBrokenLinks;
import Utilities.TestBase;


public class Login extends TestBase

{
	LoginPageObjects lpo = new LoginPageObjects();
	CaptureScreen cs = new CaptureScreen();
	FindBrokenLinks fbl = new FindBrokenLinks();
	
	@Test(testName="Login", dataProvider="getAuthenticationFromExcel")
	public void user_login(String username, String Password) throws Throwable
	{
		Driver.instance.navigate().to(Configuration.Url.app_url);
		
		
		
		
		/*ReceptionHomePageObject R_home = new ReceptionHomePageObject();
		URL url = new URL(Driver.instance.getCurrentUrl());*/
		
		//fbl.FindAllLinks();
		//lpo.typeusername();
		//lpo.typepassword();
		//cs.takeScreenSnap();
		//lpo.clickEnter();
		/*cs.takeScreenSnap();
		fbl.FindAllLinks();
		fbl.checkBroken(url);
		R_home.SearchbyRelationshipNumber();
		cs.takeScreenSnap();
		R_home.ClickAddNewVisitor();*/
		lpo.ele_username().clear();
		lpo.ele_username().sendKeys(username);
		lpo.ele_password().clear();
		lpo.ele_password().sendKeys(Password);
		lpo.ele_btnEnter().click();
				
	}
	
	/*@Test(priority = 5, groups= {"regression"})
	public void click_logoImg()
	{
		lpo.ele_logoImg().click();
	}
	
	@Test(priority = 1, groups= {"functional", "login"}, dataprovider=)
	public void input_username()
	{
		lpo.ele_username().clear();
		lpo.ele_username().sendKeys("Reception");
	}
	
	@Test(priority = 2, groups= {"functional", "login"})
	public void input_password()
	{
		lpo.ele_password().clear();
		lpo.ele_password().sendKeys("Nwnt@123");
	}
	
	@Test(priority = 3, groups= {"functional", "login"})
	public void click_btnEnter()
	{
		lpo.ele_btnEnter().click();
	}
	
	@Test(priority = 4, groups= {"regression", "recoverPwd"}, enabled = false )
	public void click_lnkForgotPwd()
	{
		lpo.ele_forgotPwd().click();
	}*/
	
	
	
	@DataProvider(name = "getAuthenticationFromExcel")
	public Object[][] loginData() throws Throwable
	{
		Object[][] arrayObject = readExcelData("D:\\Amritesh\\Selenium\\git\\UniversalWebdriver\\Dataproviders\\loginData.xlsx","Sheet1");
		return arrayObject;
	}
	
	
	public String[][] readExcelData(String fileName, String sheetName) throws Throwable
	{
		//String[][] arrayExcelData = null;
		
			File file = new File(fileName);
			FileInputStream fs= new FileInputStream(file);
			Workbook book1 = new XSSFWorkbook(fs);
			Sheet sheet1 = book1.getSheet(sheetName);
			int rowcount = sheet1.getLastRowNum()+1;//-sheet1.getFirstRowNum();
			System.out.println("Row = "+rowcount);
			int colcount = sheet1.getRow(1).getLastCellNum();
			System.out.println("column = "+colcount);
			String[][] arrayExcelData = new String[rowcount][colcount];
			for(int i=0;i<rowcount; i++)
			{
				Row row = sheet1.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++)
				{
					arrayExcelData[i][j] = row.getCell(j).getStringCellValue();
				}
			}
			book1.close();
			return arrayExcelData;
	}	
}
