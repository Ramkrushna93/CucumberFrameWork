Feature: Customers

Scenario: Add new Customer
    Given User Lunch Chrome Browser
    When User open the url "https://admin-demo.nopcommerce.com/login"
    And User Enter Username  "admin@yourstore.com" and Password  "admin"
    And Click on Login
    Then User can view Deshboad
    When User click on customers menu
    And Click on customers menu item
    And Click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And Click on save button
    Then User can view confimation massage ""
    And close browser
     