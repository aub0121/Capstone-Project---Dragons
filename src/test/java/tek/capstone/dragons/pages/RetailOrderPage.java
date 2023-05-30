package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//select[@class='search__select']")
	public WebElement allDepartmentsDropdown;
	@FindBy(xpath = "//input[@class='search__input']")
	public WebElement searchBar;
	@FindBy(xpath = "//button[@class='search__btn']")
	public WebElement searchIcon;
	@FindBy(xpath = "//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlug;
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement quantityDropdown;
	@FindBy(xpath = "//button[@class='product__btn']")
	public WebElement addToCartBttn;
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQuantity;
	@FindBy(xpath = "//div[@id='cartBtn']")
	public WebElement cartbttn;
	@FindBy(xpath = "//button[@id='proceedBtn']")
	public WebElement proceedToCheckout;
	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement placeYourOrder;
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMessage;
	@FindBy(xpath = "//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement ApexLegends;
	@FindBy(xpath = "//a[@id='orderLink']")
	public WebElement ordersBttn;
	@FindBy(xpath = "//p[text()='Order Placed']")
	public WebElement ordersPlacedValidation;
	@FindBy(xpath = "//button[text()='Cancel The Order']")
	public WebElement cancelTheOrderBttn;
	@FindBy(xpath = "//select[@class='order__cancel-input']")
	public WebElement returningReasonDropdown;
	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement cancelOrderBttn;
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelledMessage;
	@FindBy(xpath = "//div[@class='order']//descendant::p[4]")
	public List<WebElement> listOfOrder;
	@FindBy(xpath = "//p[@class='order__header-btn']")
	public WebElement orderDetailsDisplay;
	@FindBy(xpath = "//button[@id='buyAgainBtn']")
	public WebElement buyItAgainBttn;
	@FindBy(xpath = "//div[@class='order']//descendant::button[@id='cancelBtn']")
    public WebElement cancelBttn;
	@FindBy(xpath = "//p[text()='Show Details']")
	public WebElement showDetails;
	@FindBy(xpath = "//div[@class='order']//descendant::button[@id='returnBtn']")
	public WebElement returnItemsbttn;
	@FindBy(xpath = "//select[@id='dropOffInput']")
	public WebElement dropOffLocationDropdown;
	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement returnOrderBttn;
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnSuccessMessage;
	@FindBy(xpath = "//button[@id='reviewBtn']")
	public WebElement reviewBttn;
	@FindBy(xpath = "//input[@name='headline']")
	public WebElement headlineText;
	@FindBy(xpath = "//textarea[@name='comment']")
	public WebElement reviewText;
	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement addYourReviewBttn;
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedSuccessMssg;
	@FindBy(xpath = "//p[text()='Order Placed']")
	public WebElement orderPlaced;
	
	
	
}
