package runner;

import org.junit.runner.RunWith;

import cucumber.api.*;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features="F:\\Selenium - Workspace\\CheckFeatures\\src\\test\\java\\features"
,glue= "stepDefinitions"
)

public class Runner {

}
