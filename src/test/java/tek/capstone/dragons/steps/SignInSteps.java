package tek.capstone.dragons.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() throws InterruptedException {
       Thread.sleep(1000);
	   String expectedTxt = "TEKSCHOOL";
	   String actualTxt = factory.retailHomePage().tekSchoolLogo.getText();
	   Assert.assertEquals(expectedTxt, actualTxt);
	   logger.info(actualTxt + ": was successfully verified");   
	}
	
	@When("User clicks on sign in option")
	public void userClicksOnSignInOption(){
		click(factory.retailHomePage().signInBttn);
		logger.info("User clicked on Sign In button successfully");   
	}
	
	
	@When("User clicks on Create New Account button")
	public void userClicksOnCreateNewAccountButton() throws InterruptedException{
		Thread.sleep(1000);
		click(factory.retailSignInPage().CreateAcctBttn);
		logger.info("User clicked on Create Account Button successfully");
	}
	
	
	@When("User fills the sign up information with {string} and {string} and {string} and {string}")
	public void userFillsTheSignUpInformationWithAndAndAnd(String name, String email, String password, String confirmPassword) {
		sendText(factory.retailSignInPage().nameInput, name);
		sendText(factory.retailSignInPage().emailInput, email);
		sendText(factory.retailSignInPage().passwordInput, password);
		sendText(factory.retailSignInPage().confirmPassInput, confirmPassword);
		logger.info("User entered name, email, password and confirm password successfully");
	}
	
	
	@When("User click on sign up button")
	public void userClickOnSignUpButton() throws InterruptedException {
		Thread.sleep(1000);
		click(factory.retailSignInPage().signUpBttn);
		logger.info("User clicked on Sign Up button successfully");  
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillPresence(factory.retailAccountPage().acctBttn);
		Assert.assertTrue(isElementDisplayed(factory.retailAccountPage().acctBttn));
		logger.info("User created acount successfully");
	  
	}
	
	@When("User enters email {string} and password {string}")
	public void userEntersEmailAndPassword(String email, String password) {
	  sendText(factory.retailSignInPage().emailField, email);
	  sendText(factory.retailSignInPage().passwordField, password);
	  logger.info("User entered email and password successfully");
	}
	
	@When("User clicks on login button")
	public void userClicksOnLoginButton() throws InterruptedException {
		Thread.sleep(2000);
		click(factory.retailSignInPage().loginBttn);
		logger.info("User click on Login button successfully");
	}
	


}
