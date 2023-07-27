package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
	features= {"C:\\Users\\saurabh\\eclipce workspace\\jan28_BDD_cucumber\\Feature File\\order.feature"}	
		
		,glue= {"Steps","hooks"},
	
	
	 tags="@fun1 "
		
		
		
		
		
		)
public class orderrunner extends AbstractTestNGCucumberTests {

}
