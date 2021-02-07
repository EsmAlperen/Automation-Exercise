package com.openClinics.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class FaildTestRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "@target//rerun.txt" ,
            glue = "com/cybertek/step_definitions"
    )
    public class FailedTestRunner {
    }
}
