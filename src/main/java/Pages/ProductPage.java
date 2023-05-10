package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {
    private final SelenideElement basket = $x("//a[contains(text(), 'В корзину') and @data-shop-id=\"936\"]");
    private final SelenideElement goToBasket = $x("//a[contains(text(), 'Перейти в корзину')]");
    public void clickOnBasket() {
        basket.click();
    }
    public void goIntoBasket() {
        goToBasket.click();
    }

}
