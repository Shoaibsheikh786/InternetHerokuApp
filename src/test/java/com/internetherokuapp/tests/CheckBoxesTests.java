package com.internetherokuapp.tests;

import org.testng.annotations.Test;

import com.Interherokuapp.base.SetUp;
import com.internetherokuapp.pages.CheckBoxesPage;

public class CheckBoxesTests extends SetUp {
	
	CheckBoxesPage cbPage;
	//k - u
	
	//#1. Verify that CheckBoxes link is working 
	//#2. Verify that CheckBoxes page container two checkboxes
	//#3. Verify that CheckBox 2 is selected
	//#4. Verify that we Can select all CheckBoxes
	//#5. Verify that Checkboxes have the value checkbox1 and checbox 2
	
	CheckBoxesTests()
	{    
		initilization();
		cbPage=new CheckBoxesPage(driver);
	}
	@Test
	public void verifyCheckBoxlink()
	{
		cbPage.clickOnCheckBoxes();
	}
	

}

