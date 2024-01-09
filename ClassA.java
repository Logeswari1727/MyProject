package org.basictestcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
public static WebDriver driver;
	@BeforeClass
	public static void lauchchrome()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
@Before
public void exetimebefore()
{
Date d=new Date();
System.out.println(d);
}
@Test
public void Testcase1() throws InterruptedException
{
driver.get("https://www.amazon.in/");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 11r");
}
@Test
public void Testcase2() throws AWTException, InterruptedException
{
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung Flip5z");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_ENTER);
}
@Ignore
@Test
public void Testcase3() throws InterruptedException
{
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
}
@After
public void exetimeafter()
{
Date d=new Date();
System.out.println(d);
}
@AfterClass
public static void closewindow()
{
	driver.quit();
}
}