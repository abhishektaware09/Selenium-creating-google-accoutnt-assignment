package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment01 {
	
	WebDriver driver;
	String url="https://accounts.google.com/signup";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		//Checking First Name text field
		driver.findElement(By.id("firstName")).sendKeys("Abhishek");

		//Checking First Name text field
		driver.findElement(By.id("lastName")).sendKeys("Taware");
		
		//Checking Username text field
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("AbhishekTaware99");
		System.out.println("Username : "+username.getAttribute("value"));

		//Checking Password text field
		driver.findElement(By.name("Passwd")).sendKeys("Abhishek@99");

		//Checking Confirm password text field
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Sayali@1234");
	
		//clicking on Next Button
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span")).click();
		
		//Checking whether next page is coming
		String var = driver.findElement(By.id("headingText")).getText();
		System.out.println(var);
		

		
		
	}

}