package org.cap.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class WebDriver implements WebDriver1
{
	public static org.openqa.selenium.WebDriver driver;
	public static String browser ="chrome";
public static void main(String[] args)

{
	
	WebDriverManager.chromedriver().firefoxdriver().setup();

	
if(browser.equals("chrome"))
{
	WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	 

}
else if(browser.equals("firefox"))
{
	 driver= new FirefoxDriver();
	 
}

driver.get("https://www.google.com");

}

}

