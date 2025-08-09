package com.ninjatutorial.stepdefination;

import com.ninjatutorial.PageObject.LoginPage;
import com.ninjatutorial.PageObject.OrderPage;
import com.ninjatutorial.utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class OrderSteps extends BaseClass {

    WebDriver driver;
    LoginPage loginPage ;
    OrderPage orderPage ;

    @Given("User has logged In")
    public void user_has_logged_in() throws InterruptedException {
        openBrowser();
        driver=getDriver();
        loginPage = new LoginPage();
        orderPage = new OrderPage();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        //Thread.sleep(4000);
        loginPage.clickOnMyAcc();
        loginPage.clickOnLoginPage();
        loginPage.enterEmailId("aditya1889@gmail.com");
        loginPage.enterPassword("adi123");
        loginPage.clickOnLoginBtn();
        Thread.sleep(2000);
    }
    @When("User click on search bar")
    public void user_click_on_search_bar() {
        orderPage.clickOnSearchBar();
    }
    @When("User enter {string}")
    public void user_enter(String product) {
        orderPage.enterProductName(product);
    }
    @When("User click on search button")
    public void user_click_on_search_button() {
        orderPage.clickOnSearchBtn();
    }
    @When("User click on Iphone")
    public void user_click_on_iphone() {
        orderPage.clickOnProductBtn();
    }
    @Then("User click on Add to Cart button")
    public void user_click_on_add_to_cart_button() {
        orderPage.clickOnAddToCart();
    }
}
