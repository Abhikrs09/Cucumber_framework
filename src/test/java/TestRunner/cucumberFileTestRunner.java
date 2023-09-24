package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
				features = {"src/test/resources/Feature"},
				glue = {"stepDefinations"},
				plugin = {"pretty","html:targrt/htmlreport.html"}
		)


public class cucumberFileTestRunner extends AbstractTestNGCucumberTests {

}
