Feature: Order

Scenario: Add item to the cart
  Given User has logged In
  When User click on search bar
  And User enter 'Iphone'
  And User click on search button
  And User click on Iphone
  Then User click on Add to Cart button