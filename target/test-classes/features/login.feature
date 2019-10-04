Feature: Test Login

Scenario: Login with valid data
Given User is at login page
When user enters username
And user enters password
And user clicks login button
Then login is successful and homepage is displayed

Scenario: Login with valid data
Given User is at login page
When user enters username "batman"
And user enters password "batman"
And user clicks login button
Then login is successful and homepage is displayed