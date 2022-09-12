package utilities;

import basePage.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Util extends Base {

    JavascriptExecutor js = (JavascriptExecutor)driver;

    public void openWebsite() {
        driver.get(prop.getProperty("url"));
        driver.findElement( By.cssSelector("#unic-agree")).click();

    }


    public void reloadPage() throws InterruptedException {
        Thread.sleep(2000);
        js.executeScript("window.location.reload();");
        Thread.sleep(2000);
    }


}
