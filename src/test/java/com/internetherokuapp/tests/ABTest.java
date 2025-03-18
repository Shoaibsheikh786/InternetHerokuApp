package com.internetherokuapp.tests;

import org.testng.annotations.Test;

import com.Interherokuapp.base.SetUp;
import com.internetherokuapp.pages.ABTestPage;

public class ABTest extends SetUp{
	
	//1. Test @Test
	ABTestPage abPage;
	ABTest()
	{   
		super();  //read --> browser_val=chrome, url--> internethel
		initilization(); // opend chrome url,
		abPage=new ABTestPage(driver);
	}
	
	@Test
	public void demoTest()
	{
	abPage.clickOnAbTestLink();
		  
	}

}
