package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By emailField = By.id("input-email");
    private By passwordField = By.id("input-password");
    private By loginButton = By.xpath("//input[@class=\'btn btn-primary\']");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(){
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
}
