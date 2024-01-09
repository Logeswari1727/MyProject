package org.basictestcase;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestJavaUnitBasic 
{
public static WebDriver driver;
@BeforeClass
public static void launchbrowser()
{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
}
@Test
public void functionality() throws InterruptedException
	{
	 driver.get("https://www.instagram.com/accounts/login/");
	 Thread.sleep(8000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		email.sendKeys("Logeswari@gmail.com");
		WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
		passwd.sendKeys("789654");
}
@Test
public void functionality2() throws InterruptedException 
 {
	 driver.get("https://www.instagram.com/accounts/login/");
	 Thread.sleep(8000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		email.sendKeys("Logeswari123@gmail.com");
		WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
		passwd.sendKeys("8965852");
}
@Before
public void timecheckbefore() 
	{
		Date d=new Date();
		System.out.println(d);
	}
@After
public  void timecheckafter() 
	{
		Date d=new Date();
		System.out.println(d);
}
@AfterClass
public static void closingBrowser() 
{
driver.close();
}
	
	}


