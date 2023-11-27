package hw.selenide2.l4;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class SelenideHover {
@Test
    void selenideHoverSolutionsTest() {
        open("https://github.com/");
        $x("//button[contains(text(), 'Solutions')]").hover();
        $(".HeaderMenu-dropdown [href='/enterprise']").click();

        $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" +
                "developer platform."));
}

}
