package org.cap.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static ChromeDriver driver;
	static int i;
	
	public static  boolean isElementPresent(By by)
			{
		driver.findElement(by);
		return true;
			}
	
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.ironspider.ca/forms/checkradio.htm");

	 List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));
	 
	int k=check.size();
i=k;
	if(i==k)
	{
	
		for(WebElement a1: check)
		{
			a1.click();
			
		}
		
	}
		
		
		
	}
	 
	 
	 

}
