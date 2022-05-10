package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
@Listeners(CustomListeners.class)
public class SignPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
    }

  @Test(groups={"sanity","smoke","regression"})
    public void userShouldNavigateToSignInPageSuccessFully() {
        homePage.clickOnSignInLink();
        String authentExpectedMessage = "AUTHENTICATION";
        String authentactualMessage = signInPage.verifyAuthenticationText();
        Assert.assertEquals(authentactualMessage, authentExpectedMessage, "Messages Does Not Match");
        String createExpectedMessage = "CREATE AN ACCOUNT";
        String createActualMessage = signInPage.verifyCreateAnAccountText();
        Assert.assertEquals(createActualMessage,createExpectedMessage,"CreateAccount messages does not match");
    }

    @Test(groups={"smoke","regression"},dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,
                                                            String message){
        homePage.clickOnSignInLink();
        signInPage.sendFieldsToElements(username,password,message);
        String expectedMessage = "There is 1 error\n" + "Authentication failed.";
        String actualMessage = signInPage.verifyLoginFailed();
        Assert.assertEquals(actualMessage,expectedMessage,"messages does not match");
    }
    @Test(groups={"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnSignInLink();
        signInPage.enterEmailId("prime123@gmail.com");
        signInPage.enterPassword("abcd123");
        signInPage.clickOnSignInButton();
        //Verify that Sign out link is displayed
        String actualMessage = signInPage.signOutText();
        String expectedMessage= "Sign out";
        Assert.assertEquals(actualMessage,expectedMessage,"NO Match");

    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnSignInLink();
        signInPage.enterEmailId("prime123456@gmail.com");
        signInPage.enterPassword("abcd123");
        signInPage.clickOnSignInButton();
        signInPage.clickOnSignOut();
        //Verify that Sign In Link displayed
        String actualMessage = signInPage.verifySignInText();
        String expectedMessage = "Sign in";
        Assert.assertEquals(actualMessage,expectedMessage,"Texts does not match");


    }
}