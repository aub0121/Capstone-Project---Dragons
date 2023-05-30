package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekSchoolLogo;
	@FindBy(id = "signinLink")
	public WebElement signInBttn;
	@FindBy(xpath = "//span[text()='All']")
	public WebElement allbttn;
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronics;
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computers;
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHome;
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sports;
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automotive;
	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement tvAndVideo;
	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement videoGames;
	@FindBy(xpath = "//span[text()='Accessories']")
	public WebElement accessories;
	@FindBy(xpath = "//span[text()='Networking']")
	public WebElement networking;
	@FindBy(xpath = "//span[text()='Smart Home Lightning']")
	public WebElement smartHomeLighting;
	@FindBy(xpath = "//span[text()='Plugs and Outlets']")
	public WebElement plugsAndOutlets;
	@FindBy(xpath = "//span[text()='Athletic Clothing']")
	public WebElement athleticClothing;
	@FindBy(xpath = "//span[text()='Exercise & Fitness']")
	public WebElement exerciseAndFitness;
	@FindBy(xpath = "//span[text()='Automative Parts & Accessories']")
	public WebElement automotiveParts;
	@FindBy(xpath = "//span[text()='MotorCycle & Powersports']")
	public WebElement motorCycle;
	@FindBy(xpath = "//div[@class='sidebar_content-item']")
	public List<WebElement> allDepartmentsList;
	
	
	
	
	
	
	
	
}
