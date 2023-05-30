package tek.capstone.dragons.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		selectByVisibleText(factory.retailOrderPage().allDepartmentsDropdown, string);
		logger.info("User changed category to smart home sucessdfully");
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.retailOrderPage().searchBar, string);
		logger.info("Logger entered " + string + " successfully");
	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailOrderPage().searchIcon);
		logger.info("User clicked on search icon successfully");
	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.retailOrderPage().kasaOutdoorSmartPlug);
		logger.info("User click on kasa outdoor smart plug successfully");
	}

	@Then("User select quantity {string}")
	public void userSelectQuantity(String itemQuantity) {
		selectByVisibleText(factory.retailOrderPage().quantityDropdown, itemQuantity);
		logger.info("User input item quantity successfully");
	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailOrderPage().addToCartBttn);
		logger.info("User clicked on add to cart button successfully");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantityInCart) {
		Assert.assertEquals(quantityInCart, factory.retailOrderPage().cartQuantity.getText());
		logger.info(quantityInCart + "quantity is displayed succesfully");
	}

	@Then("User click on Apex Legends item")
	public void userClickOnApexLegendsItem() {
		click(factory.retailOrderPage().ApexLegends);
		logger.info("User clicked on Apex Legends Item successfully");
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.retailOrderPage().cartbttn);
		logger.info("User clicked on cart button successfully");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.retailOrderPage().proceedToCheckout);
		logger.info("User clicked on proceed to checkout successfully");
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.retailOrderPage().placeYourOrder);
		logger.info("User clicked on place your order successfully");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.retailOrderPage().orderPlacedMessage);
		Assert.assertEquals(expectedMessage, factory.retailOrderPage().orderPlacedMessage.getText());
		logger.info(expectedMessage + " is displayed");
	}

	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.retailOrderPage().ordersBttn);
		logger.info("User clicked on orders button successfully");
	}

	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrders = factory.retailOrderPage().listOfOrder;
        for (int i = 0; i < listOfOrders.size(); i++) {
            if (listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {
            	
            } else if (listOfOrders.get(i).getText().equalsIgnoreCase("Show Details")) {
                click(factory.retailOrderPage().showDetails);
                logger.info("User clicked on show details successfully");
            }
        }
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		List<WebElement> listOfCancelOptions = factory.retailOrderPage().cancelBttn;
		for (int i = 0; i < listOfCancelOptions.size(); i++) {
			click(listOfCancelOptions.get(0));
			logger.info("Cancel the order button was clicked Successfully");
			break;
		}
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
		click(factory.retailOrderPage().returningReasonDropdown);
		selectByVisibleText(factory.retailOrderPage().returningReasonDropdown, string);
		logger.info("User enter cancelation reason successfully");
	}

	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.retailOrderPage().cancelOrderBttn);
		logger.info("User click on cancel order button successfully");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancellationMessage) {
		Assert.assertEquals(cancellationMessage, factory.retailOrderPage().orderCancelledMessage);
		logger.info(cancellationMessage + " is displayed");
	}
	
	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		List<WebElement> listOfCancelOptions = factory.retailOrderPage().returnItemsbttn;
		for (int i = 0; i < listOfCancelOptions.size(); i++) {
			click(listOfCancelOptions.get(0));
			logger.info("Return items button was clicked Successfully");
			break;
		}
	}
	
	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		selectByVisibleText(factory.retailOrderPage().returningReasonDropdown, string);
		logger.info("User selected item damaged from dropdown successfully");
	}
	
	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.retailOrderPage().dropOffLocationDropdown, string);
		logger.info("User selcted on Fedex successfully");
	}
	
	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	   click(factory.retailOrderPage().returnOrderBttn);
	   logger.info("User clicked on return order button successfully");
	}
	
	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.retailOrderPage().reviewBttn);
		logger.info("User click on review button successfully");
	}
	
	@Then("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String review) {
	    sendText(factory.retailOrderPage().headlineText, headline);
	    sendText(factory.retailOrderPage().reviewText, review);
	    logger.info("User input text successfully");
	    
	}
	
	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	   click(factory.retailOrderPage().addYourReviewBttn);
	   logger.info("User clicked on add your review button succesfully");
	   logger.info("Just add something");
	}

	
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.retailOrderPage().reviewAddedSuccessMssg);
		Assert.assertEquals(expectedMessage, factory.retailOrderPage().reviewAddedSuccessMssg.getText());
	    logger.info(expectedMessage + " is displayed");
	}


}
