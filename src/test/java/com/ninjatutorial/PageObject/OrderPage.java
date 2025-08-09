package com.ninjatutorial.PageObject;

import com.ninjatutorial.utils.BaseClass;
import com.ninjatutorial.utils.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends BaseClass {

    WebDriver driver;
    public OrderPage(){
        driver=getDriver();
    }


    public void clickOnSearchBar(){
        driver.findElement(By.xpath(Util.getXpath("Order","searchbar"))).click();
    }

    public void enterProductName(String pname){
        driver.findElement(By.xpath(Util.getXpath("Order","searchbar"))).sendKeys(pname);
    }

    public void clickOnSearchBtn(){
        driver.findElement(By.xpath(Util.getXpath("Order","searchbtn"))).click();
    }

    public void clickOnProductBtn(){
        driver.findElement(By.xpath(Util.getXpath("Order","productbtn"))).click();
    }

    public void clickOnAddToCart(){
        driver.findElement(By.xpath(Util.getXpath("Order","cartbtn"))).click();
    }

}
