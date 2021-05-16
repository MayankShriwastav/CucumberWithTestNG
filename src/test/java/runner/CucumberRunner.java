package runner;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(cucumber.api.junit.Cucumber.class)
@cucumber.api.CucumberOptions(
					features="src/test/java/features",
					glue="stepDefinition"						
		)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
