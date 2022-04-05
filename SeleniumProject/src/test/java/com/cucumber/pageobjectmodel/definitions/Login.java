package com.cucumber.pageobjectmodel.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Login {
	
	WebDriver driver;
 
    @FindBy(xpath = "(//a[contains(.,'jQuery UI')])[2])")
    WebElement titleText;
 
    public Login(WebDriver driver) {
 
        this.driver = driver;
 
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
 
    // Get the title of Login Page
    public String getLoginTitle() {
        return titleText.getText();
    }
    }