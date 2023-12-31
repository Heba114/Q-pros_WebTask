package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By book = By.xpath("//*[text()='Thinking in HTML']");
    private By bookPrice = By.xpath("(//span[@class='woocommerce-Price-amount amount'])[3]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean CheckIsBookAndPriceExist(){
        driver.findElement(book).isDisplayed();
        driver.findElement(bookPrice).isDisplayed();
        return true;
    }

    public DetailsPage ViewBookDetails(){
        driver.findElement(book).click();
        return new DetailsPage(driver);
    }


}
