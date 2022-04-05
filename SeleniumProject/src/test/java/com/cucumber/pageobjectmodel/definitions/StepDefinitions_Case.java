package com.cucumber.pageobjectmodel.definitions;
 
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class StepDefinitions_Case {
    String driverPath = "C:\\Users\\advna\\Downloads\\chromedriver_win32";

    WebDriver driver;
    
    Login  objLogin;
 
    JQueryHomepage objJQueryHomepage;
 
    Droppablepage objDroppablepage;
    
    Selectablepage objSelectablepage;
    
    Controlgroup objControlgrouppage;
    
    @Before
    public void setup() {
 
        // Initialize the webdriver and open the browser
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/");
    }
 
    /* 
     * This test go to https://jqueryui.com/ Verify login page title as jQuery UI
     */
 
    @Given("User is on jQuery Home page")
    public void loginTest() {
 
        // Create Login Page object
        objLogin = new Login(driver);
        String str = objLogin.getLoginTitle();
        Assert.assertTrue(str.contains("jQuery UI"));
 
    }
 
    @When("User select \"Droppable\" option from left menu under Interactions")
    public void Droppable() {
 
        // Click "Droppable" option from the home page
    	objJQueryHomepage = new JQueryHomepage(driver);
    	objJQueryHomepage.clickDroppableButton();
   
    	
    }
    
    @When("User select \"Selectable\" option from left menu under Interactions")
    public void Selectable() {
 
        // Click "Selectable" option from the home page
    	objJQueryHomepage = new JQueryHomepage(driver);
    	objJQueryHomepage.clickSelectableButton();
    	
    }
    
    @When("User select \"Controlgroup\" option from left menu under Widgets")
    public void Controlgroup() {
 
        // Click "Selectable" option from the home page
    	objJQueryHomepage = new JQueryHomepage(driver);
    	objJQueryHomepage.clickControlgroup();
    	
    }
 
    @Then("User should be able to Drag \"Drag me to my target\" component to \"Drop here\" component")
    public void Droppableverify() {
 
    	 // Drag "Drag me to my target" component to "Drop here" component
    	objDroppablepage = new Droppablepage(driver);
    	objDroppablepage.DragandDrop();
 
    }
    
    @Then("User should be able to select \"Item 1\",\"Item 3\",\"Item 7\"")
    public void Selectableverify() {
 
    	 // select "Item 1","Item 3","Item 7"
    	objSelectablepage = new Selectablepage(driver);
    	objSelectablepage.SelectItemList();
    }
    
    @Then("User should be able to perform the actions")
    public void Controlgroupverify() {
 
    	objControlgrouppage = new Controlgroup();
    	objControlgrouppage.CarDropdown1();
    	objControlgrouppage.RadioBtn1();
    	objControlgrouppage.carselection();
    	objControlgrouppage.CarDropdown2();
    	objControlgrouppage.RadioBtn2();
    }
 
    @After
    public void quitbrowser() {
 
        // Close the browser
        driver.quit();
    }
}