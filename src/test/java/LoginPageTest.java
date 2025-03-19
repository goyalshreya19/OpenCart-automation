import org.example.BasePage.Base;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {
    @Test
    public void loginpagetest(){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.enterEmail("goyalshreya1908@gmail.com");
        loginpage.enterPassword("shreya@19");
        loginpage.clickLogin();

        //Assert.assertTrue(driver.getTitle().contains("My Account"), "Warning: No match for E-Mail Address and/or Password.");

    }
}
