package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.LibraryClass;
import com.pages.OrangehrmLeave;
import com.pages.OrangehrmLogin;
import com.utility.orangehrmutility;

public class OrangehrmLeaveTestcase extends LibraryClass{
	OrangehrmLogin loginpage;
	
	@BeforeClass
	public void starting() throws IOException {
		launchApp();
	}
	
	@Test
	public void leavemenuclick() {
		loginpage = new OrangehrmLogin(driver); 
		OrangehrmLogin logpage = new OrangehrmLogin(driver);
		logpage.orangehrm_username("Admin");
		logpage.orangehrm_password("admin123");
		logpage.orangehrm_loginbtn();
		OrangehrmLeave leavemenu = new OrangehrmLeave(driver);
		leavemenu.leavemenu();
		
	}
	
	 @AfterClass
	  public void quit() {
		 orangehrmutility util = new orangehrmutility(driver);
		  util.takeSnapShot("F:\\APPU\\eclipse\\hybrid_framework\\src\\test\\resources\\Screenshot\\Leave.png");
		  quit();
	  }

}
