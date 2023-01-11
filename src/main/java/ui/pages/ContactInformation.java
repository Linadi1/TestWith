package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformation {
    @FindBy(xpath = "//a[@href='https://sota.kh.ua/index.php?route=account/simpleedit&language=ua'])")
    private WebElement info;

    public void infoUser() {
        info.click();
    }
}
