package com.com.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JpetStore {
	 private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
  @Test
  public void click_SignIn() {
	  driver.findElement(By.linkText("Sign In")).click();
	  System.out.println("method 1");
  }
  @Test
  public void click_Register() {
	  System.out.println("method 2");
	  driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  String path = System.getProperty("user.dir");
		System.out.println(path);
		
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    System.out.println("Chrome browser is lauched successfully!!!!");
	    driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

}
