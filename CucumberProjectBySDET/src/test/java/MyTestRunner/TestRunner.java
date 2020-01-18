package MyTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//	features="Features", //feature is use for set Feature file path or we can define file name like Feature
	//	features="C:\\workspace2\\CucumberProjectBySDET\\Features\\Tagging.feature",
		features="C:\\workspace2\\CucumberProjectBySDET\\Features\\Hooks.feature",
		glue="StepDefination", //glue is use for set StepDefination file path or we can define package name like StepDefination
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"}, // format we are using for generate difference type of report 
		dryRun=false,   // When we do dryrun=true the program will run backend with show ui part
	    monochrome=true,  //monochrome we are using for define steps
	    strict=false
	 //  tags= {"@SanityTest"} // this wii execute sanity testcases
	//	tags= {"@SanityTest,@RegrassionTest"} // Execuit  sceanario which are comes under regrassion and sanity
	//	tags= {"@SanityTest","@End2End"} // Execuit only scneariowhich are comes under sanity and end2end
	//	tags= {"@RegrassionTest","@End2End"} //// Execuit only scneariowhich are comes under  regrassion and ene2end
	 //  tags= {"~@End2End"} // This will ignore end2end testcases
	//	tags= {"~@End2End","~SanityTest"} // This will ignore end2end  and sanitytest 
		)

public class TestRunner {
	
	

}
