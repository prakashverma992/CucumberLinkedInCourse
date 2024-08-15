Feature: Menu Management

  Background: 
    Given I have a menu item with name "Cucmber Sandwich" and price 20
    When I add that menu item
    Then Menu item with name "Cucumber Sandwich" should be added

  @SmokeTest
  Scenario: Add a menu item
    Given I have a menu item with name "Cucmber Sandwich" and price 20
    When I add that menu item
    Then Menu item with name "Cucumber Sandwich" should be added

  @RegularTest
  Scenario: Add another menu item
    Given I have a menu item with name "Cucmber Salad" and price 15
    When I add that menu item
    Then Menu item with name "Cucumber Sandwich" should be added

  @NightlyBuildTest @RegularTest
  Scenario: Add third menu item
    Given I have a menu item with name "Chicken Sandwich" and price 25
    When I add that menu item
    Then Menu item with name "Chicken Sandwich" should be added
