package PageObjects;

import Utilities.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    ConfigFileReader configFileReader = new ConfigFileReader();

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
    }
    private By username = By.xpath("//*[@id=\"ap_email\"]");
    private By continueButton = By.xpath("//*[@id=\"continue\"]");
    private By password = By.xpath("//*[@id=\"ap_password\"]");
    private By submit = By.xpath("//*[@id=\"signInSubmit\"]");
    private By address = By.xpath("//*[@id=\"address-book-entry-0\"]/div[2]/span/a");
    private By delivery = By.xpath("//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input");
    private By payment = By.xpath("");

    public void enter_username(){
     String ID = configFileReader.getUrl("username");
        driver.findElement(username).sendKeys(ID);
    }

    public void click_continue(){
        driver.findElement(continueButton).click();
    }

    public void enter_password(){
        String pwd = configFileReader.getUrl("password");
        driver.findElement(password).sendKeys(pwd);
    }

    public void click_on_submit_button(){
        driver.findElement(submit).click();
    }

    public void select_address(){
        driver.findElement(address).click();
    }

    public void select_delivery_date(){
        driver.findElement(delivery).click();
    }

}
