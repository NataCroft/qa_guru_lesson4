package hw.selenide2.l4;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;

public class SelenideDragAndDrop {
        @BeforeAll
        static void beforeAll() {
            Configuration.browserSize = "1920x1080";
            Configuration.baseUrl = " https://the-internet.herokuapp.com";
            Configuration.pageLoadStrategy = "eager";
        }

        @Test
        void successfulDragAndDrop() {

            open("/drag_and_drop");
            $("#column-a").shouldHave(text("A"));
            $("#column-b").shouldHave(text("B"));
            $("#column-a").dragAndDrop(to("#column-b"));
            $("#column-a").shouldHave(text("B"));
            $("#column-b").shouldHave(text("A"));

            sleep(4000);
        }
    }
