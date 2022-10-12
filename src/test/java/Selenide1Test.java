import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Selenide1Test {

    public static class SelenideRepositorySearch {

        @BeforeAll
        static void setUp() {
            open("https://github.com/");
            Configuration.browserSize = "1920x1080";
            Configuration.holdBrowserOpen = true;
        }

        @Test
        void searchSelenideWiki() {
            $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
            $$(".menu-item").findBy(text("Wikis")).click();
            $("#wiki_search_results").$(byText("SoftAssertions")).click();
            $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
            System.out.println("Есть пример для JUnit5");
        }
    }
}
