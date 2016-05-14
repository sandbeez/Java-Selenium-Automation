package com.automation.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class browserCommandPractice1 {
    @Test
    public void practiceBrowserCommands(){

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
        String actualurl = driver.getCurrentUrl();
        if (actualurl.equals(url)){
            System.out.println("Verification successful!! ");
        }else {
            System.out.println("Verification failed. This sucks ");
            System.out.println(actualurl);
            System.out.println(url);

         String pgSrc = driver.getPageSource();
         int pgSrcLength = pgSrc.length();
            System.out.println(pgSrcLength);


            driver.close();
            driver.quit();
        }




    }
}
