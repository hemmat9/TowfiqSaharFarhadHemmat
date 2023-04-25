package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.Locale;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/",
        glue = "steps",
        dryRun = true,
        monochrome = true,
        tags = "@smoke",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
)
public class SmokeRunner {
}
