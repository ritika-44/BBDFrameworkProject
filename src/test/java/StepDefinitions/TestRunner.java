package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature",glue ={"StepDefinitions","Hooks"},
plugin={"pretty","html:target/HtmlReports.html"})

public class TestRunner {
}


