package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	LoginPage lp = null;
	@BeforeSuite
	public void setup() throws Exception {
		initialization();
		lp = new LoginPage(driver);
	}
	@Test
	public void test01() {
		
		lp.loginToApplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

}
