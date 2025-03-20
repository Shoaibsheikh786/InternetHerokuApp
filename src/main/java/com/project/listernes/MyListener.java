package com.project.listernes;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Interherokuapp.base.SetUp;

public class MyListener extends SetUp implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		tkScrnShot();
	}
	
	public void tkScrnShot()
	{    
		  LocalTime myObj = LocalTime.now();
		 String str=   myObj.toString();
		 String str2=str.replace(":","");
		 
		String str3= str2.replace(".", "");
		
		String st=str3.substring(9);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File file=tk.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File("./Screenshots/Scr"+st+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
