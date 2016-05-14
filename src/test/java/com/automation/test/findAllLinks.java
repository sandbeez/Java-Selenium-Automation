package com.automation.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class findAllLinks {
    @Test
    public void clickALinkFromList() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.toolsqa.com/");
        System.out.println("load page");
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        int i;
        for ( i = 1; i >= links.size(); i = i + 1) {

        }
        System.out.println(links.get(i).getText());

        driver.close();
        driver.quit();
    }
}
