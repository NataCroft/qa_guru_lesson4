package hw__Selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiSoftAssertions {
    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.holdBrowserOpen = false;
    }
    @Test
    void SelenideSoftAssertionsSearch() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").scrollTo().click();
        $(byText("SoftAssertions")).click();
        $(".gh-header-title").shouldHave(text("SoftAssertions"));
        $("#user-content-3-using-junit5-extend-test-class+div").$("pre")

                .shouldHave(text("""
                        @ExtendWith({SoftAssertsExtension.class})
                        class Tests {
                         @Test
                        void test() {
                        Configuration.assertionMode = SOFT;
                        open("page.html");

                        $("#first").should(visible).click();
                        $("#second").should(visible).click();
                        }
                        }"""));
        sleep(5000);
    }
}
