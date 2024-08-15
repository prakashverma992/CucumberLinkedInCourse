package linkedinLearning.cucumberCourse.FinalBillCalculation;

import java.text.DecimalFormat;

public class BillCalculationHelper {

	public static double CalculateBillForCustomer(Integer billAmount, double taxRate) {
		double FinalBillAmount = billAmount * (1 + taxRate / 100);
		DecimalFormat df = new DecimalFormat("0.00");
		String result = df.format(FinalBillAmount);
		return Double.parseDouble(result);
	}
}
