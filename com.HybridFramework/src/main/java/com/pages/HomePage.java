package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div[1]/div/div[1]")
	private WebElement sel;
	
	@FindBy(xpath = "//div[2]/div/div[1]")
	private WebElement java;
	
	@FindBy(xpath = "//div[3]/div/div[1]")
	private WebElement python;
	
	@FindBy(xpath = "//div[4]/div/div[1]")
	private WebElement php;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void homepageApplication(){
		sel.getText();
		java.getText();
		python.getText();
		php.getText();
		
		
	}
}