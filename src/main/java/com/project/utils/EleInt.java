package com.project.utils;

import org.openqa.selenium.WebElement;

public class EleInt{
	//click
	//clear
	//getText
	
	public static void Myclick(WebElement ele) //ele --> //a[text()='A/B Testing']
	{
		//ele.click();
		if(ele!=null)
		{  
		//	System.out.println("Element clicked");
			ele.click();
		}
	}
	
	public static void Myclear(WebElement ele)
	{
		if(ele!=null)
		{
			ele.clear();
		}
	}

}
