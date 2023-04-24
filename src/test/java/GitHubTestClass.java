import com.codeborne.selenide.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class GitHubTestClass extends TestBase {


    @Test
    @DisplayName("Forma")
    void openGitHubTest() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        open("https://github.com/");
       // sleep(50000000);

    }
}