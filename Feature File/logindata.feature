Feature: login Fuctionality
Scenario: login with test data
Given user at login page  
When user enter username "testuser"
And user enter passeord "tetspass"
And user click on login 
Then user redirect to home page
 

