package PageObjects;

import Utilities.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage  extends BaseClass{

    private static String finalPrice;

    private WebDriver driver;

    public AmazonHomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
    }

    private By searchBox = By.cssSelector("#twotabsearchtextbox");

    private By popUp = By.cssSelector("#nav-main > div.nav-left > div > div > div.glow-toaster-footer > span.a-button.a-spacing-top-base.a-button-base.glow-toaster-button.glow-toaster-button-dismiss > span > input");

    private By submitButton = By.cssSelector("#nav-search-submit-button");


    private By searchResult1 = By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/h2/a/span");

    private By price = By.xpath("//*[@id=\"newBuyBoxPrice\"]");

    private By priceOnStep = By.className("a-price-whole");

    private By fraction1 = By.className("a-price-fraction");

    private By checkoutPrice = By.xpath("//*[@id=\"subtotals-marketplace-table\"]/tbody/tr[1]/td[2]");

    public void homePageIsDisplayed() {
        Assert.assertTrue(driver.getTitle().contains("Amazon.com"));

    }

    public void clickSearchButton() {
       driver.findElement(popUp).click();
       driver.findElement(searchBox).click();
       driver.findElement(searchBox).sendKeys("qa testing for beginners");
       driver.findElement(submitButton).click();
    }

    public void clickOnFirstSearchResult() {
        String wholePrice =  driver.findElement(priceOnStep).getText();
        String decimalPrice = driver.findElement(fraction1).getText();
        finalPrice = wholePrice+"."+decimalPrice;
        WebDriverWait wait = new WebDriverWait(driver,10);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/h2/a/span")));
        driver.findElement(searchResult1).click();

    }

    public void verifyPrice(){
            String SecondPrice = driver.findElement(price).getText();
            String PriceLatest = SecondPrice.substring(1);
            Assert.assertEquals(finalPrice,PriceLatest);
    }

    public void verifyCheckoutPrice(){
            String SecondPrice = driver.findElement(checkoutPrice).getText();
            String PriceLatest = SecondPrice.substring(1);
            Assert.assertEquals(finalPrice,PriceLatest);
    }

}
