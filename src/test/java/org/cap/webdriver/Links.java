package org.cap.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.wikipedia.org/");
	
	/*List<WebElement> el=driver.findElementsByTagName("a");
	
	System.out.println(el.size());
	for(WebElement a1:el)
	{
		System.out.println(a1.getText()+"   url is"+a1.getAttribute("href"));
		
	}
	*/
	
	
	List<WebElement>  e1=driver.findElements(By.xpath("//div[@class='other-projects']"));
	//List<WebElement>   e2= e1.findElements(By.tagName("a"));
	for(WebElement e3:e1)
	{
		System.out.println(e3.getText());
	}
	}
}
