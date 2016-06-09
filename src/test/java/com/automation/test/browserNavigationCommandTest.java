package com.automation.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//        Launch new Browser
//        Open DemoQA.com website
//        Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
//        Come back to Home page (Use ‘Back’ command)
//        Again go back to Registration page (This time use ‘Forward’ command)
//        Again come back to Home page (This time use ‘To’ command)
//        Refresh the Browser (Use ‘Refresh’ command)
//        Close the Browser


public class browserNavigationCommandTest {

    @Test
    public void practiceBrowserCommandNavigation(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "http://www.DemoQA.com";
        driver.get(url);

        driver.manage().window().maximize();
        System.out.println("Window maximized ");
        String title = driver.getTitle();
        System.out.println(title);
        int length = title.length();
        System.out.println(length);
        WebElement registration = driver.findElement(By.linkText("Registration"));
        try {
            registration.isDisplayed();
            System.out.println(registration);
        }catch (Exception e){
            return;

        }

        registration.click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.navigate().to(url);
        driver.navigate().refresh();


        driver.close();
        driver.quit();

    }
}
