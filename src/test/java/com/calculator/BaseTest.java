package com.calculator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;

    @BeforeClass
    public void setup() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid", "192.168.85.101:5555");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "11.0");
        capabilities.setCapability("appium:appPackage", "com.google.android.calculator");
        capabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("fullReset", "false");


        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }
}
