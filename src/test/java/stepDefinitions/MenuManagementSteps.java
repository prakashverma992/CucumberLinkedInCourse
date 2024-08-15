package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import linkedinLearning.cucumberCourse.RestaurantMenu.RestaurantMenu;
import linkedinLearning.cucumberCourse.RestaurantMenuItem.RestaurantMenuItem;
import io.cucumber.java.en.Then;

public class MenuManagementSteps {
	RestaurantMenuItem newMenuItem;
	RestaurantMenu locationMenu = new RestaurantMenu();

	/*
	 * Quantifiers (Regular Expressions) "+": once or more "*": zero or more "?":
	 * zero or once "{2}": exactly twice ([a-zA-Z0-9])
	 */

//	@Given("I have a menu item with name \"([^\"]+)\" and price ([$]*)([0-9]+)")
	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price(String menuItemName, Integer price) {
		newMenuItem = new RestaurantMenuItem(menuItemName, menuItemName, price);
		System.out.println("Step 1");
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
		locationMenu.addMenuItem(newMenuItem);
		System.out.println("Step 2");
	}

	@Then("Menu item with name {string} should be added")
	public void menu_item_with_name_should_be_added(String string) {
		boolean exists = locationMenu.doesItemExist(newMenuItem);
		System.out.println("Step 3: " + exists);
	}

}
