package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\workspace2\\CucumberProjectBySDET\\Features1\\Customer.feature",
		glue="C:\\workspace2\\CucumberProjectBySDET\\src\\test\\java\\StepDefination1",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		
		)
public class TestRun {

}
