package com.openClinics.step_definitions;

import com.openClinics.pages.GoogleSearchPage;
import com.openClinics.utilities.ConfigurationReader;
import com.openClinics.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

public class GoogleStepDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {

        System.out.println("User is on the Google Search Page");
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("User sees the Title is Google");

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue("Actual title does not match expected title",actualTitle.equals(expectedTitle));
        Assert.assertEquals("Actual title does not match expected title",actualTitle,expectedTitle);
    }

    @When("User searches {string}")
    public void userSearches(String searchValue) {

        googleSearchPage.searchBox.sendKeys(searchValue+ Keys.ENTER);
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {
        String expectedTitle = searchValue + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
