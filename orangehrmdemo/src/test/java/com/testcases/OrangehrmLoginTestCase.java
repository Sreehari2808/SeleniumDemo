package com.testcases;



import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.LibraryClass;
import com.excelutility.ExcelLogin;
import com.pages.OrangehrmLogin;
import com.utility.orangehrmutility;

public class OrangehrmLoginTestCase extends LibraryClass {
	
	@BeforeClass
	public void start() throws IOException  {
		launchApp();
		
	}
	
	@Test
	public void login() throws IOException {
		OrangehrmLogin logpage = new OrangehrmLogin(driver);
		 ExcelLogin loginexcel = new  ExcelLogin();
		 loginexcel.excel_username(0);
		 loginexcel.excel_passowrd(0);
		 
		//logpage.orangehrm_username("Admin");
		// logpage.orangehrm_password("admin123");
		logpage.orangehrm_loginbtn();
	}
	
	 @AfterClass
	  public void closeApp() {
		 orangehrmutility util = new orangehrmutility(driver);
		  util.takeSnapShot("F:\\APPU\\eclipse\\orangehrmdemo\\src\\test\\resources\\Screenshot\\Orangehrmlogin.png");
		  quit();
	  }


}
