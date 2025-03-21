package com.internetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage {
	
	@FindBy(xpath="//a[text()='Checkboxes']")
	private WebElement checkBoxesLink;
	
	public void clickOnCheckBoxes()
	{
		checkBoxesLink.click();
	}
	public  CheckBoxesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
