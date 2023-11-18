package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindRepositoryAtTheTop(){
        open("https://github.com/");
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        /* $$("ul.repo-list li").first().$("a").click();*/
        $("[class = 'Link__StyledLink-sc-14289xe-0 bJBoUI']").click();
        $("[class = 'author flex-self-stretch']").shouldHave(text("selenide"));
        $("[class = 'mr-2 flex-self-stretch']").shouldHave(text("selenide"));

        sleep(5000);


    }
}
