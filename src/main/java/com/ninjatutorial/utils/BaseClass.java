package com.ninjatutorial.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public WebDriver getDriver(){
        return Util.driver;
    }

    public void open(){
        try {
            if(getDriver()==null){
                String browser = Util.getXpath("GenericData" , "browser");
                if(browser.equalsIgnoreCase("chrome")){
                    WebDriverManager.chromedriver().setup();
                    Util.driver=new ChromeDriver();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
