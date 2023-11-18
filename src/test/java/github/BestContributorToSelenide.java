package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {
    @Test
void andeiSolntsevShouldBeFirstContributor() {
    open("https://github.com/selenide/selenide");
    $("div.Layout-sidebar").$(Selectors.byText("Contributors"))
            //.closest("BorderGrid-cell").$$("ul li").first().hover();
            .closest("h2").sibling(0).$$("li").first().hover();
    //$$(".Popover").findBy(Condition.visible).shouldHave(text("Andrei Solntsev"));
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
    sleep(5000);
}

}
