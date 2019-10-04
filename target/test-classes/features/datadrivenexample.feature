Feature: Test login

Scenario: Login with different data set
Scenario Outline: login with examples
Given user is at login page
When user enters user_name "<username>"
And user enters pass_word "<password>"
And user clicks signin button
Then login is successful and page title contains "<title>"

Examples:
	|username|password|title|
	|batman|batman|Find a Flight: Mercury Tours:|
	|superman|batman|Sign-on: Mercury Tours|