Feature: MyAccount-Login Feature
Description: This feature will test a login functionality

  #Simple login without parameter
  #Scenario: Login-with valid username and password
  #Given open browser
  #When Enter the url"http://practice.automationtesting.in/"
  #And Click on My Account Menu
  #And Enter registered username and password
  #And Click on Login Button
  #Then User must be sucessfully Login to the Webpage


  #Simple login without parameter
  #Scenario: Login-with valid username and password
  #Given open browser
  #When Enter the url"http://practice.automationtesting.in/"
  #And Click on My Account Menu
  #And Enter registered username "pavanoltraining" and password "Test@selenium123"
  #And Click on Login Button
  #Then User must be sucessfully Login to the Webpage

# Scenario outline we are using for data driven testcases
  #Scenario Outline: Login-with valid username and password
  #Given open browser
  #When Enter the url"http://practice.automationtesting.in/"
  #And Click on My Account Menu
  #And Enter registered username "<username>" and password "<password>"
  #And Click on Login Button
  #Then verify login

 #Examples:
   #| username            | password          |
   #| pavanoltraining     | Test@selenium      |
   #| pavanol             | selenium123       |
   #| pavanol             | Test@selenium123  |
   
 # Scenario: Login-with valid username and password
 # Given open browser
 # When Enter the url"http://practice.automationtesting.in/"
 # And Click on My Account Menu
 # And Enter registered username and password 
  #| pavanoltraining |  Test@selenium123 |
  
  #And Click on Login Button
  #Then verify login


 Scenario: Login-with valid username and password
  Given open browser
  When Enter the url"http://practice.automationtesting.in/"
  And Click on My Account Menu
  And Enter registered username and password 
  | user            | pwd               |
  | pavanoltraining |  Test@selenium123 |
  
  And Click on Login Button
  Then verify login

