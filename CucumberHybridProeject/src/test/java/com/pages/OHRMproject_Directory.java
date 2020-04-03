package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMproject_Directory {

	WebDriver driver;
	By direct = By.xpath("//*[@id='menu_directory_viewDirectory']");
	By searchdirectory = By.xpath("//*[@id='searchDirectory_emp_name_empName']");
	By searchbutton = By.xpath("//*[@id='searchBtn']");
	Logger LOG =  Logger.getLogger(OHRMproject_Directory.class.getName());
	
	public OHRMproject_Directory(WebDriver driver) {
		 this.driver= driver;
	}
	
	//click the Driectory menu
	public void To_clickDirectorymenu() {
		
		driver.findElement(direct).click();
		LOG.info("Directory is clicked");
	}
	
	//Searching and click on search button
	public void to_click_search(String name) {
		driver.findElement(searchdirectory).sendKeys(name);
		LOG.info("Name is entered in the text box ");
		driver.findElement(searchbutton).click();
		LOG.info("Search button is clicked");
	}
	
}
