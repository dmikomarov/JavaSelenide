import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Selenide {
@Test
void successfulSearchTest() {
  // Откройте страницу Selenide в Github
  open("https://github.com/selenide/selenide");
  //Перейдите в раздел Wiki проекта
  $("[id=wiki-tab]").click();
  sleep(500);
  //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
  $("#wiki-pages-filter").setValue("Softassertions");
  $("#wiki-pages-box").shouldHave(text("SoftAssertions"));

  //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
  $("#wiki-pages-box").$(byText("SoftAssertions")).click();
  $(".repository-content").shouldHave(text("3. Using JUnit5 extend test class:"));


}}
