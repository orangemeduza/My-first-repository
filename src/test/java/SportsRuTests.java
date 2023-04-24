import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SportsRuTests extends TestBase {
    final String coach_name = "Лэмпард";

    @Test
    @ParameterizedTest
    @ValueSource
    void isCoachOfTeam() {

        open("https://sports.ru/");
        $(".search-block-trigger").click();
        $(".search-block__input").setValue("Челси");
        $(".search-block__results-item-link").click();
        $(".profile-table").shouldHave(text(coach_name));
        // sleep(555555555);
    }

}
