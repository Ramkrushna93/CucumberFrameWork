# tags in cucumber means how grouping our testcases
Feature: Tags in cucumber

@sanityTest
Scenario: Verify login
Given This is valid login test

@SanityTest @End2End
Scenario: Verify logout
Given this is logout test

@RegrassionTest
Scenario: Verify search
Given this is a search test

@RegrassionTest @End2End
Scenario: Verify Advance search
Given this is a advance search test

@End2End
Scenario: Verify prepaid recharge
Given this is a prepaid recharge test

@End2End
Scenario: Verify postpaid recharge
Given this is a postpaid recharge test
 
