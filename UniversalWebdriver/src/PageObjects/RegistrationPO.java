package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.Driver;

public class RegistrationPO 
{
	By obj_uploadImage = new By.ById("ctl00_CenterAreaHolder_FluUploadPhoto");
	By obj_uploadConsent = new By.ById("ctl00_CenterAreaHolder_ConsentFormUpload");
	
	public WebElement uploadImage()
	{
		WebElement ele_uploadImage = Driver.instance.findElement(obj_uploadImage);
		return ele_uploadImage;
	}

}
