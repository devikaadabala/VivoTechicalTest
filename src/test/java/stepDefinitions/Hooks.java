package stepDefinitions;

import basePage.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.IOException;

public class Hooks extends Base {

    @Before
    public void initiateBrowser() throws IOException {
        initialiseDriver();
    }

    @After
    public void endTest(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", "Screenshot");
            } catch (WebDriverException e) {
                e.printStackTrace();
            }
        } else {
            try {
                scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", "Screenshot");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.close();
    }
}
