package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends Utility {
    //4.WomenCategoryPage
    //WOMEN text, TOPS and DRESSES links, SortBy drop down, ProductsList Locators
    //and create appropriate methods for it
    public WomenCategoryPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[normalize-space()='Women']")
    WebElement womenText;
    @FindBy (linkText = "Women")
    WebElement elementWomen;
    @FindBy(linkText ="Tops")
    WebElement tops;
    @FindBy(linkText = "Dresses")
    WebElement dressess;
    @FindBy (xpath="//img[@title='Faded Short Sleeve T-shirts']")
    WebElement womenProduct;

    @FindBy (id="quantity_wanted")
    WebElement quantity;

    @FindBy(id="group_1")
    WebElement size;

    @FindBy (xpath="//a[@title='Blue']")
    WebElement colour;
    @FindBy(xpath=" //span[normalize-space()='Add to cart']")
    WebElement addToCart;
    @FindBy(xpath="//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement cartMessage;

    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeButton;

    public String verifyWomenText()
    {
      return   getTextFromElement(womenText);
    }
    public void clickOnElementWomen(){
        clickOnElement(elementWomen);
    }
    public void clickOnWomenProduct(){
        clickOnElement(womenProduct);
    }
    public void changeQuantity(String keys){
        sendTextToElement(quantity,keys);
    }
    public void changeSize(String keys){
        sendTextToElement(size,keys);
    }
    public void changeColour(String keys){
        sendTextToElement(colour,keys);
    }
    public void clickAddToCart(){
        clickOnElement(addToCart);
    }
    public String veriftCartMessage(){
        return getTextFromElement(cartMessage);
    }
    public void closepopup(){
        clickOnElement(closeButton);
    }
    public void sendValuesToElements(String womenProduct, String quantity, String
                                               size, String colour){
        clickOnWomenProduct();
       changeQuantity(quantity);
       changeSize(size);
       changeColour(colour);

    }

    public void mouseHoverAndClickOnTops(){
        mouseHoverToElementAndClick(tops);
    }
    public void mouseHoverAndClickOnDressess(){
        mouseHoverToElementAndClick(dressess);
    }


}
