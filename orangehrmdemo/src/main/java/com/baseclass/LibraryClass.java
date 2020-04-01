package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LibraryClass {
	protected WebDriver driver;
	Properties prop;
	 FileInputStream fis;
	 Logger LOG = Logger.getLogger( LibraryClass.class.getName());

	public void launchApp() throws IOException {
		fis =new FileInputStream("F:\\APPU\\eclipse\\orangehrmdemo\\src\\test\\resources\\Configuration Property\\config.property");
		prop =new Properties();
		 prop.load(fis);
		 String browser = prop.getProperty("browser");
		
		 if(browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "F:\\APPU\\Selenium Projects\\Jar files\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
			 LOG.info("Chrome is Launched");
			 
			 
		 }
		 else if (browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
			 LOG.info("FireFox is Launched");
		 }
		
		 driver.manage().window().maximize();
		 LOG.info("Window is Maximized");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
		 LOG.info("URL is entered");
		 

	 
 }
 //To close the application
 public void quit() {
	  driver.close();
  }

	}

