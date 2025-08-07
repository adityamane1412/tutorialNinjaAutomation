package com.ninjatutorial.utils;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Slf4j
public class Util {

    public static WebDriver driver;

    public static final String getXpath(final String pagename, final String genericdatakey) {

        Properties properties = new Properties();
        String propertyFile = pagename + ".properties";
        try (InputStream fis = Util.class.getClassLoader().getResourceAsStream(propertyFile)) {

            if(null != fis) {
                log.info("Loading properties");
                properties.load(fis);
            } else {
                throw new FileNotFoundException("File Not Found " + propertyFile);
            }
            return properties.getProperty(genericdatakey);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }
}