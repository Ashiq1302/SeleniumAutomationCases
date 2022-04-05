package com.cucumber.pageobjectmodel.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class Droppablepage {
	
	WebDriver driver;
	
	@FindBy(id = "draggable")
    WebElement source;
	
	@FindBy(id = "droppable")
    WebElement target;

	public Droppablepage(WebDriver driver) {
	        this.driver = driver;
	 
	        // This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	
	// Click on Droppable button
    public void DragandDrop() {
    	Actions a = new Actions(driver);
    	a.dragAndDrop(source, target).build().perform();
    }
	
}
