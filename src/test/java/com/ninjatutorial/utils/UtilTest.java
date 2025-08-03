package com.ninjatutorial.utils;

import org.junit.Test;

public class UtilTest {

    @Test
    public void testGetXpath() {
       String browser =  Util.getXpath("GenericData", "browser");

       System.out.println(browser);
    }
}
