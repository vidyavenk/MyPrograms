package org.cap.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elementprsesnt {
	public static ChromeDriver driver;
	
	
	public static boolean isElementPresent(By by)
	{
		driver.findElement(by);
		return true;
		
	}
	
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://www.guru99.com/implicit-explicit-waits-selenium.html");
	
	
			System.out.println(isElementPresent(By.xpath("//a[@href='#4']")));
	}

}
