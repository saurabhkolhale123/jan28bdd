package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		
	features= {"C:\\Users\\saurabh\\eclipce workspace\\jan28_BDD_cucumber\\Feature File\\registration.feature"},
	glue= {"Steps","hooks"},
		
		publish=true
		
		
		)



public class regrunner extends AbstractTestNGCucumberTests {

}
