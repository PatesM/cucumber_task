package org.example.steps.wildberries_step_definitions;

import static org.example.flows.SearchProductByNameFlow.searchInput;
import static org.example.steps.selenide_steps.SelenideMethods.sendKeysToInput;

import io.cucumber.java.en.When;

public class SearchProductByNameSteps {

    @When("Пользователь вводит в поисковую строку {string}")
    public void openCategories(String productName) {
        sendKeysToInput(searchInput, productName);
    }
}
