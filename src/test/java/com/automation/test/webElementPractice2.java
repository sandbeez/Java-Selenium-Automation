package com.automation.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class webElementPractice2 {

    @Test
    public void webElementPractice2() throws NoSuchElementException {
        Logger logger = LogManager.getLogger(webElementPractice2.class);
        WebDriver driver = new FirefoxDriver();
        String baseurl = "http://toolsqa.com/automation-practice-form/";
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        WebElement plt = driver.findElement(By.partialLinkText("Partial"));
        plt.click();
        System.out.println(plt);
        String submit = driver.findElement(By.tagName("button")).toString();
        System.out.println(submit);
        try {
            WebElement lt = driver.findElement(By.linkText("Link Test"));
            lt.click();
            System.out.println(lt);
        }catch (Exception e){
            throw new NoSuchElementException("Sucks balls!! no element found");

        }



        driver.close();
        driver.quit();




    }

}
