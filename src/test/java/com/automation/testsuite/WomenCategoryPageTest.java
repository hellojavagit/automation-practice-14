package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
@Listeners(CustomListeners.class)
public class WomenCategoryPageTest extends TestBase{
    WomenCategoryPage womenCategoryPage;

    @BeforeMethod
    public void inIt() {
        womenCategoryPage = new WomenCategoryPage();

    }
    @Test (groups={"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(){
       womenCategoryPage.clickOnElementWomen();
       womenCategoryPage.verifyWomenText();
    }
    @Test (groups = {"smoke","regression"},dataProvider = "DATA SET", dataProviderClass = TestData.class)
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String
            size, String colour)
    {
          womenCategoryPage.clickOnElementWomen();
          womenCategoryPage.clickOnWomenProduct();
          womenCategoryPage.changeQuantity(qty);
          womenCategoryPage.changeSize(size);
          womenCategoryPage.changeColour(colour);
          womenCategoryPage.clickAddToCart();
          String expectedMessage = "Product successfully added to your shopping cart";
          String actualMessage = womenCategoryPage.veriftCartMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Messages does not Match");
        womenCategoryPage.closepopup();
    }
}
