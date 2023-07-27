Feature:  home page fun
Scenario: verify title 
Given user at home page
Then validate title

Scenario: verify signin icon
Given user at home page
Then user see the signin icon

Scenario: verify search flight
Given  user at home page
When user enter to city "ottawa"
And  user click on departure button
And  user select the date 
And user click on search flight 




