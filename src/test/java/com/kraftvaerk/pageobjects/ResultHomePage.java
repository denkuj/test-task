package com.kraftvaerk.pageobjects;

import org.openqa.selenium.By;
import com.kraftvaerk.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;

public class ResultHomePage extends BasePage {

    public ResultHomePage(WebDriver driver) {
        super(driver);
    }


    public String checkResult (){

        return driver.getTitle();

    }



}
