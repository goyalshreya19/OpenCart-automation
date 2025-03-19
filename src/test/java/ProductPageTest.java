import org.example.BasePage.Base;
import org.example.pages.ProductPage;
import org.testng.annotations.Test;

public class ProductPageTest extends Base {
    @Test
    public void productpagetest(){
        ProductPage productpage = new ProductPage(driver);
        productpage.searchProduct("MacBook");
        productpage.clickAddToCart();

    }
}
