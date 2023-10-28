Feature: Login Feature

Scenario Outline: Login Fail -Possible Combinations

Given user is on Application Landing page 
When User clicks on Sign button
Then User is displayed on Login screen
When User enters "<UserName>" in username field
When User enters "<Password>" in password field
And User clicks on Sign button
Then User gets login failed error message 


Examples:

	| UserName | Password | 
	| incorrect UN | 12345 |
	| ramAutomation | incorrect password |
