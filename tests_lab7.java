import com.codeborne.selenide.Condition;
import org.junit.Test;

import java.security.PublicKey;

import static com.codeborne.selenide.Selenide.*;

public class tests {

    @Test
    public void katalogOpen (){
        open("https://belpostel.com/");
        $x("//a[@href='/catalog/']").click();
        $x("//div[@class='category-view']").shouldBe(Condition.visible);
    }

    @Test
    public void deliveryOpen (){
        open("https://belpostel.com/");
        $x("//a[@href='/delivery/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }


    @Test
    public void skidkiOpen (){
        open("https://belpostel.com/");
        $x("//a[@href='/skidki/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void partnersOpen (){
        open("https://belpostel.com/");
        $x("//a[@href='/partners/']").click();
        $x("//div[@class='art-layout-cell art-content clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void blogOpen (){
        open("https://belpostel.com/");
        $x("//a[@href='/blog/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void contactsOpen (){
        open("https://belpostel.com/");
        $x("//a[@href='/Contacts/']").click();
        $x("//div[@class='art-article']").shouldBe(Condition.visible);
    }

    @Test
    public void addToCart (){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/postelnoe_bele/']").click();
        $x("//a[@class='category__item-image' and @href='/postelnoe-bele-belpostel/']").click();
        $x("//a[@href='/postelnoe-bele-belpostel/komplekt_postelnogo_belya_essel_belpostel/']").click();
        $x("//input[@name='actionADD2BASKET' and @class='addtocart-button']").click();
        sleep(3000);
        $x("//div[@class='lof_top_1']").shouldBe(Condition.visible);
    }

    @Test
    public void removeFromCart(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/postelnoe_bele/']").click();
        $x("//a[@class='category__item-image' and @href='/postelnoe-bele-belpostel/']").click();
        $x("//a[@href='/postelnoe-bele-belpostel/komplekt_postelnogo_belya_essel_belpostel/']").click();
        $x("//input[@name='actionADD2BASKET' and @class='addtocart-button']").click();
        sleep(1000);
        $x("//div[@class='art-block basket-small clearfix']//a[@href='/personal/basket/']").click();
        $x("//td[@class='basket-items-list-item-price']").hover();
        $x("//span[@class='basket-item-actions-remove']").click();
        sleep(1500);
        $x("//a[@data-entity='basket-item-restore-button']").shouldBe(Condition.visible);
    }

    @Test
    public void searchItem(){
        open("https://belpostel.com/");
        $x("//input[@id='title-search-input']").setValue("Эссель");
        $x("//input[@class='custom_search']").click();
        sleep(1500);
    }

    @Test
    public void openOdeyala(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/odeyala_i_podushki/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openTekstil(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/tekstil_dlya_detey/']").click();
        $x("//div[@class='art-layout-cell art-content clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openMakhrovoe(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/makhrovye_polotentsa/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openPled(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/pledy_i_pokryvala/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openDom(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/domashnyaya_odezhda/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openStol(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/stolovoe_bele/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openRegistration (){
        open("https://belpostel.com/");
        $x("//div[@id='login']//div[@class='bx-system-auth-form']//a[@href='/personal/registration/']").click();
        sleep(1000);
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openMatras(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/matrasy/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openFoto(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/fotoshtory/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openProstyni(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/prostyni_i_otdelnye_predmety/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }

    @Test
    public void openDecPod(){
        open("https://belpostel.com/");
        $x("//div[@class='art-blockcontent art-blockcontent_link']//a[@href='/dekorativnye_podushki/']").click();
        $x("//div[@class='art-postcontent clearfix']").shouldBe(Condition.visible);
    }
}
