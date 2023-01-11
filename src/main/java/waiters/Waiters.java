package waiters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {
    private WebDriver driver;
    public void waitersForPages() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        // wait.until(ExpectedConditions.visibilityOfElementLocated());
    }
}



