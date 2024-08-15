Feature: Data Tables

  @ListOfStrings
  Scenario: Bill Amount Generation
    Given I placed an order for the following items
      | Cucumber Sandwich | 2 | 20 |
    When I generate the bill
    Then a bill for $40 should be generated

  @ListOfListOfStrings
  Scenario: Bill Amount Generation
    Given I placed an order for the following items
      | Cucumber Sandwich | 2 | 10 |
      | Cucumber Salad    | 1 |  5 |
      | Chicken Sandwich  | 1 | 15 |
    When I generate the bill
    Then a bill for $40 should be generated

  @ListOfMaps
  Scenario: Bill Amount Generation
    Given I placed an order for the following items
      | ItemName          | Units | UnitPrice |
      | Cucumber Sandwich |     2 |        10 |
      | Chicken Sandwich  |     1 |        15 |
    When I generate the bill
    Then a bill for $35 should be generated
