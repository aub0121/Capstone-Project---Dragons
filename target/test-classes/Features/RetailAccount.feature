Feature: Retail Account Page

Background:
	Given User is on retail website
	When User clicks on sign in option
	And User enters email 'flower2@tekschool.us' and password 'Tekflower123!'
	And User clicks on login button
	Then User should be logged into account page

@updateProfile	
Scenario: Verify user can update profile information
	When User click on Account option
	And User updates name 'Flowerd' and phone '504-687-5309'
	And User clicks on update button
	Then User profile information should be updated

@addPayment
Scenario: Verify user can add a payment method
	When User click on Account option
	And User clicks on add a payment method link
	And User fill Debit or credit card information
	|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
	|10234123412341234|"Flowerd"|6|2026|456|
	And User clicks on add your card button
	Then A message should be displayed 'Payment Method updated successfully'
	
@updatePayment
Scenario: Verify User can edit Debit or Credit card
	When User click on Account option
	And User click on Card
	And User click on Edit option of card section
	And user edit information with below data
	|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
	|9876987698769876|"Flowerabc"|11|2027|456|
	And user click on Update Your Card button
	Then A message should be displayed 'Payment Method updated Successfully'

@removePayment
Scenario: Verify User can remove Debit or Credit card
	When User click on Account option
	And User click on Card
	And User click on remove option of card section
	Then payment details should be removed

@addAddress
Scenario: Verify User can add an Address
	When User click on Account option
	And User click on Add address option
	And user fill new address form with below information
	|country|fullName|phoneNumber|streetAddress|apt|city|state|zipCode|
	|United States|Flowers|7892341234|123 Street|102|Harrisonburg|Virginia|22801|
	And User click Add Your Address button
	Then A message should be displayed 'Address Added Successfully'

@editAddress
Scenario: Verify User can edit an Address added on account
	When User click on Account option
	And User click on edit address option
	And user update address form with below information
	|country|fullName|phoneNumber|streetAddress|apt|city|state|zipCode|
	|United States|Flowers|2342342345|567 street|109|Harrisonburg|Virginia|22123|
	And User click update Your Address button
	Then A message should be displayed 'Address Updated Successfully'

@removeAddress
Scenario: Verify User can remove Address from Account
	When User click on Account option
	And User click on remove option of Address section
	Then Address details should be removed