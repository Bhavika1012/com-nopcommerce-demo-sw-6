package com.nopcommerce.steps;

import com.nopcommerce.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TestSuiteSteps {
    @When("^User Click on Computer Menu$")
    public void userClickOnComputerMenu() {
        new HomePage().clickOnComputerTab();
    }

    @And("^User Click on Desktop$")
    public void userClickOnDesktop() {
        new ComputersPage().clickOnDesktop();
    }

    @And("^User Select Sort By position Name: Z to A$")
    public void userSelectSortByPositionNameZToA() {

    }

    @Then("^User see  the Product will arrange in Descending order$")
    public void userSeeTheProductWillArrangeInDescendingOrder() throws InterruptedException {
        String actualOrder = new ComputersPage().sortDesktopByPositionZtoA().toString();
        String ExceptedOrder = new ComputersPage().getAllProductNamesAfterSorting().toString();
        Assert.assertTrue(ExceptedOrder.contains(actualOrder));
    }

    @And("^User Select Sort By position \"([^\"]*)\"$")
    public void userSelectSortByPosition(String position) throws InterruptedException {
        new ComputersPage().selectValueFromSortingDropDown("Name: A to Z");
    }

    @And("^User Click on Add To Cart for \"([^\"]*)\"$")
    public void userClickOnAddToCartFor(String product) throws InterruptedException {
        new ComputersPage().clickAddToCartByProductName(product);
    }

    @Then("^Verify the Text Build your own computer$")
    public void verifyTheTextBuildYourOwnComputer() throws InterruptedException {
        String expectedMessage = "Build your own computer";
        String actualMessage = new BuildYourOwnComputerPage().getBuildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on add to card");
    }

    @And("^User Select Processor \"([^\"]*)\" using Select class$")
    public void userSelectProcessorUsingSelectClass(String processor) throws InterruptedException {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^User Select Ram \"([^\"]*)\" using Select class$")
    public void userSelectRamUsingSelectClass(String ram) throws InterruptedException {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^User select HDD radio \"([^\"]*)\"$")
    public void userSelectHDDRadio(String hdd) throws InterruptedException {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^User select OS \"([^\"]*)\"$")
    public void userSelectOS(String os) throws InterruptedException {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("^User select Microsoft Office$")
    public void userSelectMicrosoftOffice() throws InterruptedException {
        new BuildYourOwnComputerPage().selectMicrosoftOfficeSoftwareOption();
    }

    @And("^User select Total Commander$")
    public void userSelectTotalCommander() throws InterruptedException {
        new BuildYourOwnComputerPage().selectTotalCommanderSoftwareOption();
    }

    @Then("^Verify the price \"([^\"]*)\" of desktop$")
    public void verifyThePriceOfDesktop(String expectedMessage) throws InterruptedException {
        String actualMessage = new BuildYourOwnComputerPage().getTotalPriceText();
        Assert.assertEquals(expectedMessage, actualMessage, "Wrong Configuration");
    }

    @And("^User  click on add to cart button$")
    public void userClickOnAddToCartButton() throws InterruptedException {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("^Verify the Message \"([^\"]*)\" on top bar$")
    public void verifyTheMessageOnTopBar(String expectedMessage) throws InterruptedException {
        String actualMessage = new BuildYourOwnComputerPage().getSuccessfullyAddedToCartText();
        Assert.assertEquals(expectedMessage, actualMessage, "Not added in cart");
    }

    @And("^User MouseHover on Shopping cart and Click on GO TO CART button$")
    public void userMouseHoverOnShoppingCartAndClickOnGOTOCARTButton() throws InterruptedException {
        new BuildYourOwnComputerPage().mouseHoverToShoppingCartAndClickOnCart();
    }

    @Then("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String expectedMessage) throws InterruptedException {

        String actualMessage = new ShoppingCartPage().getShoppingCartText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on cart");
    }


    @And("^User Change the Qty to \"([^\"]*)\" and Click on Update shopping cart$")
    public void userChangeTheQtyToAndClickOnUpdateShoppingCart(String qty) throws InterruptedException {
        new ShoppingCartPage().changeValueOfQuantity("2");
    }

    @And("^User click on update shopping cart$")
    public void userClickOnUpdateShoppingCart() throws InterruptedException {
        new ShoppingCartPage().updateShoppingCart();
    }

    @Then("^Verify total price is \"([^\"]*)\"$")
    public void verifyTotalPriceIs(String expectedMessage) throws InterruptedException {
        String actualMessage = new ShoppingCartPage().getPriceText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on cart");
    }

    @And("^User Click on CHECKOUT AS GUEST Tab$")
    public void userClickOnCHECKOUTASGUESTTab() {
        new LoginPage().clickOnGuestCheckout();
    }

    @And("^User enter first name \"([^\"]*)\"$")
    public void userEnterFirstName(String firstName) throws InterruptedException {
        new CheckOutPage().enterFirstname(firstName);
    }

    @And("^User enter last name  \"([^\"]*)\"$")
    public void userEnterLastName(String LastName) throws InterruptedException {
        new CheckOutPage().enterLastname(LastName);
    }

    @And("^User enter email \"([^\"]*)\"$")
    public void userEnterEmail(String email) throws InterruptedException {
        new CheckOutPage().enterEmail(email);
    }

    @And("^User select country \"([^\"]*)\"$")
    public void userSelectCountry(String country) throws InterruptedException {
        new CheckOutPage().selectCountry(country);
    }

    @And("^User enter city \"([^\"]*)\"$")
    public void userEnterCity(String city) throws InterruptedException {
        new CheckOutPage().enterCity(city);
    }

    @And("^User enter Address one \"([^\"]*)\"$")
    public void userEnterAddressOne(String arg0) {
        throw new PendingException();
    }

    @And("^User enter ZipCode \"([^\"]*)\"$")
    public void userEnterZipCode(String zp) throws InterruptedException {
        new CheckOutPage().enterZipCode(zp);
    }

    @And("^User enter phone number \"([^\"]*)\"$")
    public void userEnterPhoneNumber(String phone) throws InterruptedException {
        new CheckOutPage().enterPhoneNumber(phone);
    }


    @And("^User Click on CONTINUE$")
    public void userClickOnCONTINUE() throws InterruptedException {
        new CheckOutPage().clickOnContinue();
    }

    @And("^User Click on Radio Button Next Day Air$")
    public void userClickOnRadioButtonNextDayAir() throws InterruptedException {
        new CheckOutPage().selectNextDayAir();
    }

    @And("^Click on Continue$")
    public void clickOnContinue() throws InterruptedException {
        new CheckOutPage().clickOnShippingContinue();
    }

    @And("^User click on Credit Card$")
    public void userClickOnCreditCard() throws InterruptedException {
        new CheckOutPage().clickOnCreditCard();
    }

    @And("^User click on payment continue$")
    public void userClickOnPaymentContinue() throws InterruptedException {
        new CheckOutPage().clickOnPaymentContinue();
    }

    @And("^User select Credit Card Type \"([^\"]*)\"$")
    public void userSelectCreditCardType(String cardType) throws InterruptedException {
        new CheckOutPage().selectCreditCardType(cardType);
    }

    @And("^User enter enter Card Holder Name \"([^\"]*)\"$")
    public void userEnterEnterCardHolderName(String cardHolderName) throws InterruptedException {
        new CheckOutPage().enterCardHolderName(cardHolderName);
    }

    @And("^User enter enter Card Number \"([^\"]*)\"$")
    public void userEnterEnterCardNumber(String cardNumber) throws InterruptedException {
        new CheckOutPage().enterCardNumber(cardNumber);
    }

    @And("^User select Expire Date \"([^\"]*)\" \"([^\"]*)\"$")
    public void userSelectExpireDate(String month, String year) throws InterruptedException {
        new CheckOutPage().selectExpirationDate(month, year);
    }


    @And("^User enter card code \"([^\"]*)\"$")
    public void userEnterCardCode(String cardCode) throws InterruptedException {
        new CheckOutPage().enterCardCode(cardCode);
    }

    @And("^User click On Payment Info Continue$")
    public void userClickOnPaymentInfoContinue() throws InterruptedException {
        new CheckOutPage().clickOnPaymentInfoContinue();
    }

    @Then("^Verify Payment Method is \"([^\"]*)\"$")
    public void verifyPaymentMethodIs(String expectedMessage) throws InterruptedException {
        String actualMessage = new CheckOutPage().getPaymentTypeText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("^Verify Shipping Method is \"([^\"]*)\"$")
    public void verifyShippingMethodIs(String expectedMessage) throws InterruptedException {
        String actualMessage = new CheckOutPage().getShippingMethodText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("^Verify Total is \"([^\"]*)\"$")
    public void verifyTotalIs(String expectedMessage) throws InterruptedException {
        String actualMessage = new CheckOutPage().getTotalPriceText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("^User Click on CONFIRM$")
    public void userClickOnCONFIRM() throws InterruptedException {
        new CheckOutPage().clickOnConfirm();
    }

    @Then("^Verify the Text \"([^\"]*)\" on home page$")
    public void verifyTheTextOnHomePage(String expectedMessage) throws InterruptedException {
        String actualMessage = new HomePage().getThankYouText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("^Verify the message \"([^\"]*)\" on homepage$")
    public void verifyTheMessageOnHomepage(String expectedMessage) throws InterruptedException {
        String actualMessage = new HomePage().getSuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("^User click on continue Button$")
    public void userClickOnContinueButton() throws InterruptedException {
        new HomePage().clickOnContinue();
    }

    @Then("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expectedMessage) throws InterruptedException {
        String actualMessage = new HomePage().getWelcomeStoreText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
