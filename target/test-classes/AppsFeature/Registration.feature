Feature: User Registration

Scenario: User registration with different data

Given User is on registration page
When User enters the following user details
      | naveen | automation | naveen@gmail.com | 9999 | Banglore |
      | Ram | Automation | ram@yahoo.com | 999999 |Coimbatore |
Then User registration should be successfull

Scenario: User registration with different data with another coloumn

Given User is on registration page
When User enters the following user details with coumns
			| firstname | lastname | email | phone | city | 
      | naveen | automation | naveen@gmail.com | 9999 | Banglore |
      | Ram | Automation | ram@yahoo.com | 999999 |Coimbatore |
Then User registration should be successfull