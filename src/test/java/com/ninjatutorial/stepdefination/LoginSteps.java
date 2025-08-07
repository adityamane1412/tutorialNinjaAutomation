package com.ninjatutorial.stepdefination;

import com.ninjatutorial.PageObject.LoginPage;
import com.ninjatutorial.utils.BaseClass;
import com.ninjatutorial.utils.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends BaseClass{
    LoginPage loginpage;
    WebDriver driver;


    @Given("User open chrome browser")
    public void user_open_chrome_browser() {
        openBrowser();
        driver=getDriver();
        loginpage=new LoginPage();
    }
    @When("User launch url")
    public void user_launch_url() {
        driver.get(Util.getXpath("GenericData","url"));
        driver.manage().window().maximize();
    }
    @When("User click on MyAccount")
    public void user_click_on_my_account() {
       loginpage.clickOnMyAcc();
    }
    @When("User click on Login")
    public void user_click_on_login() {
        loginpage.clickOnLoginPage();
    }
    @When("User enter email Id {string}")
    public void user_enter_email_id(String emailId) {
        loginpage.enterEmailId(emailId);
    }
    @When("User enter Password {string}")
    public void user_enter_password(String password) {
        loginpage.enterPassword(password);
    }
    @When("User click on Login button")
    public void user_click_on_login_button() {
        loginpage.clickOnLoginBtn();
    }
    @Then("Page Tile should be displayed as {string}")
    public void page_tile_should_be_displayed_as(String expectedTitle) throws InterruptedException {
        Thread.sleep(3000);
        String actualTitle= loginpage.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
