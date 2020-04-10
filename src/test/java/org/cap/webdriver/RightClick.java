package org.cap.webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.image.CropImageFilter;
import java.io.File;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick
{
public static void main(String[] args) throws IOException {
	
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://deluxe-menu.com/popup-mode-sample.html");
	WebElement img = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
	Actions act= new Actions(driver);
	act.contextClick().perform();
	
	
	TakesScreenshot file = (TakesScreenshot)driver;
File src=	file.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\vidyvenk\\Desktop\\march selenium\1.jpg"));
	
}
}
