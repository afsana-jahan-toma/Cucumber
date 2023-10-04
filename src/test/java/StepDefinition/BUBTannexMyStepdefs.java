package StepDefinition;

import Core.Helper;
import POM.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BUBTannexMyStepdefs {
    WebDriver driver;
    WebElements web;
    @Given("BUBT annex login page")
    public void bubtAnnexLoginPage() {
        Helper hp = new Helper();
        driver = hp.chromeLaunch();

    }

    @When("click the interface")
    public void clickTheInterface() {
        web = new WebElements(driver);
        web.clickTheInterface();
    }

    @And("Student Input {string} and {string}")
    public void studentInputEnterYourIDAndEnterYourPassword(String ID, String password) {
        web.studentInputEnterYourIDAndEnterYourPassword(ID,password);
    }

    @And("click the login button")
    public void clickTheLoginButton() {
        web.clickTheLoginButton();
    }

    @Then("go to the login page")
    public void goToTheLoginPage() {
    }
}
