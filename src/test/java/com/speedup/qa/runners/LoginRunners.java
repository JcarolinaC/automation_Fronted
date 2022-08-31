package com.speedup.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:feature/login.feature"
,glue = "classpath:com.speedup.qa.stepdefinition.LoginStepDefinition"
,snippets = SnippetType.CAMELCASE)

public class LoginRunners {
}
