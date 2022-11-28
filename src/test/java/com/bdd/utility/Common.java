package com.bdd.utility;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinition.TestExecutor;

public class Common extends TestExecutor{
		
		
		public void clickElement(By loc) throws InterruptedException
		{
			Thread.sleep(5000);
			WebElement ele = driver.findElement(loc);
			ele.click();
		}
		
		
		public void sendValue(By loc,String value)
		{
			WebElement ele = driver.findElement(loc);
			ele.click();
			ele.clear();
			ele.sendKeys(value);
		}

		public void AlertOk()
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		
		public String RetrieveTextFromAlert() throws InterruptedException
		{
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
		String alertText =	alert.getText();
		return alertText;
		}
	}

