import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class tests {

    @Test
    public void testGoogle() {
        open("https://www.google.com/");
        $x("//textarea[@name='q']").setValue("Белявский Дмитрий Анатольевич").pressEnter();
        $x("//div[@id='result-stats']").shouldBe(Condition.visible);
    }
}
