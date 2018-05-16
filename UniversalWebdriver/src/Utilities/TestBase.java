package Utilities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase 
{
	@BeforeSuite
	public void setup()
	{
		Driver.initialize();
	}
	
	@AfterSuite
	public void cleanup()
	{
		Driver.close();
	}

}
