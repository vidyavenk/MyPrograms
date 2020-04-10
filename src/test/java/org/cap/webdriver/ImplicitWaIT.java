package org.cap.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaIT 
{
public static void main(String[] args) {
	
	
	WebDriverManager.chromedriver().firefoxdriver().setup();
	
	
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(""))).sendKeys("");
	driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=http%3A%2F%2Fsupport.google.com%2Faccounts%2Fanswer%2F7675428%3Fhl%3Den&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("vshree151@gmail.com");
	driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("alliswell*");
}
}
