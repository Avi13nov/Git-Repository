package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/featurefile/featuredata.feature",glue="testCases")
public class TestRunner {
	*/
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/java/featurefile/featuredata.feature",glue="stepdefination")
	public class TestRunner {

}
