package com.activityPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;

/**
 * Created by User on 05.06.2017.
 */
public class LoginActivityPage {

    private final AndroidDriver driver;

    public WebElement getLoginTestBox() {return driver.findElement(By.id("com.ertelecom.domrutv:id/loginLogin"));}

    public WebElement getPasswordTestBox() {return driver.findElement(By.id("com.ertelecom.domrutv:id/loginPassword"));}

    public WebElement getSignButton() {return driver.findElement(By.id("com.ertelecom.domrutv:id/loginProceedButton"));}

    public void autorization(String login, String password) {
        getLoginTestBox().sendKeys("");
        getPasswordTestBox().sendKeys("");
        getLoginTestBox().sendKeys(login);
        getPasswordTestBox().sendKeys(password);
        getSignButton().click();
    }

    public LoginActivityPage(AndroidDriver driver) {
        this.driver = driver;
    }
}
