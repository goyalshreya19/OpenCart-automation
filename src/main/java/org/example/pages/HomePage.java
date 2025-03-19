package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By myAccountDropdown = By.xpath("//a[@title=\"My Account\"]");
    private By loginOption = By.xpath("//a[text()='Login']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize here
    }

    public void clickMyAccount() {
        WebElement myAccountElement = wait.until(ExpectedConditions.elementToBeClickable(myAccountDropdown));
        myAccountElement.click();
    }

    public void selectLogin() {
        WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(loginOption));
        loginElement.click();
    }
}
