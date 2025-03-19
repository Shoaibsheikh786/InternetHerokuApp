package com.project.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dd {
	
	public static Select sel;
	
	public static void selectByText(WebElement ele, String text)
	{
		sel=new Select(ele);
		sel.selectByVisibleText(text);
		
	}
	
	//select By index
	
	public static void selectByIndex(WebElement ele,int index)
	{
		sel=new Select(ele);
		sel.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement ele, String val)
	{
		sel=new Select(ele);
		sel.selectByValue(val);
	}
  
	//
	

}
