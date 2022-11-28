
Feature: DemoBlaze  
  
 Background:
     Given User launches the chromebrowser and open the URL "https://www.demoblaze.com"
     When User clicks login link
 
  Scenario Outline: Login  with multiple data
  
     And User enter value "<Username>" in username textbox
     And User enter value "<Password>" in password textbox
     And User clicks loginbutton
     And User clicks logoutbutton
     
    Examples: 
     | Username | Password |
     | yashif1 | 123 |
     | yashif2 | 123 |
     | yashif3 | 123 |
     
  Scenario:  Validate new user
  
  And User wishlist page
  And User product validate