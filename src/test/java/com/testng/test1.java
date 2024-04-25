package com.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	@Test(priority = 1)
	public void lauchbrowser() {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	  this.driver = new ChromeDriver(ops);
		
		//System.setProperty("webdriver.chrome.driver","/home/sahil.kadia/Downloads/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
	    //WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
	     //driver = new FirefoxDriver();
	    //System.setProperty("webdriver.gecko.marionette","/home/sahil.kadia/Downloads/geckodriver-v0.33.0-linux-aarch64.tar.gz");
	    //this.driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		System.out.println("open");
	}


		@Test(priority = 2)
		public void getTitle() {
			
			String s1 = this.driver.getTitle();
			System.out.println("Get titile:"+s1);
		}

	@Test(priority = 3)
	public void closebrowser() {
		System.out.println("close");
		this.driver.close();

	}


}
