package com.guru99.base;

import com.guru99.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new DriverFactory().initialize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
