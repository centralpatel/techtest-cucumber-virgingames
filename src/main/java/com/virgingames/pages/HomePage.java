package com.virgingames.pages;

import com.virgingames.driverfactory.ManageDriver;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Accept']")
    WebElement acceptButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Join Now']")
    WebElement joinNow;


public void clickOnAcceptButton(){
    log.info("clicking on Join Now Button " + joinNow.toString());
    clickOnElement(acceptButton);
    driver.switchTo().defaultContent();
}
    public void clickOnJoinNow() {
        log.info("clicking on Join Now Button " + joinNow.toString());
        clickOnElement(joinNow);
    }
}
