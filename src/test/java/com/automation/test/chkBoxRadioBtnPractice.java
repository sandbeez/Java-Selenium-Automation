package com.automation.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class chkBoxRadioBtnPractice {

    public static void main(String[] args) throws Exception {


        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = " http://toolsqa.com/automation-practice-form/";
        driver.get(url);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        List<WebElement> sex = driver.findElements(By.name("sex"));
        System.out.println(sex);
        boolean v = sex.get(0).isSelected();

        if (v = true) {
            sex.get(1).click();
            System.out.println("First button is not selected");
        } else {
            sex.get(1).click();
            System.out.println("Second button selected");
        }

        WebElement exp = driver.findElement(By.id("exp-2"));
        exp.click();
        List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));

        // This will tell you the number of Check Boxes are present
        int iSize = chkBx_Profession.size();

        // Start the loop from first Check Box to last Check Boxe
        for(int i=0; i < iSize ; i++ ){
            // Store the Check Box name to the string variable, using 'Value' attribute
            String sValue = chkBx_Profession.get(i).getAttribute("value");

            // Select the Check Box it the value of the Check Box is same what you are looking for
            if (sValue.equalsIgnoreCase("Automation Tester")){
                chkBx_Profession.get(i).click();
                // This will take the execution out of for loop
                break;
            }
        }
        // Step 6: Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
        WebElement oCheck_Box = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
        oCheck_Box.click();

        // Kill the browser
        driver.quit();

    }

}










