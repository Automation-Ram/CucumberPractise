package stepDefinitions;

import amazonImpl.Product;
import amazonImpl.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	Product product;
	Search search;

	@Given("I have search field on Amazon Page")
	public void i_have_search_field_on_amazon_page() {
		System.out.println("Step 1: I am on search Page");
	}

	@When("I search for product with name {string} and price {int}")
	public void i_search_for_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product with name:" + productName + " price: " + price);

		product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: product " + productName + "is display");

		search = new Search();
		search.displayProduct(product);
	}

}
