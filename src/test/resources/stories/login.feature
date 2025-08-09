Feature: Login

Scenario: Successful login with valid credentials
  Given User open chrome browser
  When User launch url
  And User click on MyAccount
  And User click on Login
  And User enter email Id 'aditya1889@gmail.com'
  And User enter Password 'adi123'
  And User click on Login button
  Then Page Tile should be displayed as 'My Account'
