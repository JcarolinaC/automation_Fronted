package com.speedup.qa.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinition {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Carolina Ceballos");
    }


    @Given("^That user is join LinkeIn$")
    public void thatUserIsJoinLinkeIn() {

    }

    @When("^the user to request in the login$")
    public void theUserToRequestInTheLogin() {

    }

    @Then("^the user can to see the name$")
    public void theUserCanToSeeTheName() {

    }
}
