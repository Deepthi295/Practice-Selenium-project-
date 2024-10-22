@tag
Feature: Create a Facebook account 

Background:
 Given Open the Chrome browser
 When the user navigates to the URL "https://www.facebook.com/"
 And User need to click on Create  New account 
 
 
  @tag1
  Scenario: Verify that user is able to create the facebook account 
 
    When User enters the valid  firstName as "deepthi"
    When user enters the valid lastName as "padige"
    When user eneters the valid mobile number as "9849434481"
    When user enter the new password    "789deep"
    Then user select the date of birth "09021995"
    Then user click on the gender as "female"
    Then click on the sigup 
  
 