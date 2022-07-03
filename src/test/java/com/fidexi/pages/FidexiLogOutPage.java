package com.fidexi.pages;

import com.fidexi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexiLogOutPage {

    public FidexiLogOutPage(){ PageFactory.initElements(Driver.getDriver(), this);  }


    @FindBy(xpath = "//a/span[@class='oe_topbar_name']")
    public WebElement topBarName;

    @FindBy(xpath = "//li/ul/li[6]/a")
    public WebElement logOutButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement expiredAlert;




}
