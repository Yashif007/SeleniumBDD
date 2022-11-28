package com.bdd.stepdefinition;

import cucumber.api.java.en.When;

public class Login extends TestExecutor{


@When("User clicks login link")
public void user_clicks_login_link() throws InterruptedException {
	hmpg.clickLogin();
}

@When("User enter value {string} in username textbox")
public void user_enter_value_in_username_textbox(String usname) {
    hmpg.sendUsername(usname);
}

@When("User enter value {string} in password textbox")
public void user_enter_value_in_password_textbox(String pass) {
   hmpg.sendPassword(pass);
}

@When("User clicks loginbutton")
public void user_clicks_loginbutton() throws InterruptedException {
    hmpg.clickLoginButton();
}
@When("User clicks logoutbutton")
public void user_clicks_logoutbutton() throws InterruptedException {
   hmpg.clickLogout();

}
}