package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "Features", tags= {"@login2"}, glue = "stepDefinitionLogin2")
public class TestRunnerLogin2 {

}
