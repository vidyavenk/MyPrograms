package org.cap.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jqueydrag 
{

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://jqueryui.com/resizable/");
//WebElement e1=driver.findElement(By.xpath("//span[@tabindex='0']"));



WebElement e1=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
Actions act= new Actions(driver);
act.dragAndDropBy(e1, 400, 300).perform();
	}
}
