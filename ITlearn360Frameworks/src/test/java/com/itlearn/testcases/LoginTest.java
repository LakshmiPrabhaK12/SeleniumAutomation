package com.itlearn.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.LoginPage;
import com.itlearn.utility.ReadExcelFile;

public class LoginTest extends BaseTest {
	
	
	
	@Test
	public void verifyLogin(String userEmail,String userPwd) 
	{
		LoginPage lp=new LoginPage(driver);
		String username ="Demo12";
		String password ="Test123456$";
		lp.loginToPortal(username, password);
	}
		
//		if(username.equals("Demo12") && password.equals("Test123456$"))
//		{
//			System.out.println("Test Passed");
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			captureScreenShot(driver,"VerifyLogin");
//			Assert.assertTrue(false);
		

		
	}

