package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.LibraryClass;
import com.pages.OrangehrmLogin;
import com.pages.OrangehrmPerformance;
import com.utility.orangehrmutility;



public class OrangehrmperfTestcase  extends LibraryClass{
	
	OrangehrmLogin loginpage;
	orangehrmutility util;
	OrangehrmPerformance performpage;
	
	@BeforeClass
	public void starting() throws IOException {
		launchApp();
	}

	@Test
	public void perfomclick() {
		//OrangehrmLogin performpage = new OrangehrmLogin(driver);
		
		loginpage = new OrangehrmLogin(driver); 
		OrangehrmLogin logpage = new OrangehrmLogin(driver);
		logpage.orangehrm_username("Admin");
		logpage.orangehrm_password("admin123");
		logpage.orangehrm_loginbtn();
	
		performpage = new  OrangehrmPerformance(driver);
		performpage.performance();
	}
	
	 @AfterClass
	  public void closeApp() {
		 util = new orangehrmutility(driver);
		  util.takeSnapShot("F:\\APPU\\eclipse\\orangehrmdemo\\src\\test\\resources\\Screenshot\\performencpage.png");
		  quit();
	  }
}
