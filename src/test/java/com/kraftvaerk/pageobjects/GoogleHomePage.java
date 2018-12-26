package com.kraftvaerk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class GoogleHomePage extends BasePage {


    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "http://www.google.com/";

    By searchButton = By.name("btnK");
    By luckyButton = By.name("btnI");
    By searchText = By.name("q");


    public GoogleHomePage openGoogleHome (){
        driver.get(baseURL);
        return this;
    }

    public GoogleHomePage writeTextGoogle (String text){
        writeText(searchText,text);
        return new GoogleHomePage(driver);
    }

    public GoogleSearchPage goSearchPage (){
        click(searchButton);
        return new GoogleSearchPage(driver);
    }



    public GoogleSearchPage goSearchPageLucky (){
        click(luckyButton);
        return new GoogleSearchPage(driver);
    }

}
