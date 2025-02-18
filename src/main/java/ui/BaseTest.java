package ui;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.*;

abstract class BaseTest {

    public static String user = "test";
    public static String email = "test@test.test";
    public static String password = "test123";
    public static String baseUrl = "http://localhost:8080";

    public BaseTest() {
        Configuration.baseUrl = baseUrl;
    //    Configuration.holdBrowserOpen = true;
        Configuration.browser = "chrome";
        login();
    }

    @BeforeAll
    public static void beforeAll() {
     //   System.setProperty("webdriver.chrome.driver", "chrome-driver/chromedriver");
   //     Configuration.browserBinary = "chrome-driver/chrome-win/chrome";
        open(baseUrl);
    }

    @AfterAll
    public static void afterAll() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        closeWindow();
    }

    @BeforeEach
    public void openBaseUrl() {
        open(baseUrl);
    }

    public abstract void login();

    public abstract void logout();
}
