@testAll
Feature: Sign in Page

@createAccount
Scenario: Verify user can create an account into Retail Website
	Given User is on retail website
	When User clicks on sign in option
	And User clicks on Create New Account button
	And User fills the sign up information with 'Flowerb' and 'flower10@tekschool.us' and 'Tekflower123!' and 'Tekflower123!'
	And User click on sign up button
	Then User should be logged into account page

@signIn
Scenario: Verify user can sign in into retail application
	Given User is on retail website
	When User clicks on sign in option
	And User enters email 'flower2@tekschool.us' and password 'Tekflower123!'
	And User clicks on login button
	Then User should be logged into account page
	