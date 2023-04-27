package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/",
        glue = "steps",
        dryRun = false,
        monochrome = true,
        tags = "@smoke",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
)
public class SmokeRunner {
}
