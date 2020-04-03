package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMproject_jobtitle {
	
	WebDriver driver;
	By Admin = By.xpath("//*[@id='menu_admin_viewAdminModule']");
	By jobs = By.xpath("//*[@id='menu_admin_Job']");
	By jtitle = By.xpath("//*[@id='menu_admin_viewJobTitleList']");
	By addbutton = By.xpath("//*[@id='btnAdd']");
	By jobtext= By.id("jobTitle_jobTitle");
	By savebtn = By.xpath("//*[@id='btnSave']");
	Logger LOG = Logger.getLogger(OHRMproject_jobtitle.class.getName());
	OHRMproejctLogin login;
	
	public OHRMproject_jobtitle(WebDriver driver) {
		this.driver=driver;
	}
	
	//To click the admin menu
	public void Adminclick() {
				
		driver.findElement(Admin).click();
		LOG.info(" Admin in clicked");
	
	}
			
	//To click the jobtitle in the job menu 
	public void jobtitle() {
		driver.findElement(jobs).click();
		
		driver.findElement(jtitle).click();
		LOG.info("Job Title is clicked");
	
	}
	
	//To click on add 
	public void addbtn() {
		driver.findElement(addbutton).click();
		LOG.info("Add button is clicked");
		
	}
	
	//To fill the details and save
	public void adddetails() {
		driver.findElement(jobtext).sendKeys("Programmer Analyst Trainee (PAT)");
		LOG.info("Details are filled");
		driver.findElement(savebtn).click();
		LOG.info("Save Button is clicked");
	}
	
	

}
