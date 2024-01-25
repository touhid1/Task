package com.touhidul;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebPage  extends DriverSetup{

    @Test
    public void openMavenRepositoryPageAndTestTitle(){
        browser.get("https://dhiofur.texrootsourcing.com/");
        Assert.assertEquals(browser.getTitle(), "Home page -Dhiofur");
    }
}

