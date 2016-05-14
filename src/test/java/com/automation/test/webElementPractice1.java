package com.automation.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class webElementPractice1 {
    @Test
    public void webElementPractice1(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String baseurl = "http://toolsqa.com/automation-practice-form/";
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        WebElement fName = driver.findElement(By.name("firstname"));
        fName.sendKeys("randy");
        System.out.println("Enter fname ");
        WebElement lName = driver.findElement(By.name("lastname"));
        lName.sendKeys("gautam");
        System.out.println("Enter lname");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        System.out.println("Click submit");

        driver.close();
        driver.quit();

    }




}

