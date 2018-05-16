package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class CaptureScreen
{
	public void takeScreenSnap() throws Throwable
	{
		//Take Screenshot from source and keep it in File variable
		//TakesScreenshot scrShot = ((TakesScreenshot)Driver.instance);
		File srcFile = ((TakesScreenshot)Driver.instance).getScreenshotAs(OutputType.FILE);
		//Get destination file location and filename
		File destFile = new File("D:\\Amritesh\\Selenium\\Screenshot\\"+Driver.instance.getTitle()+".png");
		//Copy Source file in destination file
		FileUtils.copyFile(srcFile, destFile);
	}
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException
	{
		if(testResult.getStatus() == ITestResult.FAILURE)
		{
			System.out.println(testResult.getStatus());
			File srcFile = ((TakesScreenshot)Driver.instance).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("D:\\Amritesh\\Selenium\\Screenshot\\"+Driver.instance.getTitle()+"Error.png"));//new File("errorScreenshots\\"+testResult.getName()+"-"+Arrays.toString(testResult.getParameters())+".png"));
		}
	}

}
