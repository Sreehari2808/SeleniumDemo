package com.stepdefinition;

import java.io.IOException;
import com.baseClass.LibraryClass_orangehrmProject;
import com.pages.OHRMproejctLogin;
import com.seleniumutility.OrangeHRMProjectUtility;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definition_Login extends LibraryClass_orangehrmProject {
 
  OHRMproejctLogin login;

  OrangeHRMProjectUtility  util;
    
	@Given("^launch the broswer and enter the url$")
	public void launch_the_broswer_and_enter_the_url() throws IOException {
    	
    	launchApp();
	   	}
	
	@When("^login page is opened$")
	public void login_page_is_opened()  {
	    
		util = new OrangeHRMProjectUtility(driver);
		util.takeSnapShot("F:\\APPU\\eclipse\\CucumberHybridProeject\\src\\test\\resources\\ScreenShot\\OHRM_Login.png");
		
		
	}
	
	@Then("^enter the \"([^\"]*)\" and \"([^\\\"]*)\"$")
	public void enter_the_username_and_password(String username1, String password1) {
		login = new  OHRMproejctLogin(driver);
		login.orangehrm_username(username1);
		login.orangehrm_password(password1);
	}
	

	@Then("^click the login button$")
	public void click_the_login_button()  {
	login = new  OHRMproejctLogin(driver);
	   login.orangehrm_loginbtn();
	}

	
}
