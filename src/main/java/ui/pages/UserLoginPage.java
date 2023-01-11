package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage {
    private WebDriver driver;
    @FindBy(xpath = "//input[@name = 'email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name = 'password']")
    private WebElement password;

    @FindBy(xpath = "//input[@class = 'button']")
    private WebElement button;

    public UserLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openFormEmail(String emailName) {
        email.click();
        email.sendKeys(emailName);
    }

    public void openFormPassword(String passwordName) {
        password.click();
        password.sendKeys(passwordName);
    }

    public void inputButton() {
        button.click();
    }
}
