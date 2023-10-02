package com.sauceDemo.TestLayer;

import org.testng.annotations.Test;

import com.sauceDemo.PageLayer.LoginPage;
import com.sauceDemo.testBase.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void loginTestWithValidCredential()
	{
		LoginPage login = new LoginPage (driver);
		 login.enterUsername("standard_user");
		 login.enterPassword("secret_sauce");
		 login.clickOnLoginButton();
	}
}
