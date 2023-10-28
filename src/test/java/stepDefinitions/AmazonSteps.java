package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {

	@Given("User trying to launch the page")
	public void user_trying_to_launch_the_page() {
		System.out.println("User launch------------->");
	}

	@When("After launching enter the url for amazon and click on search button")
	public void after_launching_enter_the_url_for_amazon_and_click_on_search_button() {
		System.out.println("url amazon------->");
	}

	@Then("User enters the email address")
	public void user_enters_the_email_address() {
		System.out.println("user enters emails ---------->");
	}

	@Then("user enters the password")
	public void user_enters_the_password() {
		System.out.println("password---------------->");
	}

	@Then("User trying to click on SignIn button")
	public void user_trying_to_click_on_sign_in_button() {
		System.out.println("Signin----------->");
	}

	@Given("User trying to click on old orders")
	public void user_trying_to_click_on_old_orders() {
		System.out.println("Old Orders --------------->");
	}

	@When("After clicking user can able to see all the past orders")
	public void after_clicking_user_can_able_to_see_all_the_past_orders() {
		System.out.println("Past orders------------------>");
	}

	@Then("user can able to see the delivered order")
	public void user_can_able_to_see_the_delivered_order() {
		System.out.println("Delivered Orders------->");
	}

	@Then("user can able to see the cancelled orders")
	public void user_can_able_to_see_the_cancelled_orders() {
		System.out.println("Cancelled Orders ------------>");
	}

	@Then("user can able to initiate the bug again products as well")
	public void user_can_able_to_initiate_the_bug_again_products_as_well() {
		System.out.println("Bugagain Products ------------------>");
	}

}
