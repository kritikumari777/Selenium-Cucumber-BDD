package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
glue= {"stepdefinitions"}
,monochrome = true,
plugin= {"pretty","junit:test-output/junitreports/RunnerTestReport.xml",
          "html:test-output/cucumberhtmlReport/RunnerTestReport.html",
          "json:test-output/cucumberjsonReport/RunnerTestReport.json"})
//,tags = {"@smoketest" and sanaty})

public class RunnerTest {
	
	

}
