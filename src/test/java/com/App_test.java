package com;


import com.activityPage.LoginActivityPage;
import com.activityPage.MainActivityPage;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 01.06.2017.
 */
public class App_test {

    private static AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

            File classpathRoot = new File(System.getProperty("user.dir"));
            File appDir = new File(classpathRoot, "");
            File app = new File(appDir, "app-nodrm-pre21-beta-1.22.12-master-be1b85a-2017.06.05.11.42-148.apk");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
            capabilities.setCapability("deviceName", "LG Google Nexus 5 6.0.1 -US ( trial device )");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("app", app.getAbsolutePath());
            capabilities.setCapability("app-package", "com.ertelecom.domrutv");
            capabilities.setCapability("app-activityPage", "com.ertelecom.domrutv.ui.LoginActivity");


            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterTest
    public void TearDown() {
        driver.quit();
    }

    @Test
    public void TestAuthorizationForm() {
        MainActivityPage mainLoginActivityPage = new MainActivityPage(driver);
        LoginActivityPage loginActivityPage = new LoginActivityPage(driver);
        loginActivityPage.autorization("545465887541", "saddddqweww");
        Assert.assertTrue(loginActivityPage.getSignButton().isDisplayed());
        loginActivityPage.autorization("590014831333", "Qwerty12345");
        Assert.assertTrue(mainLoginActivityPage.getHandImageView().isDisplayed());
    }
}


