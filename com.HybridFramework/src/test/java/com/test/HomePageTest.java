package com.test;

import org.testng.annotations.BeforeSuite;

import com.base.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;

public class HomePageTest extends BaseClass {
	
	HomePage hp = null;
	@BeforeSuite
	public void setup() throws Exception {
		initialization();
		hp = new HomePage(driver);
	}

}
