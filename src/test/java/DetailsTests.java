import org.testng.Assert;
import org.testng.annotations.Test;

public class DetailsTests extends BaseTests {

    @Test
    public void CheckIsBookExist(){
        homePage.CheckIsBookAndPriceExist();
        Assert.assertTrue(true, "Displayed");
    }


    @Test
    public void AddToBasketTest() throws InterruptedException {
        var DetailsPage = homePage.ViewBookDetails();
        Thread.sleep(3000);
        DetailsPage.AddToBasket();
        Thread.sleep(3000);
        String SuccessMsg = DetailsPage.GetSuccessMessage();
        Assert.assertEquals(SuccessMsg, "VIEW BASKET\n" +
                "“Thinking in HTML” has been added to your basket.");
    }
}
