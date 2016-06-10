package com.automation.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class findAllLinks {
    @Test
    public void clickALinkFromList() {
        Logger logger = LogManager.getLogger(findAllLinks.class);
        WebDriver driver = new FirefoxDriver();
        logger.debug("WebDriver: "+driver.toString());
        driver.get("http://www.toolsqa.com/");
        logger.debug("load page");
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        logger.debug(links.size());
        int i;
        for ( i = 1; i >= links.size(); i = i + 1) {

        }
        logger.debug(links.get(i).getText());

        driver.close();
        driver.quit();
    }
}
