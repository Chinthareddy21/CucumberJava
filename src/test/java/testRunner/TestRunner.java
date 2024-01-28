package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"}, glue = {"steps"}, plugin = {"pretty", "html:report/login" +
		".html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}