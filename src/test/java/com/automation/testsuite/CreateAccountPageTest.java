package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    MyAccountPage myAccountPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
        MyAccountPage myAccountPage = new MyAccountPage();
    }
    @Test(groups={"sanity","smoke","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
      homePage.clickOnSignInLink();
      signInPage.createEmailAccount("prime123absdc@gmail.com");
      signInPage.clickOnCreateAnAccountButton();
      createAccountPage.clickOnTitle();
      createAccountPage.enterFirstName("myfirstname");
      createAccountPage.enterLastName("mylastname");
      createAccountPage.enterCreateAccountPassword("abcd1234");
      createAccountPage.selectDaysFromDropDown("10");
      createAccountPage.selectMonthFromDropDown("10");
      createAccountPage.selectYearFromDropDown("2021");
      createAccountPage.clickOnNewsLetter();
      createAccountPage.clickOnSpecialOffers();
      createAccountPage.enterAddressFirstName("adressfname");
      createAccountPage.enterAddressLastName("addlastname");
      createAccountPage.enterCompany("company1");
      createAccountPage.enterAddressLine1("The aveneue");
      createAccountPage.enterAddressLine2("Birmingham");
      createAccountPage.enterCity("Texas");
      createAccountPage.selectState("District of Columbia");
      createAccountPage.enterZipCode("12345");
      createAccountPage.selectCountry("0");
      createAccountPage.enterAdditionalInfo("ALL Right");
      createAccountPage.enterHomePhone("123456789");
      createAccountPage.enterMobilePhone("57673463");
      createAccountPage.enterAliasAddress("SOmethingELse");
      createAccountPage.clickOnRegister();
      String actualMessage = myAccountPage.verifyMyAccountText();
      String expectedMessage="MY ACCOUNT";
        Assert.assertEquals(actualMessage,expectedMessage,"Messages Does Not Match");

    }

}
