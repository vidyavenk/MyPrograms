package org.cap.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandletABLES 

{

	
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
	 driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
	 
	 List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	 List<WebElement> col= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
	 
	 int i=row.size();
	 int j=col.size();
	 
	 
	 for(int rows=1;rows<=i;rows++)
	 {
		 for(int cols= 1;cols<=j;cols++)
		 {
			 System.out.print(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+rows+"]/td["+cols+"]")).getText());
			 
		 }
		 System.out.println();
	 }
	 
	 
	


	}
}
