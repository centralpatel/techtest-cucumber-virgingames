package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegisterSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().clickOnAcceptButton();
    }

    @And("^I click join now button$")
    public void iClickJoinNowButton() {
        new HomePage().clickOnJoinNow();
    }

}
