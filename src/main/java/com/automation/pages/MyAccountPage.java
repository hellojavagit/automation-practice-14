package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//h1[normalize-space()='My account']")
    WebElement myAccount;

    public String verifyMyAccountText(){
        return getTextFromElement(myAccount);
    }
}
