package com.seleniumutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseClass.LibraryClass_orangehrmProject;

public class OrangeHRMProjectUtility extends LibraryClass_orangehrmProject {

	WebDriver driver;
	WebDriverWait wait;
	By Loginbutton = By.xpath("//*[@id='btnLogin']");
	
	//constructor
	public OrangeHRMProjectUtility(WebDriver driver) 
	{
		this.driver =driver;
	}
	
	//to get the title
	public void gettitle() {
		System.out.println("Title of the page "+ driver.getTitle());
	}
	
	//explicit wait
	public void Explicit_wait() {
		WebDriverWait wait =  new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Loginbutton)));
		
	}
	//to take screenshot
	public void takeSnapShot(String path1) 
	{

		TakesScreenshot screenshot = (TakesScreenshot)driver;
        File Source = screenshot.getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(Source, new File(path1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
