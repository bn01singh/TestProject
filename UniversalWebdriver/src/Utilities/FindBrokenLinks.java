package Utilities;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindBrokenLinks 
{
	public List<WebElement> FindAllLinks()
	{
		List<WebElement> elementList = new ArrayList<WebElement>();
		elementList = Driver.instance.findElements(By.tagName("a"));
		elementList.addAll(Driver.instance.findElements(By.tagName("img")));
		List<WebElement> finalList = new ArrayList<WebElement>();
		System.out.println("Total number of links are "+elementList.size());
		for(WebElement element : elementList)
		{
			if(element.getAttribute("href") != null)
			{
				System.out.println(element.getAttribute("href")+" is OK.");
				finalList.add(element);
			}
			else
				System.out.println(element.getAttribute("Name")+" is broken");//+"  ( "+element.getAttribute("Name")+" )"+" is broken.");
		}
		System.out.println("Total number of broken links are "+(elementList.size()-finalList.size()));
		return finalList;
		
	}
	
	public void checkBroken(URL url) throws Exception
	{
		String response = "";
		Driver.instance.getCurrentUrl();
		System.out.println(Driver.instance.getCurrentUrl());
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		try
		{
			connection.connect();
			response = connection.getResponseMessage();
			connection.disconnect();
			//return response;
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
		}
		
	}

}
