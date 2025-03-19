package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By successMessage = By.xpath("//*[contains(text(), \'Confirm Order\')][1]");

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize here
    }

    public boolean ischeckout(){
        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        return successMessageElement.isDisplayed();
    }
}
