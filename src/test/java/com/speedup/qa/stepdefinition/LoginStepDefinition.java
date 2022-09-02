package com.speedup.qa.stepdefinition;

import com.speddup.qa.models.CredentialsData;
import com.speddup.qa.taks.LoginUser;
import com.speddup.qa.taks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinition {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Carolina Ceballos");
    }


    @Given("^That user is join LinkeIn$")
    public void thatUserIsJoinLinkeIn() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^the user to request in the login$")
    public void theUserToRequestInTheLogin(List<CredentialsData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.withData(data.get(0)));

    }

    @Then("^the user can to see the name$")
    public void theUserCanToSeeTheName() {

    }
}

