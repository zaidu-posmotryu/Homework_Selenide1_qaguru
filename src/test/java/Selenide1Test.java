import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Selenide1Test {

    public static class SelenideRepositorySearch {

        @Test
        void searchSelenideWiki(){
            open("https://github.com/");
            $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
            $$(".menu-item").findBy(text("Wikis")).click();

            //$("#repository-container-header").shouldHave(text("selenide / selenide"));

        }
    }
}
