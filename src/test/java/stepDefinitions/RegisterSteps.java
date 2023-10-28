package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("User navigates on registration Page");
	}

	@When("User enters the following user details")
	public void user_enters_the_following_user_details(DataTable dataTable) {
		List<List<String>> userlist = dataTable.asLists(String.class);
		for (List<String> e : userlist) {
			System.out.println(e);
		}
	}
	
	
	@When("User enters the following user details with coumns")
	public void user_enters_the_following_user_details_with_coumns(DataTable dataTable) {
	   List<Map<String, String>>  userList=(List<Map<String, String>>) dataTable.asMap(String.class, String.class);
	   System.out.println(userList);
	   System.out.println(userList.get(0).get("firstname"));
	}


	@Then("User registration should be successfull")
	public void user_registration_should_be_successfull() {
		System.out.println("User registration is successfull");
	}

}
