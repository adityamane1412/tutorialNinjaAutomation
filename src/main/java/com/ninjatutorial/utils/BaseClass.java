package com.ninjatutorial.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {

    public WebDriver getDriver(){
        return Util.driver;
    }

    public void openBrowser(){
        try {
            if(getDriver()==null){
                String browser = Util.getXpath("GenericData" , "browser");
                if(browser.equalsIgnoreCase("chrome")){
                    WebDriverManager.chromedriver().setup();
                    Util.driver=new ChromeDriver();
                    Util.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
