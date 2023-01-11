package ui.user;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.BaseTest;
import ui.pages.ContactInformation;
import ui.pages.UserLoginPage;
import ui.pages.UserPage;

public class UserTest extends BaseTest {
    @Test
    public void loginUserTest() {
        UserPage userPage = new UserPage(driver);
        UserLoginPage userLoginPage = new UserLoginPage(driver);

        userPage.inputOpen();
        userLoginPage.openFormEmail("bpodkopay2@gmail.com");
        userLoginPage.openFormPassword("Linadi2001Im");
        userLoginPage.inputButton();

        ContactInformation contactInformation = PageFactory.initElements(driver, ContactInformation.class);
        contactInformation.infoUser();


    }
}
