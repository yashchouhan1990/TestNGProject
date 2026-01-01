package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGConcept {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "/Users/yashchouhan/Downloads/chromedriver-mac-x64 (1)");
		//driver = new ChromeDriver();
		
		//Firefox
		System.setProperty("webdriver.gecko.driver", "/Users/yashchouhan/Downloaded_Jars/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://freecrm.com");
		
	}
	
	@Test
	public void Test() {
		//driver.getCurrentUrl();
		//driver.getTitle();
		System.out.println("Hi There");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
