package com.bdd.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoSteps extends TestExecutor{	

		@Given("User launches the browser and open the url")
			public void user_launches_the_browser_and_open_the_url() {
				launchBrowser(appurl);
			}

		

		@When("User clicks the Laptop menu")
		public void user_clicks_the_Laptop_menu() throws InterruptedException {
		  
			hmpg.clickLaptopMenu();
		}

		@When("User clicks the first product")
		public void user_clicks_the_first_product() throws InterruptedException {
			hmpg.clickFirstProduct();
		   
		}

		@When("User clicks the Addto cart button")
		public void user_clicks_the_Addto_cart_button() throws InterruptedException {
			propg.clickAddToCartButton();
		}

		

		@Then("User validate the alertbox woth text {string}")
		public void user_validate_the_alertbox_woth_text(String expectedText) throws InterruptedException {
			
		 propg.validateSucessmsg(expectedText);
		}

}
