package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "newAccountBtn")
	public WebElement CreateAcctBttn;
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameInput;
	@FindBy(xpath = "//input[@id='emailInput']")
	public WebElement emailInput;
	@FindBy(xpath = "//input[@id='passwordInput']")
	public WebElement passwordInput;
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement confirmPassInput;
	@FindBy(id = "signupBtn")
	public WebElement signUpBttn;
	@FindBy(id = "email")
	public WebElement emailField;
	@FindBy(id = "password")
	public WebElement passwordField;
	@FindBy(id = "loginBtn")
	public WebElement loginBttn;
	

}
