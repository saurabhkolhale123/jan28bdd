package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orderstep {

	@Given("user at home page")
	public void user_at_home_page() {
	   System.out.println("user at home page");
	}

	@When("user click n oreder")
	public void user_click_n_oreder() {
		System.out.println("user click n oreder");
	}

	@When("user click on previous order button")
	public void user_click_on_previous_order_button() {
		System.out.println("user click on previous order button");
	}

	@Then("user see previous order")
	public void user_see_previous_order() {
		System.out.println("user see previous order");
	}

	@When("user click on current order button")
	public void user_click_on_current_order_button() {
	    System.out.println("user click on current order button");
	}

	@Then("user see current order")
	public void user_see_current_order() {
	    System.out.println("user see current order");
	}

}
