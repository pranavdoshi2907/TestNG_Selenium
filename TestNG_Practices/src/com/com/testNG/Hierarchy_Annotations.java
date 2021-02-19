package com.com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hierarchy_Annotations {
	private WebDriver driver;
	 
	@BeforeTest
	public void lauchBrowser() {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    System.out.println("Chrome browser is lauched successfully!!!!");
	    driver.manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void openUrl() {
		
	    driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("open url is successfully");
	}
	
	@Test(priority = 1)
	  public void click_SignIn() {
		  driver.findElement(By.linkText("Sign In")).click();
		  System.out.println("Sign In");
	  }
	  @Test(priority = 2)
	  public void click_Register() {
		  driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]")).click();
		  System.out.println("Register");
	  }
	
	@AfterTest
	public void close_Browser() {
		System.out.println("");
		driver.quit();
	}
		
}
