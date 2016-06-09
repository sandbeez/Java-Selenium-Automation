package com.automation.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//        Launch a new Firefox browser.
//        Open Store.DemoQA.com
//        Get Page Title name and Title length
//        Print Page Title and Title length on the Console.
//        Get Page URL and verify if the it is a correct page
//        Get Page Source (HTML Source code) and Page Source length
//        Print Page Length on  Console.
//        Close the Browser.

public class browserCommandTest {
    @Test
    public void browserCommands(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = ("http://www.Store.DemoQA.com");
        System.out.println("browser loaded");
        driver.get(url);
        System.out.println("url is "+ url);
        String curTitle = driver.getTitle();
        int titleLength = driver.getTitle().length();
        System.out.println("The title of this page is " + curTitle);
        System.out.println("The length of this title is " + titleLength);
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(url)){
            System.out.println("Verification successful!! ");
        }else {
            System.out.println("Verification failed. This sucks ");
            System.out.println(actualUrl);
            System.out.println(url);

         String pgSrc = driver.getPageSource();
         int pgSrcLength = pgSrc.length();
            System.out.println(pgSrcLength);
            System.out.println(pgSrc);


            driver.close();
            driver.quit();
        }



    }
}

