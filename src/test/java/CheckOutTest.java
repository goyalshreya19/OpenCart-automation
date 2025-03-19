import org.example.BasePage.Base;
import org.example.pages.CheckOutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTest extends Base {
    @Test
    public void checkoutpagetest(){
        CheckOutPage checkoutpage = new CheckOutPage(driver);
        Assert.assertTrue(checkoutpage.ischeckout(), "The success message 'Confirm Order' is not displayed!");
    }

    @Test
    public void verifyCheckoutPageTitle() {
        String expectedTitle = "Checkout";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Checkout page title is incorrect!");
    }
}
