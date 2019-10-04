package stepDefination;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//features//login.feature",
		glue = "stepDefination",
		//plugin = {"pretty","html:target/cucumber-reports"}
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		)

public class TestRunner {
	

}
