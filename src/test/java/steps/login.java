package steps;

import Pages.loginPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {

        openBrowserAndLaunchApplication();

    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
    loginPage loginPage = new loginPage();
    sendText(loginPage.userNameField, ConfigReader.getPropertyValue("username"));
    sendText(loginPage.passwordField, ConfigReader.getPropertyValue("password"));


    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage loginPage = new loginPage();
        click(loginPage.loginBtn);

    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {

        loginPage loginPage = new loginPage();
        String text = loginPage.dashboardMsg.getText();
        String wlcome = "Welcome Admin";
        Assert.assertEquals(wlcome, text);


    }
}
