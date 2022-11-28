package com.bdd.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.pages.HomePage;
import com.bdd.pages.ProductPage;
import com.bdd.utility.Common;

public class TestExecutor {

	public static WebDriver driver;
	
	
	public static Common com = new Common();
	
	public static HomePage hmpg = new HomePage();
	
	public static ProductPage propg = new ProductPage();
	
			
	
	
	public void launchBrowser() throws IOException
	
	{
		File f = new File("C:\\Users\\sadam\\eclipse-workspace\\NovBDD\\src\\test\\java\\com\\bdd\\envoirmentdetails\\config.properties");
		
		FileInputStream fls = new FileInputStream(f);
		
		Properties prop = new Properties();
		
	    prop.load(fls);	
	    
	    String appurl = prop.getProperty("URL");
	    
	    System.out.println(appurl);
				

		driver.get(appurl);
	}
	
}


	

