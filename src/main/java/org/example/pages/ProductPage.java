package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By searchBox = By.name("search");
    private By searchButton = By.cssSelector("button.btn.btn-default.btn-lg");
    private By addToCart = By.xpath("//button[@onclick=\"cart.add('45', '1');\"]");
    private By successMessage = By.cssSelector("alert alert-success alert-dismissible");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize here
    }

    public void searchProduct(String productName) {
        WebElement searchBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        searchBoxElement.sendKeys(productName);

        WebElement searchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButtonElement.click();
    }

    public void clickAddToCart() {
        WebElement addToCartElement = wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        addToCartElement.click();
    }

    public boolean isProductAdded() {
        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        return successMessageElement.isDisplayed();
    }
}
