
Feature: Naveen Automation Lab Application feature
  

  Scenario: Search a Product
    Given I have search field on Amazon Page
    When I search for product with name "Mac Book Pro" and price 1000
    Then Product with name "Mac Book Pro" should be displayed

 
