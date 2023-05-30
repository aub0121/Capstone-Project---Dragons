package tek.capstone.dragons.pages;

public class POMFactory {

	private RetailAccountPage retailAccountPage;
	private RetailHomePage retailHomePage;
	private RetailOrderPage retailOrderPage;
	private RetailSignInPage retailSignInPage;
	
	public POMFactory() {
		this.retailAccountPage = new RetailAccountPage();
		this.retailHomePage = new RetailHomePage();
		this.retailSignInPage = new RetailSignInPage();
		this.retailOrderPage = new RetailOrderPage();
	}
	
	public RetailAccountPage retailAccountPage() {
		return this.retailAccountPage;
	}
	
	public RetailHomePage retailHomePage() {
		return this.retailHomePage;
	}
	
	public RetailOrderPage retailOrderPage() {
		return this.retailOrderPage;
	}
	
	public RetailSignInPage retailSignInPage() {
		return this.retailSignInPage;
	}
	
}

