package com.bdd.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hooks extends TestExecutor
{
	
	@Before(order=2)
	public void launchBrowser() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadam\\eclipse-workspace\\NovBDD\\exe\\chromedriver.exe");
		
	   driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@Before(order=1)
	public void preCondition()
	{
		System.out.println("Precondition 1");
	}

}
