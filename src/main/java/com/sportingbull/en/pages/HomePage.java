package com.sportingbull.en.pages;

import com.sportingbull.en.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Community Shield')]")
    WebElement communityShieldTab;

    @CacheLookup
    @FindBy(tagName = "b")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept all cookies')]")
    WebElement acceptCookies;

    public void clickOnAcceptCookies()
    {
        clickOnElement(acceptCookies);
        log.info("Click on accept cookies " + acceptCookies.toString() + "<br>");
    }

    public void setCommunityShieldTab()
    {

        mouseHoverToElementAndClick(communityShieldTab);
        log.info("Click on CommunityShield " + communityShieldTab.toString() + "<br>");
    }

    public void setVerifyText()
    {
        String expectedMessage = "SECURITY & TRUST";
        String actualMessage = getTextFromElement(verifyText);
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Verify on security & Trust text " + verifyText.toString() + "<br>");
    }


}
