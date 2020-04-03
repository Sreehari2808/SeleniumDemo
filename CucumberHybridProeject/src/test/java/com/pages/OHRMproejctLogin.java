package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMproejctLogin {
	
	Logger LOG = Logger.getLogger( OHRMproejctLogin.class.getName());
	 WebDriver driver;
	By username1 = By.id("txtUsername");
	By password1 = By.id("txtPassword");
	By Loginbutton = By.xpath("//*[@id='btnLogin']");
	

	
	public OHRMproejctLogin(WebDriver driver) 
	{
		this.driver =driver;
	}

	//Enter username
	public void orangehrm_username(String username) {

		driver.findElement(username1).sendKeys(username);
		LOG.info("Entered Name in the UserName field ");
	}
	
	//Entering the password
	public void orangehrm_password(String password) {
		driver.findElement(password1).sendKeys(password);
		LOG.info("Enterd password in tbe Password field");
	}
	
	//click the login button
	public void orangehrm_loginbtn() {
		driver.findElement(Loginbutton).click();
		LOG.info("Login Button is Clicked");
	}
	

}
