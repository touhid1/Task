package com.touhidul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebElement extends DriverSetup{

    @Test
    public void TestElement() throws InterruptedException {
        browser.get("https://dhiofur.texrootsourcing.com/");
        WebElement header = browser.findElement(By.cssSelector(".header__top-wrap"));
        System.out.println(header.getText());


        WebElement text = browser.findElement(By.className("header__top-cta"));
        System.out.println(text.getText());

        Thread.sleep(1000);


        WebElement openHome = browser.findElement(By.linkText("Home"));
        openHome.click();
        Thread.sleep(500);

        WebElement openTa = browser.findElement(By.linkText("About us"));
        openTa.click();
        Thread.sleep(1000);

        WebElement openBlog = browser.findElement(By.linkText("Blog"));
        openBlog.click();
        Thread.sleep(1000);


        Thread.sleep(1000);

        WebElement selectDropdown = browser.findElement(By.cssSelector("body > div:nth-child(3) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
        selectDropdown.click();
        Thread.sleep(5000);
    }
}
