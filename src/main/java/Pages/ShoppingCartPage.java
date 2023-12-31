package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    private WebDriver driver;
    private By BookName = By.xpath("//*[text()='Thinking in HTML']");
    private By ProceedToCheckout = By.xpath("//a[@class='checkout-button button alt wc-forward']");
    private By BillingDetails = By.xpath("//*[@id='customer_details']/div[1]/div/h3");

    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    public String checkProductName(){
        return driver.findElement(BookName).getText();
    }

    public void ClickOnProceedToCheckout(){
        driver.findElement(ProceedToCheckout).click();
    }

    public String checkBillingDetails(){
        return driver.findElement(BillingDetails).getText();
    }

}
