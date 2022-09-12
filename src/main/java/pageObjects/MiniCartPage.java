package pageObjects;

import basePage.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MiniCartPage extends Base {

    public List<WebElement> countOfItems() {
        return driver.findElements(By.xpath("//ol[@class='minicart-items']/li"));
    }

    public WebElement productName(int item) {
        String path = "(//strong[@class='product-item-name'])[" + item + "]";
        return driver.findElement(By.xpath(path));

    }

    public WebElement productOptions(int item) {
        String path = "(//div[@class='product options'])[" + item + "]";
        return driver.findElement(By.xpath(path));
    }

    public WebElement productItemPricing(int item) {
        String path = "(//span[@class='price'])[" + item + "]";
        return driver.findElement(By.xpath(path));
    }

    public WebElement productQty(int item) {
        String path = "(//div[@class='details-qty qty'])[" + item + "]/input";
        return driver.findElement(By.xpath(path));
    }

    public WebElement updateButton(int item) {
        String path = "(//div[@class='details-qty qty'])[" + item + "]/button";
        return driver.findElement(By.xpath(path));
    }



    public WebElement productActions(int item) {
        String path = "(//div[@class='product actions'])[" + item + "]";
        return driver.findElement(By.xpath(path));
    }

    public WebElement removePopupAccept() {
        return driver.findElement(By.cssSelector(".action-primary.action-accept"));
    }

    public WebElement subTotal() {
        return driver.findElement(By.cssSelector("span[data-bind='html: cart().subtotal_incl_tax'] span[class='price']"));
    }

    public WebElement viewBasket() {
        return driver.findElement(By.cssSelector("span[data-bind=\"i18n: 'View Basket'\"]"));
    }


    public WebElement checkoutBtn() {
        return driver.findElement(By.cssSelector("#top-cart-btn-checkout"));
    }

    public WebElement extraActions() {
        return driver.findElement(By.xpath("//div[@class='extra-actions']"));
    }


    //Methods

    public void updateQty(int itemNum, String Qty) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = '" + Qty + "';", productQty(itemNum));
    }
    public void removeItem(int item) throws InterruptedException {
        Thread.sleep(5000);
        productActions(item).click();
        Thread.sleep(5000);
        removePopupAccept().click();
    }




}
