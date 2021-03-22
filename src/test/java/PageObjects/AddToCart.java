package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
    private WebDriver driver;

    public AddToCart(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
    }

    private By addToCartButton = By.cssSelector("#add-to-cart-button");
    private By proceedToCheckOutButton = By.cssSelector("#hlb-ptc-btn-native");

    public void clinkOnAddToCardButton() {
        driver.findElement(addToCartButton).click();
    }

    public void clickOnProceedToCheckOutButton(){
        driver.findElement(proceedToCheckOutButton).click();
    }

}
