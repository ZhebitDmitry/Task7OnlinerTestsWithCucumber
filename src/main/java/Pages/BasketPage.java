package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {
    private final SelenideElement product =
            $x("//a[@class='cart-form__link cart-form__link_primary cart-form__link_base-alter' and @href]");
    public String showProduct(){
        return product.shouldBe(Condition.visible).getText();
    }
}
