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
        Thread.sleep(1000);

        WebElement HomeLink = browser.findElement(By.cssSelector(".header__wrap.stricky.original"));
        System.out.println(HomeLink.getText());
        HomeLink.click();


        WebElement selectDropdown = browser.findElement(By.cssSelector("body > div:nth-child(3) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
        selectDropdown.click();
        Thread.sleep(5000);
    }
}
