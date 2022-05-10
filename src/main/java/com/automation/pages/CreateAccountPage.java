package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    //3.CreateAccountPage -
    //All the fields locators and create appropriate method for it.


    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@value='2']")
    WebElement mrsRadioButton;

    @FindBy(id = "customer_firstname")
    WebElement firstName;

    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @FindBy(id="email")
    WebElement createAccountEmail;

    @FindBy(id = "passwd")
    WebElement createAccountPassword;

    @FindBy(id = "days")
    WebElement days;

    @FindBy(id = "months")
    WebElement month;

    @FindBy(id = "years")
    WebElement years;

    @FindBy(id = "newsletter")
    WebElement clickNewsLetter;

    @FindBy(id = "optin")
    WebElement clickSpecialOffers;

    @FindBy(id="firstname")
    WebElement addressFirstName;

    @FindBy(id = "lastname")
    WebElement addressLastName;

    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "address1")
    WebElement addressLine1;

    @FindBy(id="address2")
    WebElement addressLine2;

    @FindBy (id="city")
    WebElement city;

    @FindBy(id="id_state")
    WebElement state;

    @FindBy(name ="postcode")
    WebElement zipCode;

    @FindBy(id="id_country")
    WebElement country;

    @FindBy(id="other")
    WebElement additionalInfo;

    @FindBy(id="phone")
    WebElement homePhone;

    @FindBy(id="phone_mobile")
    WebElement phoneMobile;

    @FindBy(id="alias")
    WebElement aliasAddress;

    @FindBy(xpath="//span[normalize-space()='Register']")
    WebElement register;


    public void clickOnTitle(){
        clickOnElement(mrsRadioButton);
    }
    public void enterFirstName(String keys){
        sendTextToElement(firstName,keys);
    }
    public void enterLastName(String keys){
        sendTextToElement(lastName,keys);
    }
    public void enterCreateAccountEmail(String keys) {
       sendTextToElement(createAccountEmail,keys);
    }
    public void enterCreateAccountPassword(String keys) {
        sendTextToElement(createAccountPassword,keys);
    }
    public void selectDaysFromDropDown(String key){
        selectByValueFromDropDown(days, key);
    }
    public void selectMonthFromDropDown(String key)
    {
        selectByValueFromDropDown(month, key);
    }
    public void selectYearFromDropDown(String key){
        selectByValueFromDropDown(years, key);
    }
    public void clickOnNewsLetter(){
        clickOnElement(clickNewsLetter);
    }
    public void clickOnSpecialOffers(){
        clickOnElement(clickSpecialOffers);
    }
    public void enterAddressFirstName(String keys){
        sendTextToElement(addressFirstName,keys);
    }
    public void enterAddressLastName(String lName){
        sendTextToElement(addressLastName,lName);
    }
    public void  enterCompany(String keys){
        sendTextToElement(company,keys);
    }
    public void enterAddressLine1(String keys){
        sendTextToElement(addressLine1,keys);
    }
    public void enterAddressLine2(String keys){
        sendTextToElement(addressLine2,keys);
    }
    public void enterCity(String keys){
        sendTextToElement(city,keys);
    }
    public void selectState(String keys){
        selectByVisibleTextFromDropDown(state,keys);
    }
    public void enterZipCode(String keys){
        sendTextToElement(zipCode,keys);
    }
    public void selectCountry(String key) {
        selectByValueFromDropDown(country,key);
    }
    public void enterAdditionalInfo(String keys){
        sendTextToElement(additionalInfo,keys);
    }
    public void enterHomePhone(String keys){
        sendTextToElement(homePhone,keys);
    }
    public void enterMobilePhone(String keys){
        sendTextToElement(phoneMobile,keys);
    }
    public void enterAliasAddress(String keys){
        sendTextToElement(aliasAddress,keys);
    }
    public void clickOnRegister(){
        clickOnElement(register);
    }
}

