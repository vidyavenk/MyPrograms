package org.cap.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass 
{
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


driver.get("http://www.way2automation.com/");
WebElement d=driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
Actions action = new Actions(driver);
action.moveToElement(d).perform();
//driver.findElement(By.xpath("//a[contains(text(),'Practice site 1')]")).click();



	}
}
