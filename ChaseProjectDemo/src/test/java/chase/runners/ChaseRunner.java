package chase.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class ChaseRunner {

	@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
			"json:target/cucumber-jsonreports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
			features = {"/ChaseProjectDemo/src/test/resources/Features" }, 
			glue = { "chase.stepDef" , "chase.utilities" },  monochrome = true)

	public class ChaseRunnerTest extends AbstractTestNGCucumberTests {
		 
		
		
	}
	
	
	
}
