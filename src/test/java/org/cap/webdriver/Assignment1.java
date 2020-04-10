package org.cap.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1
{
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
	// driver.get("https://google.com");
	 
	/*   
	 * 
	 *  assignment1
	 *  
	 *  driver.get("http://www.way2automation.com/");
	 List<WebElement> e1=driver.findElements(By.tagName("a"));
	 System.out.println(e1.size());
	 for(WebElement e2:e1)
	 {
		 System.out.println(e2.getText());
		 
	 }*/
	 
	 

driver.get("https://wwwqa.way2automation.com");
	 
	}
}
