package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    //1.HomePage -
    //WOMEN, DRESSES, T-SHIRTS and Sign in Links and logo locatores
    //and create appropriate methods for it.

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Women")
    WebElement women;

    @FindBy(linkText="Dresses")
    WebElement dresses;

    @FindBy(linkText="T-shirts")
    WebElement tshirts;

    @FindBy(xpath="//a[normalize-space()='Sign in']")
    WebElement signIn;

    @FindBy(xpath="//img[@alt='My Store']")
    WebElement logo;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;

    public void clickOnWOMENElement(){
        clickOnElement(women);
    }
    public void clickOnDRESSES(){
        clickOnElement(dresses);
    }
    public void clickOnTSHIRTS(){
        clickOnElement(tshirts);
    }
    public void clickOnSignInLink(){
        clickOnElement(signIn);
    }
    public void verifyLogoText(){
        clickOnElement(logo);

    }
    public void checkSignInLink() {
        verifyThatElementIsDisplayed(signInLink);
    }
}
