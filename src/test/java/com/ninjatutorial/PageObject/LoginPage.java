package com.ninjatutorial.PageObject;

import com.ninjatutorial.utils.BaseClass;
import com.ninjatutorial.utils.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {

WebDriver driver;
public LoginPage(){
    driver=getDriver();
}

public void clickOnMyAcc() {
    driver.findElement(By.xpath(Util.getXpath("Login", "myaccount"))).click();
}

public void clickOnLoginPage() {
    driver.findElement(By.xpath(Util.getXpath("Login", "login"))).click();
}

public void enterEmailId(String emailId) {
    driver.findElement(By.xpath(Util.getXpath("Login", "emailid"))).sendKeys(emailId);
}

public void enterPassword(String password){
    driver.findElement(By.xpath(Util.getXpath("Login","password"))).sendKeys(password);
}

public void clickOnLoginBtn(){
    driver.findElement(By.xpath(Util.getXpath("Login","loginbtn"))).click();
}

public String getTitle(){
    String title= driver.getTitle();
    return title;
}
}
