package pageObjects;

import basePage.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailPage extends Base {


    public void openProduct(String productName){
        driver.get(prop.getProperty("url")+productName);
    }
    public WebElement productSize() {
        return driver.findElement(By.cssSelector("select[class*='swatch-select']"));

    }

    public WebElement productName() {
        return driver.findElement(By.cssSelector(".base"));

    }
    public WebElement productPrice() {
        return driver.findElement(By.cssSelector("span[id='product-price-30951'] span[class='price']"));

    }

    public WebElement addToCartBtn() {
        return driver.findElement(By.cssSelector("#product-addtocart-button"));

    }

    public WebElement showCartBtn() {
        return driver.findElement(By.cssSelector(".action.showcart"));

    }
    public void selectSize(String size){
        new Select(productSize()).selectByVisibleText(size);

    }

}
