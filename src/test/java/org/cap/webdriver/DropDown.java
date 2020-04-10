package org.cap.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown 
{
public static void main(String[] args) 
{
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.wikipedia.org/");
//driver.findElement(By.xpath("//select[@id='searchLanguage']")).sendKeys("English");
Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='searchLanguage']")));


//WebElement ele= driver.findElements(By.xpath("//select[@id='searchLanguage']"));

//dropdown.selectByVisibleText("English");
List<WebElement> ele= dropdown.getOptions();

for(WebElement web:ele)
{
	System.out.println(web.getText());
}

}
}
