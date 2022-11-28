package com.bdd.pages;

import org.openqa.selenium.By;

import com.bdd.stepdefinition.TestExecutor;

public class HomePage extends TestExecutor{
		
		public static By laptopmenu = By.xpath("//a[text()='Laptops']");
		public static By firstProduct = By.xpath("(//a[@class='hrefch'])[1]");
		public static By loginlink = By.id("login2");
		public  static By Username =  By.id("loginusername");
		public static By Password = By.id("loginpassword");
		public static By loginButton = By.xpath("//button[text()='Log in']");
		public static By logoutButton = By.id("logout2");
		
		
		public void clickLaptopMenu() throws InterruptedException
		{
			com.clickElement(laptopmenu);
		}
		
		public void clickFirstProduct() throws InterruptedException
		{
			com.clickElement(firstProduct);
		}
		
		public void clickLogin () throws InterruptedException
		{
			com.clickElement(loginlink);
		}
       
		public void sendUsername(String usname)
		
		{
			com.sendValue(Username, usname);
		}
		
		public void sendPassword(String pass)
		{
			com.sendValue(Password, pass);
		}
		
		public void clickLoginButton() throws InterruptedException
		{
			com.clickElement(loginButton);
		}
		
		public void clickLogout () throws InterruptedException
		{
			com.clickElement(logoutButton);
		}
	}

 