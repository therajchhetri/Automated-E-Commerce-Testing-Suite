package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/featureFiles",
        glue = "stepDefinitions",
        tags="@registerAsCustomer",
        plugin = {"pretty", "html:target/reports/cucumber.html", "json:target/reports/cucumber.json"}
)
public class testNGRunner extends AbstractTestNGCucumberTests {

}
