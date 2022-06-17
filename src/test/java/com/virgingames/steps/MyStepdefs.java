package com.virgingames.steps;

import com.virgingames.pages.TopMenuBarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^User is on home page$")
    public void userIsOnHomePage() {

    }

    @When("^User accept cookie$")
    public void userAcceptCookie() throws InterruptedException {
        new TopMenuBarPage().acceptCookie();
        Thread.sleep(5000);

    }

    @And("^User click on Online slots$")
    public void userClickOnOnlineSlots() {
        new TopMenuBarPage().clickOnOnlineSlot();
    }

    @Then("^User navigate to Online slots page successfully$")
    public void userNavigateToOnlineSlotsPageSuccessfully() {
        new TopMenuBarPage().verifyUserIsSucessfullyOnLineSlotPage();

    }

    @And("^User click on Live Casino$")
    public void userClickOnLiveCasino() {
        new TopMenuBarPage().clickOnLiveCasino();
    }

    @Then("^User navigate to Live Casino page successfully$")
    public void userNavigateToLiveCasinoPageSuccessfully() {
        new TopMenuBarPage().verifyUserIsSuccessfullyOnLiveCasinoPage();
    }

    @And("^User click on Casino$")
    public void userClickOnCasino() {
        new TopMenuBarPage().clickOnCasino();
    }

    @Then("^User navigate to Casino page successfully$")
    public void userNavigateToCasinoPageSuccessfully() {
        new TopMenuBarPage().verifyUserIsSuccessfullyOnCasinoPage();
    }
}