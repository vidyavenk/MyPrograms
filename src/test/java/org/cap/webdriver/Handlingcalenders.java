package org.cap.webdriver;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingcalenders 
{
	static int targateyear=0;
	static int targateDay=0;
	 static int targetMonth=0;
	
	static int currentyear=0;
	static int  currentday=0;
	static int currentMonth=0;
	
	static int jumpMonthsBy=0;
	static boolean increment =true;
	
public static void main(String[] args)
{

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	String dateToSet="15/08/2020";
	
	taregetDate(dateToSet);
	
	getCurrentdateday();
	
	jumpby();
	//getDate
	
	
}

public static void jumpby()
{
	if((targetMonth-currentMonth)>0)
	{
		jumpMonthsBy=(targetMonth-currentMonth);
		increment=true;
	}
	else
	{
		jumpMonthsBy=(currentMonth-targetMonth);
		increment=false;
	}
}

public static void taregetDate(String date)
{
	
int firstindex=	date.indexOf("/");
int lastindex= date.lastIndexOf("/");
String date1=date.substring(0, firstindex);
targateDay =Integer.parseInt(date1);

String month= date.substring(firstindex+1, lastindex);
	targetMonth=Integer.parseInt(month);
	
	String year = date.substring(lastindex+1, date.length());
	targateyear = Integer.parseInt(year);
	System.out.println(targateDay+ " "+targetMonth+ " "+targateyear);
}

public static void getCurrentdateday()
{
	Calendar cal = Calendar.getInstance();
	currentday =	cal.get(Calendar.DAY_OF_MONTH);
currentyear	=cal.get(Calendar.YEAR);
currentMonth =cal.get(Calendar.MONTH)+1;
System.out.println(currentday+ " "+currentMonth+ " "+currentyear );


}
}
