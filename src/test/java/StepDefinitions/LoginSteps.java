package StepDefinitions;

import PageObjects.AddToCart;
import PageObjects.AmazonHomePage;
import PageObjects.LoginPage;
import Utilities.ConfigFileReader;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;
    AmazonHomePage amazonHomePage = new AmazonHomePage(driver, wait);
    AddToCart addToCart = new AddToCart(driver,wait);
    LoginPage loginPage = new LoginPage(driver, wait);


    public LoginSteps() throws Exception {

        ConfigFileReader configFileReader = new ConfigFileReader();
        this.wait = new WebDriverWait(driver, configFileReader.getTimeout());
    }

    @Given("^Launch amazon website$")
    public void loginToAmazonWebsite() throws InterruptedException {
      amazonHomePage.homePageIsDisplayed();
    }

    @When("^I search for product and select the first item$")
    public void searchForProduct() throws InterruptedException {
        amazonHomePage.clickSearchButton();
        amazonHomePage.clickOnFirstSearchResult();
    }

    @Then("^I add the product to cart and verify the price$")
    public void addToCart() throws InterruptedException {
        amazonHomePage.verifyPrice();
        addToCart.clinkOnAddToCardButton();
    }

    @When("^I click on proceed to checkout and login$")
    public void proceedToCheckout() throws InterruptedException {
        addToCart.clickOnProceedToCheckOutButton();
        loginPage.enter_username();
        loginPage.click_continue();
        loginPage.enter_password();
        loginPage.click_on_submit_button();
    }

    @Then("^I verify the price of the product on checkout page$")
    public void verifyProductPrice() throws InterruptedException {
        amazonHomePage.verifyCheckoutPrice();
    }
}