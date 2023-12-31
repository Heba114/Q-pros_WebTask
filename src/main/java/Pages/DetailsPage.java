package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage {
    private WebDriver driver;

    private By AddToBasketBtn = By.xpath("//button[@type='submit']");
    private By AddedSuccessfully = By.xpath("//*[@id='content']/div[1]");
    private By ShoppingCart = By.id("wpmenucartli");

    public DetailsPage(WebDriver driver){
        this.driver = driver;
    }

    public void AddToBasket(){
        driver.findElement(AddToBasketBtn).click();
    }

    public String GetSuccessMessage(){
        return driver.findElement(AddedSuccessfully).getText();
    }

    public ShoppingCartPage ClickOnShoppingCart(){
        driver.findElement(ShoppingCart).click();
        return new ShoppingCartPage(driver);
    }
}
