package tek.capstone.dragons.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.retailAccountPage().acctBttn);
		logger.info("User cliked on account button successfully");
	}
	
	@When("User updates name {string} and phone {string}")
	public void userUpdatesNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.retailAccountPage().nameInput);
		sendText(factory.retailAccountPage().nameInput, name);
		clearTextUsingSendKeys(factory.retailAccountPage().phoneInput);
		sendText(factory.retailAccountPage().phoneInput, phone);
		logger.info("User enetered new name and phone number successfully");
	}
	
	@When("User clicks on update button")
	public void userClicksOnUpdateButton() {
		waitTillPresence(factory.retailAccountPage().updateBttn);
		click(factory.retailAccountPage().updateBttn);
	    logger.info("User clicked on update button successfully");
	}
	
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.retailAccountPage().successMessage);
		Assert.assertTrue(isElementDisplayed(factory.retailAccountPage().successMessage));
		logger.info("User profile information updated successfully");
	}
	
	@When("User clicks on add a payment method link")
	public void userClicksOnAddAPaymentMethodLink() {
	   click(factory.retailAccountPage().addPaymentMethod);
	   logger.info("User clicked on add payment method link successfully");
	}
	
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	   List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
	   sendText(factory.retailAccountPage().cardNumberInput, paymentInfo.get(0).get("cardNumber"));
	   sendText(factory.retailAccountPage().nameOnCardInput, paymentInfo.get(0).get("nameOnCard"));
	   selectByVisibleText(factory.retailAccountPage().expirationMonthInput, paymentInfo.get(0).get("expirationMonth"));
	   selectByVisibleText(factory.retailAccountPage().expirationYearInput, paymentInfo.get(0).get("expirationYear"));
	   sendText(factory.retailAccountPage().securityCodeInput, paymentInfo.get(0).get("securityCode"));
	   logger.info("User entered card information successfully" );
	}
	
	@When("User clicks on add your card button")
	public void userClicksOnAddYourCardButton() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.retailAccountPage().updatePaymentBttn);
		logger.info("User clicked on submit payment button successfully");
	   
	}
	
	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		if(expectedMessage.contains("payment")) {
			waitTillPresence(factory.retailAccountPage().paymentSuccessMessage);
			Assert.assertEquals(expectedMessage, factory.retailAccountPage().paymentSuccessMessage.isDisplayed());
			logger.info(expectedMessage +" is displayed");
	    } else if(expectedMessage.contains("Address")) {
	    	waitTillPresence(factory.retailAccountPage().addressAddedMessage);
	    	Assert.assertEquals(expectedMessage, factory.retailAccountPage().addressAddedMessage.getText());
	    	logger.info(expectedMessage + " is displayed");
	    }
	}
	@Then("message should be displayed {string}")
	public void messageShouldBeDisplayed(String expectedMssg) {
	    waitTillPresence(factory.retailAccountPage().addressUpdatedMessage);
	    Assert.assertEquals(expectedMssg, factory.retailAccountPage().addressUpdatedMessage.getText());
	    logger.info(expectedMssg + " is displayed");
	}
	
	@When("User click on Card")
	public void userClickOnCard() {
	  click(factory.retailAccountPage().clickOnCard);
	  logger.info("User clicked on card to edit successfully");
	}
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() throws InterruptedException {
		Thread.sleep(3000);
		click(factory.retailAccountPage().editPaymentBttn);
		logger.info("User clicked on edit button successfully");
	}
	
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) throws InterruptedException {
		Thread.sleep(3000);
		List<Map<String, String>> updatePaymentInfo = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.retailAccountPage().cardNumberInput);
		sendText(factory.retailAccountPage().cardNumberInput, updatePaymentInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.retailAccountPage().nameOnCardInput);
		sendText(factory.retailAccountPage().nameOnCardInput, updatePaymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.retailAccountPage().expirationMonthInput, updatePaymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.retailAccountPage().expirationYearInput, updatePaymentInfo.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.retailAccountPage().securityCodeInput);
		sendText(factory.retailAccountPage().securityCodeInput, updatePaymentInfo.get(0).get("securityCode"));
		logger.info("User updated card info successfully");
	}
	
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.retailAccountPage().updatePaymentBttn);
		logger.info("User click on update payment button successfully");
	}
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.retailAccountPage().removePaymentBttn);
		logger.info("User clicked on remove card successfully");
	   
	}
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	   //refresh page here
		waitTillPresence(factory.retailAccountPage().assertCardRemoved);
		Assert.assertTrue(isElementDisplayed(factory.retailAccountPage().assertCardRemoved));
		logger.info("Card was removed successfully");
	}
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.retailAccountPage().addAddressbttn);
		logger.info("User clicked on address option succesfully");
	}
	
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
	    selectByVisibleText(factory.retailAccountPage().countryDropdown, addressInfo.get(0).get("country"));
	    clearTextUsingSendKeys(factory.retailAccountPage().fullNameInput);
	    sendText(factory.retailAccountPage().fullNameInput, addressInfo.get(0).get("fullName"));
	    clearTextUsingSendKeys(factory.retailAccountPage().phoneNumberInput);
	    sendText(factory.retailAccountPage().phoneNumberInput, addressInfo.get(0).get("phoneNumber"));
	    clearTextUsingSendKeys(factory.retailAccountPage().StreetInput);
	    sendText(factory.retailAccountPage().StreetInput, addressInfo.get(0).get("streetAddress"));
	    clearTextUsingSendKeys(factory.retailAccountPage().apartmentInput);
	    sendText(factory.retailAccountPage().apartmentInput, addressInfo.get(0).get("apt"));
	    clearTextUsingSendKeys(factory.retailAccountPage().cityInput);
	    sendText(factory.retailAccountPage().cityInput, addressInfo.get(0).get("city"));
	    Thread.sleep(2000);
	    selectByVisibleText(factory.retailAccountPage().stateDropdown, addressInfo.get(0).get("state"));
	    clearTextUsingSendKeys(factory.retailAccountPage().zipCodeInput);
	    sendText(factory.retailAccountPage().zipCodeInput, addressInfo.get(0).get("zipCode"));
	    logger.info("User added address information successfully");  
	}
	
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.retailAccountPage().addressBttn);
		logger.info("User click on add addresss button sucessfully");
	}
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	   click(factory.retailAccountPage().editAddressBttn);
	   logger.info("User click on edit address button successfully");
	}
	
	@When("user update address form with below information")
	public void userUpdateAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
		 selectByVisibleText(factory.retailAccountPage().countryDropdown, addressInfo.get(0).get("country"));
		    clearTextUsingSendKeys(factory.retailAccountPage().fullNameInput);
		    sendText(factory.retailAccountPage().fullNameInput, addressInfo.get(0).get("fullName"));
		    clearTextUsingSendKeys(factory.retailAccountPage().phoneNumberInput);
		    sendText(factory.retailAccountPage().phoneNumberInput, addressInfo.get(0).get("phoneNumber"));
		    clearTextUsingSendKeys(factory.retailAccountPage().StreetInput);
		    sendText(factory.retailAccountPage().StreetInput, addressInfo.get(0).get("streetAddress"));
		    clearTextUsingSendKeys(factory.retailAccountPage().apartmentInput);
		    sendText(factory.retailAccountPage().apartmentInput, addressInfo.get(0).get("apt"));
		    clearTextUsingSendKeys(factory.retailAccountPage().cityInput);
		    sendText(factory.retailAccountPage().cityInput, addressInfo.get(0).get("city"));
		    selectByVisibleText(factory.retailAccountPage().stateDropdown, addressInfo.get(0).get("state"));
		    clearTextUsingSendKeys(factory.retailAccountPage().zipCodeInput);
		    sendText(factory.retailAccountPage().zipCodeInput, addressInfo.get(0).get("zipCode"));
		    logger.info("User updated address information successfully");
	 
	}
	
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.retailAccountPage().updateAddressBttn);
		logger.info("User clicked on update address button successfully");
	}
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.retailAccountPage().removeAddressButton);
		logger.info("User clicked on remove address button successfully");
	  
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.retailAccountPage().addAddressbttn.isDisplayed());
		logger.info("Address was removed successfully" );
	}

}
