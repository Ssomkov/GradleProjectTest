package com.activityPage;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by User on 05.06.2017.
 */
public class LoginActivityPage {

    private final AppiumDriver driver;

    public WebElement getLoginTestBox() {return driver.findElement(By.id("com.ertelecom.domrutv:id/loginLogin"));}

    public WebElement getPasswordTestBox() {return driver.findElement(By.id("com.ertelecom.domrutv:id/loginPassword"));}

    public WebElement getSignButton() {return driver.findElement(By.id("com.ertelecom.domrutv:id/loginProceedButton"));}

    public WebElement getAccessLocationAllove() {return  driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));}

    public void autorization(String login, String password) {
        //getPasswordTestBox().clear();
        getLoginTestBox().sendKeys(login);
        driver.hideKeyboard();
        //getPasswordTestBox().clear();
        getPasswordTestBox().sendKeys(password);
        driver.hideKeyboard();
        getSignButton().click();
    }

    public LoginActivityPage(AppiumDriver driver) {
        this.driver = driver;
    }
}
