package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class myFirstTest {


    @Test
    public void launchDriver() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.getTitle();
        try {


            WebElement gmail = driver.findElement(By.linkText("gmail"));
            gmail.click();
        } catch (Exception e){

        }

        WebElement SignIn = driver.findElement(By.xpath(".//*[@id='gb_70']"));
        SignIn.click();
        WebElement email = driver.findElement(By.xpath(".//*[@id='Email']"));
        email.sendKeys("santoshbasnet99@gmail.com");
        WebElement next = driver.findElement(By.xpath(".//*[@id='next']"));
        next.click();
        Thread.sleep(10000);
        WebElement pw = driver.findElement(By.cssSelector("#Passwd"));
        pw.sendKeys("Paris4321");
        WebElement logIn = driver.findElement(By.xpath("//*[@id=\"signIn\"]"));
        logIn.click();
        Thread.sleep(10000);
        driver.navigate().refresh();
        WebElement gmail = driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a"));
        gmail.click();
        Thread.sleep(1000);
        WebElement compose = driver.findElement(By.xpath("//div[text()='COMPOSE']"));
        compose.click();
        driver.switchTo().activeElement();
        WebElement to = driver.findElement(By.xpath("//textarea[@name='to']"));
        to.sendKeys("bidhya_p@yahoo.com");
        WebElement subject = driver.findElement(By.xpath("input[@name='subjectbox"));
        subject.sendKeys("test");
        WebElement body = driver.findElement(By.xpath("//div[@class='gmail_default']"));
        body.sendKeys("Hi, check out my first selenium test");
        WebElement send = driver.findElement(By.linkText("Send"));
        send.click();
        Thread.sleep(1000);

        driver.close();
        driver.quit();



    }

}