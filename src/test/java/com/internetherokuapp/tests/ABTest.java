package com.internetherokuapp.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Interherokuapp.base.SetUp;
import com.internetherokuapp.pages.ABTestPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;

public class ABTest extends SetUp{
	
	//1. Test @Test
	ABTestPage abPage;
	ABTest()
	{   
		super();  //read --> browser_val=chrome, url--> internethel
		initilization(); // opend chrome url,
		abPage=new ABTestPage(driver);
		abPage.clickOnAbTestLink();
	}
	
	
	//verify that the header of AbTest page is "A/B Test Control"
	@Epic("Ep001")
	@Feature("Index page")
	@Test
	public void validateHeader()
	{
	   
	   String act=abPage.getHeader();
	   act=act.substring(0, 8);
	//   System.out.println("Act --> "+act);
	   Assert.assertEquals(act,"A/B Test");
	   Assert.assertTrue(false);
		  
	}
	
	//2.verify that the paragraph on AbTest page starts with "Also known as split testing"
	@Epic("Ep002")
	@Feature("Login")
	@Test
	public void verifyParaStartsWithText()
	{
	//	Assert.assertEquals(abPage.getp, "Also known as split testing");
		
		String exp="Also known as split testing";
		String act=abPage.getPara();
		boolean b=act.startsWith(exp);
		Assert.assertTrue(b);
	}
	
	
	//3. verify that the paragraph on AbTest page ends  with "as a click-through)."
	@Epic("Ep001")
	@Feature("Featrue 2")
	@Owner("Jhon")
	@Test
	public void verifyParaEndsWith()
	{
		String exp="as a click-through).";
		String act=abPage.getPara(); // act=full paragrph
		
	//	 abPage.getPara().substring(0, 10);
		boolean b=act.endsWith(exp);
		Assert.assertTrue(b);
		Reporter.log("Paragraph has the particular text");
	//	Assert.assertEquals(true, b);
		
	//	Assert.assertEquals(exp, abPage.getPara());
	}
	
	
	//4 . verify that Abtestpage has  Elemental Selenium button
	@Epic("Ep002")
	@Feature("Index Page")
	@Description("i am validating button here")
	@Owner("Jack")
	@Test
	public void verifyEleSeleniumBtnIsPres()
	{
		boolean b=abPage.eleBtnPresent();
		Assert.assertTrue(b);
		Reporter.log("Element Selenium Button is Present");
		  
	}
	
	

}
