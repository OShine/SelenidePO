package pages;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


/**
 * Created by DenisShklyannik on 15.05.2017.
 */
public class MainPage {

    private static final By MAILBOX_LOGIN = By.id("mailbox__login");
    private static final By MAILBOX_PASSWORD = By.id("mailbox__password");
    private static final By MAILBOX_AUTH_BUTTON = By.id("mailbox__auth__button");

    private void setLogin(String login) {
        $(MAILBOX_LOGIN).sendKeys(login);
    }

    private void setPassword(String password) {
        $(MAILBOX_PASSWORD).sendKeys(password);
    }


    public SelenideElement getAuthButton() {
        return $(MAILBOX_AUTH_BUTTON);//.getAttribute("value");
    }

    private void clickLoginButton() {
        $(MAILBOX_AUTH_BUTTON).click();
    }

    public void loginAs(String userName, String password) {
        setLogin(userName);
        setPassword(password);
        clickLoginButton();
    }

}
