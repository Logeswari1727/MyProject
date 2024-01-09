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

public class ClassB {

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
	public void Testcase4() throws InterruptedException
	{
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
	}
@Test
	public void Testcase5() throws AWTException, InterruptedException
	{
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[2]")).click();
		System.out.println("Bestseller page launched Successfully");
	}
	@Ignore
	@Test
	public void Testcase6() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8220200552");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	System.out.println("Continue button is clicked Successfully ");
	
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
