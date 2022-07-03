package com.fidexi.pages;

import com.fidexi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexiLogInPage {

    public FidexiLogInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//div/form/p")
    public WebElement wrongAlert;

    @FindBy(xpath = "//div/a[@class=\"btn btn-link pull-right\"]")
    public WebElement resetPassword;


}
