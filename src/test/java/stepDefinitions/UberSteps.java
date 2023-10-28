package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

	@Given("User wants to select the car type {string} from uber application")
	public void user_wants_to_select_the_car_type_from_uber_application(String carType) {
		System.out.println("Step 1");
	}

	@When("User selects the car {string} and pickup point at {string} and drop location {string}")
	public void user_selects_the_car_and_pickup_point_at_and_drop_location(String carType, String pickUp,
			String dropLocation) {
		System.out.println("Step 2");
	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3");
	}

	@Then("driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5:" + price);
	}

}
