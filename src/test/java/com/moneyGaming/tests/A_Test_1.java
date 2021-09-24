package com.moneyGaming.tests;

import com.moneyGaming.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_Test_1 {
    @BeforeMethod
    public void setUp(){
//opens me a chrome driver
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();



    }

    @Test
    public void test1(){

    }
    @AfterMethod
    public void tearDown(){

    }


}

