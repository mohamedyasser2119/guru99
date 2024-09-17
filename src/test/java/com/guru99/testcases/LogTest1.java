package com.guru99.testcases;

import com.guru99.base.BaseTest;
import com.guru99.factory.DriverFactory;
import com.guru99.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

import javax.swing.text.html.CSS;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;


public class LogTest1 extends BaseTest {
    @Test
    public void testLog() {
        driver.get("http://www.demo.guru99.com/V4/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mngr589019", "jEqezUm");
        String actualresult = driver.getTitle();
        if (actualresult.contains("Guru99 Bank Manager HomePage")){
            System.out.println("Test Passed");
        }else
            System.out.println("Test Failed");


    }
    @Test
    public void testLogWithInVaildUsername() {
        driver.get("http://www.demo.guru99.com/V4/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mng589019", "jEqezUm");

    }

    @Test
    public void testLog3() {
        driver.get("http://www.demo.guru99.com/V4/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mng589019", "jEqezUm");
    }

    @Test
    public void testLog4() {
        driver.get("http://www.demo.guru99.com/V4/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mngr589019", "jEqeUm");
    }
    @Test
    public void takeScreenshot() throws IOException {
        driver.get("http://www.demo.guru99.com/V4/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mngr589019", "jEqezUm");
        File screenshotFile = driver.findElement(By.id("site-name")).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile , new File(".//src//test//java//com.guru99.screen.png") );


    }
}
