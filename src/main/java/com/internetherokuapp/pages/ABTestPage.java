package com.internetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Interherokuapp.base.SetUp;

public class ABTestPage extends SetUp {
	
	//1. Find the WebElements:->  @FindBy(..):-> Private
	//2. Actions : -> clickOn: public 
	//3. Constructors --> driver public
	public ABTestPage(WebDriver driver)
	{
	 PageFactory.initElements(driver, this)	;
	}
	
	@FindBy(xpath="//a[text()='A/B Testing']")
	private WebElement abTestLink;
	
	public void clickOnAbTestLink()
	{
		abTestLink.click();
	}
}
