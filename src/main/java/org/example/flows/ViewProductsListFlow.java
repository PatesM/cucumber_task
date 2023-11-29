package org.example.flows;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class ViewProductsListFlow {

    public static final SelenideElement categoriesButton = $x("//button[@class='nav-element__burger j-menu-burger-btn j-wba-header-item']");
    public static final SelenideElement electronics = $x("//ul[@class='menu-burger__main-list']//a[text()='Электроника']");
    public static final SelenideElement categoryPageTitle = $x("//div[@class='catalog-title-wrap']/h1");
}
