import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.EmailPage;
import pages.MainPage;

/**
 * Created by DenisShklyannik on 10.05.2017.
 */
public class Selenide {

    private MainPage mainPage;
    private EmailPage emailPage;

    private static final String BASE_URL = "https://mail.ru";
    private static final String USERNAME = "seleniumtests10@mail.ru";
    private static final String PASSWORD = "060788avavav";
    private static final String COMPOSE_BUTTON_TEXT = "Написать письмо";
    private static final String AUTH_BUTTON_TEXT = "Войти";

    @BeforeTest
    public void beforeTest() {
        Configuration.browser = "chrome";
        open(BASE_URL);
    }

    @Test
    public void loginTest() {
        mainPage = new MainPage();
        emailPage = new EmailPage();

        mainPage.loginAs(USERNAME, PASSWORD);
        emailPage.getComposeButton().shouldHave(text(COMPOSE_BUTTON_TEXT));
    }

    @Test
    public void logoutTest() {

        mainPage = new MainPage();
        emailPage = new EmailPage();

        emailPage.clickLogoutButton();
        mainPage.getAuthButton().shouldHave(attribute("value", AUTH_BUTTON_TEXT));
    }


    @AfterTest
    public void tearDown() {
        close();
    }
}

