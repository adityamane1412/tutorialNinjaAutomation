package com.ninjatutorial.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@Slf4j
public class BaseClass {

    public WebDriver getDriver(){
        return Util.driver;
    }

   // Logger log = Logger.getLogger(String.valueOf(BaseClass.class));

    public void openBrowser(){
        try {
            if(getDriver()==null){
                String browser = Util.getXpath("GenericData" , "browser");
                if(browser.equalsIgnoreCase("chrome")){
                    log.info("crating chrome driver");
                   // System.out.println("crating chrome driver");
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
