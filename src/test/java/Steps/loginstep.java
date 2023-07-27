package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {

	
	@Given("user at login page")
	public void loginpage()
	{
		System.out.println("user at login page");
	}
	
	@When("user enter username")
	public void user_enter_username() 
	{
		System.out.println("user enter username ");
	}
	
	@When("user enter password")
	public void user_enter_password() 
	{
		System.out.println("user enter password ");
	}
	
	
	@When("user click on login")
	public void user_click_on_login()
	{
		System.out.println("user clcked on login");
	}
	@Then("user redirect at home page")
	public void user_redirect_to_homepage()
	{
		System.out.println("user redirect at home page");
	}
}
