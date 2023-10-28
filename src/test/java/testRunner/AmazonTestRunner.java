package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {
				"C:\\Users\\RAM79\\eclipse-workspace\\javaprograms\\CucumberPractise\\src\\test\\resources\\AppsFeature\\Search.feature" }, glue = {
						"stepDefinitions", "MyHooks" }, plugin = { "pretty", "json:target/MyReports/report.json",
								"junit:target/MyReports/report.xml" }, monochrome = false, dryRun = false

)
public class AmazonTestRunner {

}
