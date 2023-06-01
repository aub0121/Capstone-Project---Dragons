package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "accountLink")
	public WebElement acctBttn;
	@FindBy(xpath = "//input[@name='name']")
	public WebElement nameInput;
	@FindBy(xpath = "//input[@name='phoneNumber']")
	public WebElement phoneInput;
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement updateBttn;
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement successMessage;
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPaymentMethod;
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;
	@FindBy(id = "paymentSubmitBtn")
	public WebElement updatePaymentBttn;
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentSuccessMessage;
	@FindBy(xpath = "//div[@class='flex gap-2 py-2']//child::button[text()='Edit']")
	public WebElement editPaymentBttn;
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removePaymentBttn;
	@FindBy(xpath = "//h1[@class='account__payment-new-title']")
	public WebElement assertCardRemoved;
	@FindBy(xpath = "//div[@class='account__payment-image-wrapper']")
	public WebElement clickOnCard;
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressbttn;
	@FindBy(id = "countryDropdown")
	public WebElement countryDropdown;
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;
	@FindBy(id = "streetInput")
	public WebElement StreetInput;
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;
	@FindBy(name = "state")
	public WebElement stateDropdown;
	@FindBy(id = "addressBtn")
	public WebElement addressBttn;
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedMessage;
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedMessage;
	@FindBy(xpath = "//div[@class='account__address-btn-wrapper']//child::button[text()='Edit']")
	public WebElement editAddressBttn;
	@FindBy(xpath = "//div[@class='account__address-btn-wrapper']//child::button[text()='Remove']")
	public WebElement removeAddressButton;
	@FindBy(xpath = "//button[text()='Update Your Address']")
	public WebElement updateAddressBttn;
	
	
	
	
	
	
	
	
}
