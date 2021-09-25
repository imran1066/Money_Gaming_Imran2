package com.moneyGaming.tests;

import com.moneyGaming.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_Test_1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
//opens me a chrome driver
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

    }

    @Test
    public void test1() throws InterruptedException {
        WebElement nameBox= driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("Adam");

        WebElement surnameBox = driver.findElement(By.xpath("//input[@name='map(lastName)']"));

        surnameBox.sendKeys("Smith");

        Thread.sleep(3000);



    }
    @AfterMethod
    public void tearDown(){
        driver.close();

    }


}

