package com.Interherokuapp.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Interherokuapp.waits.Waits;

public class SetUp {
	
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static String browser;
	public static String url;
	public static WebDriver driver;
	
	public SetUp()
	{
		file=new File("./Config/config.properties");
		try {
			fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}	
	     catch (IOException e) {
			e.printStackTrace();
		}
		browser=prop.getProperty("browser");
		url=prop.getProperty("url");
			
	}
	
	//logic-> to take decision which browser we want to open
	public void initilization()
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Browser Not Found");
			return;
		}
		
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Waits.PAGE_LOAD_TIME));
	    driver.manage().window().maximize();
	}
	


}
