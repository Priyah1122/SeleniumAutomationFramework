package com.seleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.seleniumFramework.utility.BrowserFactory;
import com.seleniumFramework.utility.ConfigDataProvioders;
import com.seleniumFramework.utility.ExcelDataProvider;

public class BaseClass {
	public WebDriver driver;
	public ConfigDataProvioders config;
	public ExcelDataProvider excel;
	
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel =new ExcelDataProvider();
		config=new ConfigDataProvioders();
		
			
	}

	@BeforeClass
	public void setUp() 
	{
		
		driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getUrl());
	}
	@AfterClass
	public void tierDown() 
	{
		
		BrowserFactory.quitBrowser(driver);
	}
	

}
