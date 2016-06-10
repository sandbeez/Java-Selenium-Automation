package com.automation.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//Running TestSuite
//        [DEBUG] 2016-06-10 14:43:51.419 [main] validLoginTest - Created object of the driver which will invoke browser
//        [DEBUG] 2016-06-10 14:43:51.420 [main] validLoginTest - WebDriver: FirefoxDriver: firefox on MAC (aeb04956-37dd-1441-b948-60442186cc38)
//        [DEBUG] 2016-06-10 14:43:51.436 [main] validLoginTest - navigate to: http://toolsqa.com/automation-practice-form/
//        [DEBUG] 2016-06-10 14:43:52.242 [main] validLoginTest - Verify url: http://toolsqa.com/automation-practice-form/
//        [DEBUG] 2016-06-10 14:44:07.764 [main] validLoginTest - maximize window
//        [DEBUG] 2016-06-10 14:44:07.775 [main] validLoginTest - Get the page title: TOOLSQA | Demo Form for practicing Selenium Automation
//        [DEBUG] 2016-06-10 14:44:07.881 [main] validLoginTest - enter first name:
//        [DEBUG] 2016-06-10 14:44:07.931 [main] validLoginTest - Enter last name
//        [DEBUG] 2016-06-10 14:44:10.399 [main] validLoginTest - submit:

public class validLoginTest {
    @Test (enabled = true)
    public void webElementPractice1(){
        Logger logger = LogManager.getLogger(validLoginTest.class);
        WebDriver driver = new FirefoxDriver();
        logger.debug("Created object of the driver which will invoke browser");
        logger.debug("WebDriver: "+driver.toString());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String base_url = "http://toolsqa.com/automation-practice-form/";
        logger.debug("navigate to: "+ base_url);
        driver.get(base_url);
        logger.debug("Verify url: " + base_url);
        driver.manage().window().maximize();
        logger.debug("maximize window");
        String title = driver.getTitle();
        logger.debug("Get the page title: " + title);
        WebElement fName = driver.findElement(By.name("firstname"));
        fName.sendKeys("randy");
        logger.debug("enter first name: ");
        WebElement lName = driver.findElement(By.name("lastname"));
        lName.sendKeys("gautam");
        logger.debug("Enter last name");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        logger.debug("submit: ");

        driver.close();
        driver.quit();

    }




}

