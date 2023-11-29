package org.example.steps.asserts;

import static org.example.flows.AddingItemToBagFlow.expectedProductNameInBag;
import static org.example.flows.SearchProductByNameFlow.searchResult;
import static org.example.flows.ViewProductsListFlow.categoryPageTitle;
import static org.example.steps.selenide_steps.SelenideMethods.getSelenideElementText;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Then;

public class Assertions {

    @Then("Открывается страница результатов категории с заголовком {string}")
    public static void assertionElectronicsSearchResultTitleCorrect(
        String expectedElectronicsPageTitle) {
        assertEquals(expectedElectronicsPageTitle, getSelenideElementText(categoryPageTitle));
    }

    @Then("Открывается страница результатов поиска с заголовком {string}")
    public static void assertionSearchResultTitleCorrect(
        String expectedElectronicsPageTitle) {
        assertEquals(expectedElectronicsPageTitle, getSelenideElementText(searchResult));
    }

    @Then("В корзине находится товар {string}")
    public static void assertionProductToBagCorrect(String expectedProductName) {
        assertTrue(getSelenideElementText(expectedProductNameInBag).contains(expectedProductName));
    }
}
