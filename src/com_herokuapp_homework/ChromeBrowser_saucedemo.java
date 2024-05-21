package com_herokuapp_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
public class ChromeBrowser_saucedemo {

    String BaseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) {

        //1. Setup chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open URL.
        driver.get("https://www.saucedemo.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3. Print the title of the page.
        driver.getTitle();

        //4. Print the current url.
        System.out.println("The current url is:"+driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println(driver.getPageSource());

        // 6. Enter the email to email field.
        driver.findElement(By.id("user-name")).sendKeys("error_user");

        //7. Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //8. Click on Login Button.
        driver.findElement(By.id("login-button")).click();

        //9. Print the current url.
        System.out.println("The current url is:"+driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.navigate().back();

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.quit();





    }


}
