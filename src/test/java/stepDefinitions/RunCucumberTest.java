package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = "stepDefinitions",
        tags = "@mini",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber.html", "junit:target/cucumber.xml", "json:target/cucumber.json",
        }
)
public class RunCucumberTest {

}