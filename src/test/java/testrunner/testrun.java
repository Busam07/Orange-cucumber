package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\workspace\\java2024\\OrangeHRM\\src\\test\\java\\FEATURES\\login ohrm.feature",
		 glue="stepDefinitions",
		 dryRun=true,
		 monochrome=true,
		 plugin={"pretty","html:test-output"}
)
public class testrun {

}
