package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class hooks {
  
//	@Before 
//    public void before_scenario()
//    {
//    	System.out.println("before execution of scenario");
//    }
//    
    @BeforeStep("@fun2")
    public void before_step()
    {
    	System.out.println("before stpe execute");
    }
    
    @AfterStep
    public void after_step() {
		System.out.println("after step execute");
	}
//    @After
//    public void after_scenario() 
//    {
//	   System.out.println("after execution of scenario");	
//	}
//    
    
    
    
    
    
    
}
