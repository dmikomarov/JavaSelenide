import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class Hover {
  @Test
  void HoverTest() {
    // На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover
    open("https://github.com/");
    //Перейдите в раздел Wiki проекта
    $(byText("Solutions")).hover();
    $(byText("Enterprise")).click();
    //Проверка наличия заголовка
    $(".application-main").shouldHave(text("Build like the best"));

  }
}
