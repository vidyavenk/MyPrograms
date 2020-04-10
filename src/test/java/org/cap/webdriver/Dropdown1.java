package org.cap.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1
{
public static void main(String[] args) 
{
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/?stype=lo&jlou=AfcLlKSyVebGTJADmmWIS2nw4nANRj6YfzC5WHoCobjKwPQR6wgm0Z_ZcD8xM-a__8m-iDGmns24isjiV7iXAKtu7ExJQ1vN2rNAQM4VVBt_Lg&smuh=45572&lh=Ac-byTegP6qzO1p8");
WebElement ele =driver.findElement(By.xpath("//select[@id='month']"));
Select drop = new Select(ele);

List<WebElement> e1=drop.getOptions();
for(WebElement e2:e1)
{
	System.out.println(e2.getText());
}
}
}
