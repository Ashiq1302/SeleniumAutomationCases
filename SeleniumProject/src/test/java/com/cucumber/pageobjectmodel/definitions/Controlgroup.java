package com.cucumber.pageobjectmodel.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Controlgroup {

	WebDriver driver;
	
	WebElement Automatic1 = driver.findElement(By.xpath("(//label[contains(.,'Automatic')])[1]"));
	
	
	WebElement Insurance1 = driver.findElement(By.xpath("(//label[contains(.,'Insurance')])[1]"));
	
	
	WebElement Carselection = driver.findElement(By.xpath("//input[@id='horizontal-spinner']"));
	
	
	WebElement Standard2 = driver.findElement(By.xpath("(//label[contains(.,'Standard')])[2]"));
	
	
	WebElement Insurance2 = driver.findElement(By.xpath("(//label[contains(.,'Insurance')])[2]"));
	
	
	@FindBy(id = "book")
    WebElement BookNowBtn;
	
	public void ControlGroupPage(WebDriver driver) {
        this.driver = driver;
 
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

	public void CarDropdown1() {
		Select objSelect =new Select(driver.findElement(By.xpath("//select[@id='car-type']")));
		objSelect.selectByVisibleText("SUV");
    }
	
	public void CarDropdown2() {
		Select objSelect =new Select(driver.findElement(By.xpath("//select[@id='ui-id-8']")));
		objSelect.selectByVisibleText("Truck");
    }
	
	public void RadioBtn1() {
		Automatic1.click();
		Insurance1.click();
		
    }
	
	public void RadioBtn2() {
		Standard2.click();
		Insurance2.click();
		BookNowBtn.click();
    }
	
	public void carselection() {
		Carselection.sendKeys("2");
    }
}


