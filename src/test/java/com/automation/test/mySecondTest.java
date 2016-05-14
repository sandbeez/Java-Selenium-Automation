package com.automation.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class mySecondTest {

    @Test
            public void switchWindowTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url= ("http://toolsqa.com/automation-practice-switch-windows/");
        driver.get(url);
        driver.manage().window().maximize();
        String curUrl = driver.getCurrentUrl();
        System.out.println(curUrl);
        System.out.println("retrieved the site");
        String handle = driver.getWindowHandle();
        System.out.println(handle);
        WebElement btng =driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button"));
        btng.click();
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        String  title = driver.getTitle();
        System.out.println(title);



        driver.close();
        driver.quit();
    }
}
