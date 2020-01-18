Feature: hook in cucumber

Scenario: Add New Customer
Given user is on add customer page
When user fills the customer details
Then customer is added

Scenario: Edit Customer
Given user is on add customer page
When user edit contact details
Then contact details updated

Scenario: Delete customer
Given user is on delete customer page
When user delete customer
Then customer deleted