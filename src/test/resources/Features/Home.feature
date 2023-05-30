Feature: Retail Home Page

Background:
	Given User is on retail website
	When User clicks on sign in option
	And User enters email 'flower2@tekschool.us' and password 'Tekflower123!'
	And User clicks on login button
	Then User should be logged into account page
	
@shopByDepartment
Scenario: Verify Shop by Department sidebar
	When User click on All section
	Then below options are present in Shop by Department sidebar
	|Electronics|Computers|Smart Home|Sports|Automative|

@departmentOptions
Scenario Outline: Verify department sidebar options
	When User click on All section
	And User on <department>
	Then below options are present in department
	|<optionOne>|<optionTwo>|

Examples:
|department|optionOne|optionTwo|
|'Electronics'|TV & Video|Video Games|
|'Computers'|Accessories|Networking|
|'Smart Home'|Smart Home Lightning|Plugs and Outlets|
|'Sports'|Athletic Clothing|Exercise & Fitness|
|'Automotive'|Automative Parts & Accessories|MotorCycle & Powersports|

