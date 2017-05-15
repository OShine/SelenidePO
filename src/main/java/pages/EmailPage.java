package pages;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


/**
 * Created by DenisShklyannik on 15.05.2017.
 */

public class EmailPage {

    private static final By COMPOSE_BUTTON = By.cssSelector("[data-name=\"compose\"]>span");
    private static final By LOGOUT_BUTTON = By.cssSelector("#PH_logoutLink");

    public SelenideElement getComposeButton() {
        return $(COMPOSE_BUTTON);
    }

    public void clickLogoutButton(){
        $(LOGOUT_BUTTON).click();
    }

}
