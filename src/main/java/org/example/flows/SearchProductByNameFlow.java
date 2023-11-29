package org.example.flows;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class SearchProductByNameFlow {

    public static final SelenideElement searchInput = $x("//div[@class='header__bottom']//input");
    public static final SelenideElement searchResult = $x("//h1[@class='searching-results__title']");
}
