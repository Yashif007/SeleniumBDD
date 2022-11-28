package com.bdd.pages;

import org.openqa.selenium.By;

import com.bdd.stepdefinition.TestExecutor;

public class ProductPage extends TestExecutor {
	
	public static By AddToCartButton = By.xpath("//a[text()='Add to cart']");
	
	
	public void clickAddToCartButton() throws InterruptedException
	{
		com.clickElement(AddToCartButton);
	}

	public void validateSucessmsg(String expectedText) throws InterruptedException
	{
		String actualText = com.RetrieveTextFromAlert();
		
		if(expectedText.equalsIgnoreCase(actualText))
		{
			System.out.println("Product added sucessfully");
			com.AlertOk();
		}
		
		else
		{
			System.out.println("Product not added");
			
		}
		
	}
	

}
