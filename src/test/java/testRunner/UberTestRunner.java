package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {
				"C:\\Users\\RAM79\\eclipse-workspace\\javaprograms\\CucumberPractise\\src\\test\\resources\\AppsFeature\\Uber.feature" }, glue = {
						"stepDefinitions" }, tags = "@All", plugin = { "pretty" })

public class UberTestRunner {

}
