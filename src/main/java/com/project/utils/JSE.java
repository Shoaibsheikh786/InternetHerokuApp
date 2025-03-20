package com.project.utils;

import org.openqa.selenium.JavascriptExecutor;

import com.Interherokuapp.base.SetUp;

public class JSE extends SetUp {
	
	//scroll a page vartically till x unit 
	 //y=300
	public static void scrollPageVertically(int y)
	{ 
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+y+");");
		
		
	}
	
	public static void scrollPageHorizontally(int x)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+",0);");
	}
	
	
	//more methods --> to scroll page --> x, y , actionsCasll
	

	
	
	
	

}
