import com.nopcommerce.pages.ElectronicsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {

    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^click on \"([^\"]*)\" tab from top menu$")
    public void clickOnTabFromTopMenu(String tabName) {
        new ElectronicsPage().selectMenu(tabName);
    }

    @Then("^user should navigate to Electronics page$")
    public void userShouldNavigateToElectronicsPage() {
        String expectedMessage = "Electronics";
        String actualMessage = new ElectronicsPage().getElectronicsHeaderText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on");
    }
}
