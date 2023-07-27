package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logindatastep {
	@When("user enter username {string}")
	public void user_enter_username(String string) {
	    System.out.println("username "+string);
	}

	@When("user enter passeord {string}")
	public void user_enter_passeord(String string) {
		System.out.println("username "+string);
	}

	@Then("user redirect to home page")
	public void user_redirect_to_home_page() {
		System.out.println("user redirect to home page");
	}

	
}
