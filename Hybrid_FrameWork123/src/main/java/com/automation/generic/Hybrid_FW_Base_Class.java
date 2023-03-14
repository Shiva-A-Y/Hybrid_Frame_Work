package com.automation.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hybrid_FW_Base_Class 
{
@Test
public void testopenBrowser() throws InterruptedException
{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	driver.quit();
}
}
