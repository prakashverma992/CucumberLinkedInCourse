package linkedinLearning.cucumberCourse.RestaurantMenu;

import java.util.ArrayList;

import linkedinLearning.cucumberCourse.RestaurantMenuItem.RestaurantMenuItem;

public class RestaurantMenu {

	ArrayList<RestaurantMenuItem> menuItems = new ArrayList<RestaurantMenuItem>();

	public boolean addMenuItem(RestaurantMenuItem newMenuItem) {
		return menuItems.add(newMenuItem);
	}

	public boolean doesItemExist(RestaurantMenuItem newMenuItem) {
		boolean exists = false;
		if (menuItems.contains(newMenuItem)) {
			exists = true;
		}
		return exists;
	}

}
