Feature: Final Bill Calculation

  @ScenarioOutlineExample
  Scenario Outline: Customer Bill Amount Calculation
    Given I have a customer
    And user enters initial bill amount as <InitialBillAmount>
    And sales tax rate is <TaxRate> percent
    Then final bill amount calculate is <CalculatedBillAmount>

    Examples: 
      | InitialBillAmount | TaxRate | CalculatedBillAmount |
      |               100 |      10 |                  110 |
      |               200 |       8 |                  216 |
      |               100 |    1.55 |               101.55 |
