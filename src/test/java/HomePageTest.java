import org.example.BasePage.Base;
import org.example.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends Base {
    @Test
    public void homepagetest(){
        HomePage homepage = new HomePage(driver);
        homepage.clickMyAccount();
        homepage.selectLogin();
    }
}
