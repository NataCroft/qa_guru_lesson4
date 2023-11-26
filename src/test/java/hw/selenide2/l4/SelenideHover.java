package hw.selenide2.l4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.driver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelenideHover {
@Test
    void selenideHoverSolutions() {
        open("https://github.com/");
        $x("//button[contains(text(), 'Solutions')]").hover();
        $(".HeaderMenu-dropdown [href='/enterprise']").click();

        $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" +
                "developer platform."));
}

}
