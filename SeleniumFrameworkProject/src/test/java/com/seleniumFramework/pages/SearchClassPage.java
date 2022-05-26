package com.seleniumFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchClassPage {
	WebDriver driver;
	
	public SearchClassPage(WebDriver IDriver)
	{
		this.driver=IDriver;
	}
	 
	@FindBy(id="search_course") WebElement searchTab;
	
	public void searchMethod(String searchData)
	{
		searchTab.sendKeys(searchData);
		
	}

}
