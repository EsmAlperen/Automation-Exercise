package com.openClinics.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// In this class I run all the tests with JUnit
@RunWith(Cucumber.class)
@CucumberOptions(
        //I used plugin to configure what reports I want to generate and where to put them.
        plugin = "html:target/google_search_report.html",

        // I used features to specify the path of the feature files
        features = "src/test/resources/features",

        //I used glue to look for step definitions. Hook is a part of glue
        glue = "com/openClinics/step_definitions",
        //I used dryRun to generate step definitions automatically if it is true
        dryRun = false,

        // With tags I specify tests I want to run
        tags = "@SearchWithTerms"

)
public class TestRunner {

}