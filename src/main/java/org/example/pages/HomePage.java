package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By myAccountDropdown = By.xpath("//a[@title=\"My Account\"]");
    private By loginOption = By.xpath("//a[text()='Login']");
    private By searchBox = By.name("search");
    private By searchButton = By.cssSelector("button.btn.btn-default.btn-lg");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickMyAccount(){
        driver.findElement(myAccountDropdown).click();
    }

    public void selectLogin(){
        driver.findElement(loginOption).click();
    }

    public void searchProduct(){
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

}
