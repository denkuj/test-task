package com.kraftvaerk.tests;


import com.kraftvaerk.pageobjects.BasePage;
import com.kraftvaerk.pageobjects.GoogleHomePage;
import com.kraftvaerk.pageobjects.GoogleSearchPage;
import com.kraftvaerk.pageobjects.ResultHomePage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SearchTest extends BaseTest {


    @Test (priority = 0)
    public void SearchYandexPage(){

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.openGoogleHome();
        googleHomePage.writeTextGoogle("yandex.ru");
        GoogleSearchPage googleSearchPage = googleHomePage.goSearchPage();
        ResultHomePage resultHomePage = googleSearchPage.openPageByLink("https://www.yandex.ru/"); // href used
        Assert.assertEquals("Яндекс", resultHomePage.checkResult());

    }

/*


*/



}
