package com.fidexi.step_definitions;

import com.fidexi.pages.FidexiLogInPage;
import com.fidexi.pages.FidexiLogOutPage;
import com.fidexi.utilities.ConfigurationReader;
import com.fidexi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class FidexiLogOut_StepDefinitions {


    FidexiLogInPage fidexiLogInPage = new FidexiLogInPage();
    FidexiLogOutPage fidexiLogOutPage = new FidexiLogOutPage();

    @Given("user enters valid credentials and lands on the Fidexi home page")
    public void user_enters_valid_credentials_and_lands_on_the_Fidexi_home_page() {
        String url = ConfigurationReader.getProperty("fidexi.url");
        Driver.getDriver().get(url);
        fidexiLogInPage.inputUsername.sendKeys("salesmanager61@info.com");
        fidexiLogInPage.inputPassword.sendKeys("salesmanager"+ Keys.ENTER);
    }

    @When("user clicks username on top right")
    public void user_clicks_username_on_top_right() {
        fidexiLogOutPage.topBarName.click();

    }

    @Then("user clicks Log out")
    public void user_clicks_log_out() {
        fidexiLogOutPage.logOutButton.click();

    }


    @And("user lands on Log in page and should see title is Login Best solution for startups")
    public void userLandsOnLogInPageAndShouldSeeTitleIsLoginBestSolutionForStartups() {
        String expectedTitle = "Login | Best solution for startups";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("user lands on Log in page and clicks step back button")
    public void userLandsOnLogInPageAndClicksStepBackButton() {
        Driver.getDriver().navigate().back();

    }


    @Then("user sees expiry message")
    public void userSeesExpiryMessage() {
        String expectedMessage = "Odoo Session Expired";
        String actualMessage = fidexiLogOutPage.expiredAlert.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
