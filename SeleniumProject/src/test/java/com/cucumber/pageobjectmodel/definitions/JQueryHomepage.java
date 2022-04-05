package com.cucumber.pageobjectmodel.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class JQueryHomepage {
 
    WebDriver driver;
 
    @FindBy(xpath = "//a[contains(.,'Droppable')]")
    WebElement DroppableBtn;
    
    @FindBy(xpath = "//a[contains(.,'Selectable')]")
    WebElement SelectableBtn;
    
    @FindBy(xpath = "//a[contains(.,'Controlgroup')]")
    WebElement ControlgroupBtn;
 
    public JQueryHomepage(WebDriver driver) {
        this.driver = driver;
 
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
 
    // Click on Droppable button
    public void clickDroppableButton() {
    	DroppableBtn.click();
    }
    
    // Click on Selectable button
    public void clickSelectableButton() {
    	SelectableBtn.click();
    }
    
    // Click on Control group button
    public void clickControlgroup() {
    	ControlgroupBtn.click();
    }
}

