@All
Feature: Uber Booking feature

@Smoke
Scenario:Booking Cab Sedan

Given User wants to select the car type "Sedan" from uber application
When User selects the car "Sedan" and pickup point at "Banglore" and drop location "Chennai"
Then driver starts the journey 
And driver ends the journey
Then User pays 1000 USD 

@Regression
Scenario:Booking Cab Sedan

Given User wants to select the car type "SUV" from uber application
When User selects the car "Sedan" and pickup point at "Chennai" and drop location "Coimbatore"
Then driver starts the journey 
And driver ends the journey
Then User pays 1000 USD 

@Smoke
Scenario:Booking Cab Sedan

Given User wants to select the car type "MINI" from uber application
When User selects the car "Sedan" and pickup point at "Coimbatore" and drop location "Trissur"
Then driver starts the journey 
And driver ends the journey
Then User pays 1000 USD 
@Smoke
Scenario:Booking Cab Sedan

Given User wants to select the car type "Sedan" from uber application
When User selects the car "Sedan" and pickup point at "Trissur" and drop location "Rameshwaram"
Then driver starts the journey 
And driver ends the journey
Then User pays 1000 USD 
@Regression
Scenario:Booking Cab Sedan

Given User wants to select the car type "SUVARA" from uber application
When User selects the car "Sedan" and pickup point at "Rameshwaram" and drop location "DhanushKodi"
Then driver starts the journey 
And driver ends the journey
Then User pays 1000 USD 