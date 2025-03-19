package org.example.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
    protected WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown(){
        if(driver != null){
            driver.quit();
        }
    }
}
