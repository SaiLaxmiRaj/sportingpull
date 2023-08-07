package com.sportingbull.en.steps;

import com.sportingbull.en.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStep
{
    @Given("^I am on homepage$")
    public void iAmOnHomepage()
    {

    }


    @When("^I should be able to click on community shield$")
    public void iShouldBeAbleToClickOnCommunityShield()
    {
        new HomePage().setCommunityShieldTab();
    }

    @Then("^I community shield page display$")
    public void iCommunityShieldPageDisplay()
    {
        new HomePage().setVerifyText();
    }

    @And("^I should click on accept cookies$")
    public void iShouldClickOnAcceptCookies()
    {
        new HomePage().clickOnAcceptCookies();
    }



    @Then("^I navigate homepage$")
    public void iNavigateHomepage() {
    }
}
