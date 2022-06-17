package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TopMenuBarPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public TopMenuBarPage(){
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(css = "div.privacy_prompt.explicit_consent div.privacy_prompt_content:nth-child(2) div.option_set:nth-child(3) div.option:nth-child(2) > label.dialog_button")
    WebElement cookie;

    @CacheLookup
    @FindBy(linkText = "Online Slots")
    WebElement onlineSlot;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Play Online Slots at Virgin Games')]")
    WebElement onLineSlotPage;

    @CacheLookup
    @FindBy(linkText = "Live Casino")
    WebElement liveCasino;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Try Live Casino - Live Action Dealers & Selection ')]")
    WebElement liveCasinoPage;

    @CacheLookup
    @FindBy(linkText = "Casino")
    WebElement casino;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Play Online Casino Games, with Many Classics to Ch')]")
    WebElement casinoPage;




    public void acceptCookie(){
        clickOnElement(cookie);
        log.info("Accept Cookie: " + cookie.toString());
    }
    public void clickOnOnlineSlot(){
        clickOnElement(onlineSlot);
        log.info("Click on Online slot: " + onlineSlot.toString());
    }
    public void verifyUserIsSucessfullyOnLineSlotPage() {
        String expected = "Play Online Slots at Virgin Games";
        Assert.assertEquals(expected, onLineSlotPage.getText());
        log.info("Verify on line slot page: " + onlineSlot.toString());

    }   public void clickOnLiveCasino(){
        clickOnElement(liveCasino);
        log.info("Click on Live Casino: " + liveCasino.toString());
    }
    public void verifyUserIsSuccessfullyOnLiveCasinoPage() {
        String expected = "Try Live Casino - Live Action Dealers & Selection of Games";
        Assert.assertEquals(expected, liveCasinoPage.getText());
        log.info("Verify live casino page: " + liveCasinoPage.toString());
    }
    public void clickOnCasino(){
        clickOnElement(casino);
        log.info("Click on Casino: " + casino.toString());
    }
    public void verifyUserIsSuccessfullyOnCasinoPage(){
        String expected = "Play Online Casino Games, with Many Classics to Choose From";
        Assert.assertEquals(expected,casinoPage.getText());
        log.info("Verify casino page: " + casinoPage.toString());

    }


    }







