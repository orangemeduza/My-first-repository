import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class TestBase {


    @BeforeAll
    static void beforeAll() {
        //  WebDriverProvider provider = new WebDriverProvider();
        Configuration.browser = "chrome";
        //    Configuration.browserVersion = "100.0";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        //  Configuration.remote = "http://localhost:4444/wd/hub/"; //запускает тесты в селеноиде по заданному адресу (менять только хост и порт)

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;

    }

    @BeforeEach
    void clearCookies() {
        Selenide.clearBrowserCookies();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
       // Attach.addVideo();
        Selenide.closeWebDriver();
    }


}