package org.example.flows;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class AddingItemToBagFlow {

    public static final SelenideElement firstProductBrand = $x(
        "//span[@class='product-card__brand'][1]");
    public static final SelenideElement addToBagButton = $x(
        "//p[@class='product-card__order-wrap'][1]/a[@class='product-card__add-basket j-add-to-basket btn-main-sm'][1]");
    public static final SelenideElement bagButton = $x(
        "//span[@class='navbar-pc__icon navbar-pc__icon--basket']");
    public static final SelenideElement expectedProductNameInBag = $x(
        "//a[@class='good-info__title j-product-popup']/span");
}
