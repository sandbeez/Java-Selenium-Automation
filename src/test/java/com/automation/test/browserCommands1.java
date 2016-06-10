package com.automation.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//Running TestSuite
//        [DEBUG] 2016-06-10 14:15:38.613 [main] validLoginTest - WebDriver: FirefoxDriver: firefox on MAC (8a47ed81-3830-254e-a7bd-3ec8350a280d)
//        [DEBUG] 2016-06-10 14:15:39.053 [main] validLoginTest - url is: http://toolsqa.com/automation-practice-form/
//        [DEBUG] 2016-06-10 14:15:48.854 [main] validLoginTest - maximize window
//        [DEBUG] 2016-06-10 14:15:48.866 [main] validLoginTest - the title is: TOOLSQA | Demo Form for practicing Selenium Automation
//        [DEBUG] 2016-06-10 14:15:48.976 [main] validLoginTest - enter first name:
//        [DEBUG] 2016-06-10 14:15:49.026 [main] validLoginTest - Last name is: [[FirefoxDriver: firefox on MAC (8a47ed81-3830-254e-a7bd-3ec8350a280d)] -> name: lastname]
//        [DEBUG] 2016-06-10 14:15:50.543 [main] validLoginTest - submit:

public class browserCommands1 {

    @Test (enabled = false)
            public void switchWindowTest() throws InterruptedException {
        Logger logger = LogManager.getLogger(browserCommands1.class);
        WebDriver driver = new FirefoxDriver();
        logger.debug("WebDriver: "+driver.toString());
        logger.debug("Created object of the driver which will invoke browser");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String title = driver.getTitle();
        logger.info("Print page title:"+ title);
        Thread.sleep(10000);
        String url= ("http://toolsqa.com/automation-practice-switch-windows/");
        driver.get(url);
        logger.info("Navigate to the page");
        driver.manage().window().maximize();
        logger.debug("Maximize the window");
        String curUrl = driver.getCurrentUrl();
        logger.debug("Current url is :"+ curUrl);
        String handle = driver.getWindowHandle();
        logger.debug("Get window handle:"+ handle);
        WebElement btng =driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button"));
        btng.click();
        logger.debug("Clicked on a button ");
        Set<String> handles = driver.getWindowHandles();
        logger.debug("Window handles are:"+ handles);
        String  title1 = driver.getTitle();
        logger.debug("Print title:"+ title1);



        driver.close();
        driver.quit();
    }
}
