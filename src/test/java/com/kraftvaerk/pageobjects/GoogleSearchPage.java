package com.kraftvaerk.pageobjects;

import com.kraftvaerk.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.testng.Assert;




public class GoogleSearchPage extends BasePage {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }


    By resultAmount = By.id("resultStats");
    By listOfSections = By.name("hdtbSum");


    public ResultHomePage openPageByLink (String link){

        String pagePath = "//a[@href='" + link + "']";
        By openLink = By.xpath(pagePath);
        click(openLink);
        return new ResultHomePage(driver);

    }

}
