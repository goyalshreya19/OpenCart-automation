import org.example.BasePage.Base;
import org.example.pages.CartPage;
import org.testng.annotations.Test;

public class CartPageTest extends Base {
    @Test
    public void cartpagetest(){
        CartPage cartpage = new CartPage(driver);
        cartpage.clickCheckOut();
    }
}
