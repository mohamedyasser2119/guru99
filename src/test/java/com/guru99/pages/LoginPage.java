package com.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "uid")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "btnLogin")
    private WebElement submit;

    public void login(String username, String password ) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.submit.click();
    }
}
