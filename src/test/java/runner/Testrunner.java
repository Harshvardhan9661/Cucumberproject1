package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue={"stepdefinition","hooks"},
		publish=true,
		plugin={"pretty","html:Screenshot/cureport.html"})
public class Testrunner {

	
	
}
