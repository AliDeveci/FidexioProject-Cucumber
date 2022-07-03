package com.fidexi.step_definitions;

import com.fidexi.pages.FidexiLogInPage;
import com.fidexi.utilities.ConfigurationReader;
import com.fidexi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class FidexiLogIn_StepDefinitions {

    FidexiLogInPage fidexiLogInPage = new FidexiLogInPage();

    @Given("user is on the Fidexi login page")
    public void user_is_on_the_fidexi_login_page() {

        String url = ConfigurationReader.getProperty("fidexi.url");
        Driver.getDriver().get(url);

    }

    @When("user clicks email blank and enters username")
    public void user_clicks_email_blank_and_enters_username() {
        fidexiLogInPage.inputUsername.sendKeys("salesmanager15@info.com");
    }
    @Then("user clicks password blank and enters password")
    public void user_clicks_password_blank_and_enters_password() {
        fidexiLogInPage.inputPassword.sendKeys("salesmanager");
    }

    @When("user clicks email blank and enters {string}")
    public void user_clicks_email_blank_and_enters_username(String string) {
        fidexiLogInPage.inputUsername.sendKeys(string);

    }
    @Then("user clicks password blank and enters {string}")
    public void user_clicks_password_blank_and_enters_password(String string) {
        fidexiLogInPage.inputPassword.sendKeys(string);

    }
    @And("user clicks Log in button")
    public void user_clicks_log_in_button() {
        fidexiLogInPage.loginButton.click();

    }
    @Then("user should see title is Odoo")
    public void user_should_see_title_is_odoo() {

        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("user should see text wrong login password alert")
    public void userShouldSeeTextWrongLoginPasswordAlert() {
        String expectedText= "Wrong login/password";
        String actualText= fidexiLogInPage.wrongAlert.getText();

    }

    @And("user should see please fill out this field message")
    public void userShouldSeePleaseFillOutThisFieldMessage() {
        String expectedAlert= "Lütfen bu alanı doldurun.";
        String actualAlert = Driver.getDriver().findElement(By.name("password")).getAttribute("validationMessage");
        Assert.assertEquals(expectedAlert, actualAlert);


    }

    @When("user clicks reset password")
    public void userClicksResetPassword() {
        fidexiLogInPage.resetPassword.click();
    }

    @Then("user lands on reset password page")
    public void userLandsOnResetPasswordPage() {
        String expectedTitle2 ="Reset password | Best solution for startups";
        String actualTitle2= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);
    }


    @And("password is in bullet signs")
    public void passwordIsInBulletSigns() {
        String expectedPassword= "";
        String actualPassword = fidexiLogInPage.inputPassword.getText();
        Assert.assertEquals(expectedPassword, actualPassword);

    }


    @Then("user clicks password blank enters password and presses enter key")
    public void userClicksPasswordBlankEntersPasswordAndPressesEnterKey() {
        fidexiLogInPage.inputPassword.sendKeys("salesmanager"+ Keys.ENTER);
    }

    @When("user clicks email blank and enters username and presses enter key")
    public void userClicksEmailBlankAndEntersUsernameAndPressesEnterKey() {
        fidexiLogInPage.inputUsername.sendKeys("salesmanager"+ Keys.ENTER);
    }
}
