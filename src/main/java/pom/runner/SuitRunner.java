package pom.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\seleniumworkspace\\cucumberframework\\src\\main\\resources\\features"},glue={"pom\\testcase"},dryRun=false,monochrome=false,plugin={"pretty"})
public class SuitRunner {

}
