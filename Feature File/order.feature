Feature: order fun

Background:
Given user at home page
When user click n oreder

@fun1 
Scenario: previous  order
And user click on previous order button
Then user see previous order
@fun2
Scenario: current order
And user click on current order button
Then user see current order

