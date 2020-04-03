package com.stepdefinition;

import java.io.IOException;

import com.baseClass.LibraryClass_orangehrmProject;
import com.pages.OHRMproejctLogin;
import com.pages.OHRMproject_Directory;
import com.seleniumutility.OrangeHRMProjectUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Directory extends LibraryClass_orangehrmProject{
	
	OrangeHRMProjectUtility  util;
	OHRMproject_Directory directory;
	OHRMproejctLogin login;

	@Given("^launch the orangehrm appliction$")
	public void launch_the_orangehrm_appliction() throws IOException  {
		
    launchApp();
	}

	@Then("^click on the Directory$")
	public void click_on_the_Directory() {

		login = new OHRMproejctLogin(driver);
	    login.orangehrm_username("Admin");
	    login.orangehrm_password("admin123");
	    login.orangehrm_loginbtn();
	    
		directory = new OHRMproject_Directory(driver);
		directory.To_clickDirectorymenu();
		
	}

	@Then("^search with name and click seach button$")
	public void search_with_name_and_click_seach_button()  {
		directory = new OHRMproject_Directory(driver);
		directory.to_click_search("John Smith");
		
	    util = new OrangeHRMProjectUtility(driver);
	    util.takeSnapShot("F:\\APPU\\eclipse\\CucumberHybridProeject\\src\\test\\resources\\ScreenShot\\DirectorySearch.png");
	}
}
