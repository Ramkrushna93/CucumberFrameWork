Feature: Login

Scenario: Sucessfully Login With Valid Credantials
 Given User Lunch Chrome Browser
 When User open the url "https://admin-demo.nopcommerce.com/login"
 And User Enter Username  "admin@yourstore.com" and Password  "admin"
 And Click on Login 
 Then  Page Title Should "Dashboard / nopCommerce administration"
 When User Click on Logout link
 Then Page Title Should "Your store. Login"
 And Close browser
 
 