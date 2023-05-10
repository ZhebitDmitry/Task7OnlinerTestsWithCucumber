package steps;

import Pages.BasketPage;
import Pages.MainPage;
import Pages.ProductPage;
import Pages.ProductsPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    String firstProduct;
    private final static String BASE_URL = "https://www.onliner.by/";
    MainPage mainPage = new MainPage(BASE_URL);
    ProductsPage productsPage = new ProductsPage();
    ProductPage productPage = new ProductPage();
    BasketPage basketPage = new BasketPage();

    @Given("Open site")
    public void openSite() {
        Selenide.open(BASE_URL);
    }

    @When("Mobile phones click")
    public void mobilePhonesClick() {
        mainPage.clickOnMobilePhones();
    }

    @And("Choose first product")
    public void chooseFirstProduct() {
        firstProduct = productsPage.showTextOfFirstProduct();
        productsPage.chooseFirstProduct();
    }

    @And("Click button 'in basket'")
    public void нажимемВКорзину() {
        productPage.clickOnBasket();
    }

    @And("Click 'into a basket'")
    public void переходимВКарзину() {
        productPage.clickOnBasket();
    }

    @Then("Check product in list and product in basket")
    public void первыйТоварВКарзинеРавенВыбранномуТовару() {
        firstProduct.equals(basketPage.showProduct());

    }
}
