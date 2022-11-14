Feature: Home page funtionlity
  
  Background: user is logged in
  Given user is in login page
  When user enter username and password
  And user clickon login button
  Then user is navagited to home page
  
  Scenario: check logout credintial

  When user click on Welcome
  Then user clic on logout
  
  Scenario: verify quick launch toolbar
  
  When user click on dasebord 
  Then quick launch toolbar is displayed
