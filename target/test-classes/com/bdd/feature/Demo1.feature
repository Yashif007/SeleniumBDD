
Feature: DemoBlaze

   Scenario: Add product to cart
 
    Then User validate the 
    Scenario: Login  functionaltity
    
     Given User launches the chromebrowser and open the URL "https://www.demoblaze.com"
     When User clicks Laptop menu
     And User clicks the first product
     And User clicks the Addto cart button alertbox woth text "Product added"
     Then User validate the alertbox with text "Product added"
     
     Scenario Outline : Login  with multiple data
    
     Given User launches the chromebrowser and open the URL "https://www.demoblaze.com"
     When User clicks login link
     And User enter value "<Username>" in username textbox
     And User enter value "<Password>" in password textbox
     And User clicks loginbutton
     And User clicks logoutbutton
     
     Examples :
     
     | Username | Password |
     | yashif1 | 123 |
     | yashif2 | 123 |
     | yashif3 | 123 |