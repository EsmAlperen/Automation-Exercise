package com.openClinics.step_definitions;

import com.openClinics.pages.GoogleSearchPage;
import com.openClinics.utilities.ConfigurationReader;
import com.openClinics.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SearchWithoutTermsStepDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @When("User clicks voice button")
    public void user_ckicks_voice_button() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        googleSearchPage.VoiceSearch.click();
    }


    @Then("User should see microphone icon and speak")
    public void user_sould_see_microphone_icon_and_speak() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        googleSearchPage.SpeakNow.isDisplayed();

    }


}
