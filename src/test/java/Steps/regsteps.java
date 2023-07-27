package Steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class regsteps {
	@Given("user at regitration page")
	public void user_at_regitration_page() {
	   System.out.println("user registration page");
	}

	@When("user  pass  data")
	public void user_pass_data(io.cucumber.datatable.DataTable dataTable) {
	  List<List<String>> data = dataTable.asLists();
	  
	 String value= data.get(0).get(1);System.out.println(value);
	}

	@Then("user get register")
	public void user_get_register() {
	   System.out.println("registration");
	}

}
