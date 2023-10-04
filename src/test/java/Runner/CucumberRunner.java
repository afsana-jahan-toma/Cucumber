package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/01TC_Cucumber.feature"},
        glue = {"StepDefinition"},   monochrome = true,
        dryRun = false,
        plugin ={ "pretty","html:build/reports/accountManagerJourney.html"
        })
@Test
class CucomberRunner extends AbstractTestNGCucumberTests{
}