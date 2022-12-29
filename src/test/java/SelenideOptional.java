import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideOptional {
  @Test
  void DragAndDrope() {
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDropTo("#column-b");
    $("#column-b header").shouldHave(text("A"));
    $("#column-a header").shouldHave(text("B"));
  }
}
