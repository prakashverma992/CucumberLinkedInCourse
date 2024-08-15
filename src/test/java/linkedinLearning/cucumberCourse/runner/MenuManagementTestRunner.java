package linkedinLearning.cucumberCourse.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/linkedinLearning/cucumberCourse/features"}, 
		glue = {"stepDefinitions"}, 
		tags = "@ScenarioOutlineExample", 
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", 
				"html:target/SystemTestReports/html", 
				"json:target/SystemTestReports/json/report.json", 
				"junit:target/SystemTestReports/junit/report.xml"}
		)

public class MenuManagementTestRunner {

}
