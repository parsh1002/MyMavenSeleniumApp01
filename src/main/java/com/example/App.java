package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        // REMOVE HEADLESS MODE
        // options.addArguments("--headless=new");

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://automationexercise.com/products");

        // Product 4
        driver.findElement(By.cssSelector("[data-product-id='4']")).click();
        Thread.sleep(2000);

        driver.findElement(
            By.cssSelector(".btn.btn-success.close-modal.btn-block")
        ).click();

        // Product 5
        driver.findElement(By.cssSelector("[data-product-id='5']")).click();
        Thread.sleep(2000);

        driver.findElement(
            By.cssSelector(".btn.btn-success.close-modal.btn-block")
        ).click();

        // Product 6
        driver.findElement(By.cssSelector("[data-product-id='6']")).click();
        Thread.sleep(2000);

        driver.findElement(
            By.cssSelector(".btn.btn-success.close-modal.btn-block")
        ).click();

        // Open cart
        driver.get("https://automationexercise.com/view_cart");

        Thread.sleep(10000);

        // driver.quit();
    }
}
