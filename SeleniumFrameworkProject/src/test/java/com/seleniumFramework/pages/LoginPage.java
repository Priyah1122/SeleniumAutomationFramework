package com.seleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	//constructor
	public LoginPage(WebDriver lDriver)
	{
		this.driver= lDriver;
	}
	@FindBy(xpath="//*[@id=\"loginlabel\"]")  WebElement loginclick;
	@FindBy(name="log")  WebElement uname;

	@FindBy(name="pwd") WebElement pass;

	@FindBy(name="wp-submit")  WebElement loginButton;
	public void loginToPortal(String userName,String passWord)
	{

		loginclick.click();
		uname.sendKeys(userName);
		pass.sendKeys(passWord);
		loginButton.click();
	}

}
