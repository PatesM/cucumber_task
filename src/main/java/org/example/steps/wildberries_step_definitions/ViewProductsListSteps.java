package org.example.steps.wildberries_step_definitions;

import static org.example.flows.ViewProductsListFlow.categoriesButton;
import static org.example.flows.ViewProductsListFlow.electronics;
import static org.example.steps.selenide_steps.SelenideMethods.clickSelenideElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ViewProductsListSteps {

    @When("Пользователь нажимает на кнопку 'Категории'")
    public void openCategories() {
        clickSelenideElement(categoriesButton);
    }

    @And("Нажимает на кнопку 'Электроника'")
    public void clickElectronics() {
        clickSelenideElement(electronics);
    }
}
