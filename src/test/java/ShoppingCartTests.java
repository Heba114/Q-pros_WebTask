import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTests extends BaseTests{

    @Test
    public void CheckItemsInShoppingCart() throws InterruptedException {
        var DetailsPage = homePage.ViewBookDetails();
        var ShoppingCartPage = DetailsPage.ClickOnShoppingCart();

        homePage.ViewBookDetails();
        Thread.sleep(2000);
        DetailsPage.AddToBasket();
        Thread.sleep(2000);
        DetailsPage.ClickOnShoppingCart();

        String BookName = ShoppingCartPage.checkProductName();
        Thread.sleep(3000);
        Assert.assertEquals(BookName, "Thinking in HTML");
    }

    @Test
    public void GoToBillingDetails() throws InterruptedException {
        var DetailsPage = homePage.ViewBookDetails();
        var ShoppingCartPage = DetailsPage.ClickOnShoppingCart();

        homePage.ViewBookDetails();
        Thread.sleep(2000);
        DetailsPage.AddToBasket();
        Thread.sleep(2000);
        DetailsPage.ClickOnShoppingCart();
        Thread.sleep(2000);
        ShoppingCartPage.ClickOnProceedToCheckout();
        Thread.sleep(2000);
        String BillingDetails = ShoppingCartPage.checkBillingDetails();

        Assert.assertEquals(BillingDetails, "Billing Details");


    }
}
