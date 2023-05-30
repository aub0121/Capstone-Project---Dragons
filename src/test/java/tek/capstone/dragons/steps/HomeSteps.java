package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.retailHomePage().allbttn);
		logger.info("User clicked on All button suuccessfully");

	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<Map<String, String>> departments = dataTable.asMaps(String.class, String.class);
		isElementDisplayed(factory.retailHomePage().electronics);
		isElementDisplayed(factory.retailHomePage().computers);
		isElementDisplayed(factory.retailHomePage().smartHome);
		isElementDisplayed(factory.retailHomePage().sports);
		isElementDisplayed(factory.retailHomePage().automotive);
		logger.info("All departments are displayed");
	}

	@When("User on {string}")
	public void userOn(String string) {
		List<WebElement> departments = factory.retailHomePage().allDepartmentsList;
		for (WebElement elements : departments) {
			elements.click();
			break;
		}
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> options = dataTable.asLists(String.class);
		List<WebElement> depts = factory.retailHomePage().allDepartmentsList;
		for (int i = 0; i < options.get(0).size(); i++) {
			for (WebElement elements : depts) {
				if (elements.getText().equals(options.get(0).get(i))) {
					Assert.assertTrue(elements.isDisplayed());
					;
					logger.info(elements.getText() + " is present");
				}
			}
		}
	}
}
