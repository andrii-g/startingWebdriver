package com.task.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Andrii_Grygoruk on 10/26/2016.
 */
public class TestClass {
    @Test
    public void startChrome(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com.ua");
        driver.close();
    }

    @Test
    public void startFirefox(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com.ua");
        driver.close();
    }
}
