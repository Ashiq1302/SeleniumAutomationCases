package com.cucumber.pageobjectmodel.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class Selectablepage {
	
    WebDriver driver;
	
    WebElement Itemlist1 = driver.findElement(By.xpath("//li[contains(.,'Item 1')]"));
    
    WebElement Itemlist3 = driver.findElement(By.xpath("//li[contains(.,'Item 3')]"));
    
    WebElement Itemlist7 = driver.findElement(By.xpath("//li[contains(.,'Item 7')]"));
    

    public Selectablepage(WebDriver driver) {
            this.driver = driver;

            // This initElements method will create all WebElements
            PageFactory.initElements(driver, this);
}

            //select Item 1, Item 3 and Item 7 list
    public void SelectItemList() {
    	
    	Itemlist1.click();
    	Itemlist3.click();
    	Itemlist7.click();
}

}
