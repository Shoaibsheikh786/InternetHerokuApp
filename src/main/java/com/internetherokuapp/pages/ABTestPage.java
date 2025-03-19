package com.internetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Interherokuapp.base.SetUp;
import com.project.utils.EleInt;

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
	   
	//	abTestLink.click();
		EleInt.Myclick(abTestLink);
	}
	
	
	//HEADER
	@FindBy(xpath="//div[@class='example']/h3")
	private WebElement header;
	
	public String getHeader()
	{
		return header.getText();
	}
	
	//PARAGRAPH
	
	@FindBy(xpath="//h3[text()='A/B Test Control']/following-sibling::p")
	private WebElement paragraph;
	
	public String getPara()
	{
		return paragraph.getText();
	}
	
	//ELEMENTAL SELENIUM
	@FindBy(xpath="//a[text()='Elemental Selenium']")
	private WebElement eleSeleniumBtn;
	public boolean eleBtnPresent()
	{
		return eleSeleniumBtn.isDisplayed();
	}
	
	
	
}
