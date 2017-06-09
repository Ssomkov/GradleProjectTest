package com.activityPage;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Created by User on 05.06.2017.
 */
public class MainActivityPage {

    private final AppiumDriver driver;

    public MainActivityPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement getTvChanel() {
        return driver.findElement(By.name("ТВ-каналы"));
    }

    public WebElement getActionProfile() {return  driver.findElement(By.id("com.ertelecom.domrutv:id/action_profile"));}

    public WebElement getHandImageView() {return  driver.findElement(By.id("com.ertelecom.domrutv:id/imgView"));}

    public WebElement getPersonalInformation() {return  driver.findElement(By.id("com.ertelecom.domrutv:id/menu_item_profile"));}
}
