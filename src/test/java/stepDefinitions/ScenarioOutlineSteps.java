package stepDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import linkedinLearning.cucumberCourse.FinalBillCalculation.BillCalculationHelper;

public class ScenarioOutlineSteps {

	int InitialBillAmount;
	double TaxRate;

	@Given("I have a customer")
	public void i_have_a_customer() {

	}

	@Given("user enters initial bill amount as {int}")
	public void user_enters_initial_bill_amount_as(Integer initialBillAmount) {
		this.InitialBillAmount = initialBillAmount;
		System.out.println("Initial Bill Amount: " + initialBillAmount);
	}

//	@Given("sales tax rate is {int} percent")
//	public void sales_tax_rate_is_percent(Integer taxRate) {
//		this.TaxRate = taxRate;
//		System.out.println("Tax Rate: " + taxRate);
//	}
//
//	@Then("final bill amount calculate is {int}")
//	public void final_bill_amount_calculate_is(Integer expectedValue) {
//		double systemCalculatedValue = BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount,
//				this.TaxRate);
//		System.out.println("ExpectedValue: " + expectedValue);
//		System.out.println("SystemCalculatedValue: " + systemCalculatedValue);
//		assertTrue(expectedValue == systemCalculatedValue);
//
//	}

	@Given("sales tax rate is {double} percent")
	public void sales_tax_rate_is_percent(Double taxRate) {
		this.TaxRate = taxRate;
		System.out.println("Tax Rate: " + taxRate);

	}

	@Then("final bill amount calculate is {double}")
	public void final_bill_amount_calculate_is(Double expectedValue) {
		double systemCalculatedValue = BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount,
				this.TaxRate);
		System.out.println("ExpectedValue: " + expectedValue);
		System.out.println("SystemCalculatedValue: " + systemCalculatedValue);
		assertTrue(expectedValue == systemCalculatedValue);

	}

//	private void invokeWebPage(Double expectedValue) {
//		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://localhost:8080/BasicWebsite/Index.jsp");
//		WebElement BillAmountTextBox = driver.findElement(By.id("billamount"));
//		WebElement TaxRateTextBox = driver.findElement(By.id("taxrate"));
//		WebElement Button = driver.findElement(By.id("mybutton"));
//		BillAmountTextBox.sendKeys(Integer.toString(InitialBillAmount));
//		TaxRateTextBox.sendKeys(Double.toString(TaxRate));
//		Button.click();
//		WebElement Header1Element = driver.findElement(By.xpath("//h1"));
//		System.out.println(Header1Element.getText());
//		boolean Matched = Header1Element.getText().contains("Final Bill Amount is: $" + expectedValue.toString());
//		System.out.println(Matched);
//	}

}
