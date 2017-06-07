package com.activityPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;

/**
 * Created by User on 05.06.2017.
 */
public class MainActivityPage {

    private final AndroidDriver driver;



    public MainActivityPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement getTvChanel() {
        return driver.findElement(By.name("ТВ-каналы"));
    }

    public WebElement getAccountElement() {return  driver.findElement(By.id("com.ertelecom.domrutv:id/action_profile"));}

    public WebElement getHandImageView() {return  driver.findElement(By.id("com.ertelecom.domrutv:id/imgView"));}



}
