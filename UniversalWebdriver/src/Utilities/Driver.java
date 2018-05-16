package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Config.Configuration;


public class Driver 
{
	public static WebDriver instance = null;
	
	public static void initialize()
	{
		if(instance == null)
		{
			if(Configuration.Browser.browser.equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Amritesh\\Selenium\\geckodriver.exe");
				instance = new FirefoxDriver();
			}
			else if(Configuration.Browser.browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Amritesh\\Selenium\\Chromedriver.exe");
				instance = new ChromeDriver();
			}
		}
		//instance.manage().window().maximize();
			
	}
	
	public static void close()
	{
		instance.close();
		instance = null;
	}
	
	public static void quit()
	{
		instance.quit();
		instance = null;
	}


}
