package com.ninjatutorial.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/adity/IdeaProjects/tutorialNinjaAutomation/src/test/resources/stories/login.feature",
        glue= "com.ninjatutorial.stepdefination",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty",  "html:target/cucumber-reports/html-report.html",
                "json:target/cucumber-reports/json-report.json"}
)
public class combineTestRunner {

}
