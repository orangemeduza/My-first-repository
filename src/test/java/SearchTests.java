import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {
    @Test
    @DisplayName("Forma")
    void successfulSearchTest() {
        TestData testData = new TestData();

        step("Открываем сайт", () -> open("https://demoqa.com/automation-practice-form"));

        step("Вводим имя", () -> {
            $("#firstName").setValue(testData.firstname);
        });

        step("Вводим фамилию", () -> {
            $("#lastName").setValue(testData.lastname);
        });
        step("Вводим email", () -> {
            $("#userEmail").setValue(testData.userEmail);
        });
        step("Вводим пол", () -> {
            //   $x("//input[@value='Female']/..").click();
            $("Label[for=\"gender-radio-2\"]").click();
            //  $("#gender-radio-2").parent().click();
        });
        step("Вводим номер телефона", () -> {
            $("#userNumber").setValue("4040505050");
        });
        step("Вводим дату", () -> {
            $("#dateOfBirthInput").click();
            $(".react-datepicker__year-select").selectOption("2021");
            $(".react-datepicker__month-select").selectOption("May");
            $(".react-datepicker__day--027:not(--outside-month)").click();
        });
        step("Вводим хобби", () -> {
            $("#hobbiesWrapper").$(byText("Music")).click();

        });

        step("Вводим адрес", () -> {
                    $("#currentAddress").setValue(testData.currentAddress);
                    sleep(10000);
                }
        );
    }

    @Test
    @DisplayName("Forma")
    void successfulSearchTest2() {
        TestData testData = new TestData();

        step("Открываем сайт", () -> open("https://demoqa.com/automation-practice-form"));

        step("Вводим имя", () -> {
            $("#firstName").setValue(testData.firstname);
        });

        step("Вводим фамилию", () -> {
            $("#lastName").setValue(testData.lastname);
        });
        step("Вводим email", () -> {
            $("#userEmail").setValue(testData.userEmail);
        });
        step("Вводим пол", () -> {
            //   $x("//input[@value='Female']/..").click();
            $("Label[for=\"gender-radio-2\"]").click();
            //  $("#gender-radio-2").parent().click();
        });
        step("Вводим номер телефона", () -> {
            $("#userNumber").setValue("4040505050");
        });
        step("Вводим дату", () -> {
            $("#dateOfBirthInput").click();
            $(".react-datepicker__year-select").selectOption("2021");
            $(".react-datepicker__month-select").selectOption("May");
            $(".react-datepicker__day--027:not(--outside-month)").click();
        });
        step("Вводим хобби", () -> {
            $("#hobbiesWrapper").$(byText("Music")).click();

        });

        step("Вводим адрес", () -> {
                    $("#currentAddress").setValue(testData.currentAddress);
                    sleep(10000);
                }
        );
    }


    @Test
    @Disabled
    @DisplayName("FailedTest")
    void BadTest1() {
        Assertions.assertEquals("1", "12");
    }


}
