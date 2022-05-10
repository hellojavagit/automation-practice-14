package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    //2.SignInPage
    //Email address, Password, Sign In Button, Create an account button and
    //"AUTHENTICATION" text, "CREATE AN ACCOUNT" text Locators
    // and create appropriate methods for it.

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement signInEmail;

    @FindBy(id="email_create")
    WebElement createEmail;

    @FindBy(id = "passwd")
    WebElement signInpassword;

    @FindBy (xpath = "//a[normalize-space()='Sign in']")
    WebElement signInText;

    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOut;

    @FindBy(id = "SubmitLogin")
    WebElement signInButton;

    @FindBy(id = "SubmitCreate")
    WebElement createAccountButton;

    @FindBy(xpath = "//h1[normalize-space()='Authentication']")
            // @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement authenticationText;

    @FindBy(xpath = "//h3[normalize-space()='Create an account']")
    WebElement createAccountText;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]")
    WebElement errorMessageLoginFailed;

    public void createEmailAccount(String keys){
        sendTextToElement(createEmail,keys);
    }

    public void enterEmailId(String key) {

        sendTextToElement(signInEmail,key);
    }

    public void enterPassword(String key) {
        sendTextToElement(signInpassword,key);
    }
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOutLink;

    public void clickOnSignInButton() {
        clickOnElement(signInButton);
    }
    public void checkSignOutLinkIsDisplayed() {
        verifyThatElementIsDisplayed(signOutLink);
    }

    public void clickOnCreateAnAccountButton() {
        clickOnElement(createAccountButton);
    }

    public String verifyAuthenticationText() {
        return getTextFromElement(authenticationText);
    }

    public String verifyCreateAnAccountText() {
        return getTextFromElement(createAccountText);
    }

    public String verifyLoginFailed() {
        return getTextFromElement(errorMessageLoginFailed);
    }
    public String signOutText(){
      return  getTextFromElement(signOut);
    }
    public void clickOnSignOut(){
        clickOnElement(signOut);
    }
    public String  verifySignInText()
    {
        return getTextFromElement(signInText);
    }


public void sendFieldsToElements(String signInEmail, String signInpassword,
                                                         String message) {
    enterEmailId(signInEmail);
    enterPassword(signInpassword);
    clickOnSignInButton();
}




}