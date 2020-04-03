package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.baseClass.LibraryClass_orangehrmProject;
import com.pages.OHRMproejctLogin;
import com.pages.OHRMproject_jobtitle;
import com.seleniumutility.OrangeHRMProjectUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_jobtitle extends LibraryClass_orangehrmProject {
	
	OHRMproejctLogin login;
	
	OrangeHRMProjectUtility  util;
	OHRMproject_jobtitle  jobtitle;

	@Given("^launch the orangehrm page$")
	public void launch_the_orangehrm_page() throws IOException  {
		
    	launchApp();
	}

	@Then("^click on Admin menu$")
	public void click_on_Admin_menu()   {
		
		login = new OHRMproejctLogin(driver);
	    login.orangehrm_username("Admin");
	    login.orangehrm_password("admin123");
	    login.orangehrm_loginbtn();
	    
		jobtitle = new OHRMproject_jobtitle(driver);
		jobtitle.Adminclick();
	    
	}

	@Then("^click on job title in the job dropdown$")
	public void click_on_job_title_in_the_job_dropdown() {
		
		jobtitle = new OHRMproject_jobtitle(driver);
		jobtitle.jobtitle();
	}

	@Then("^click on add button$")
	public void click_on_add_button()  {
		jobtitle = new OHRMproject_jobtitle(driver);
		jobtitle.addbtn();
	}

	@Then("^fill the details and save$")
	public void fill_the_details_and_save()  {
		jobtitle = new OHRMproject_jobtitle(driver);
		jobtitle.adddetails();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 util = new OrangeHRMProjectUtility(driver);
		 util.takeSnapShot("F:\\APPU\\eclipse\\CucumberHybridProeject\\src\\test\\resources\\ScreenShot\\jobtitle.png");
	}


	
}
