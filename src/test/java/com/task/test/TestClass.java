package com.task.test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.MarionetteDriverManager;
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
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com.ua");
        driver.close();
    }

    @Test
    public void startFirefox(){
        MarionetteDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com.ua");
        driver.close();
        driver.quit();
    }
}