package org.example.steps.wildberries_step_definitions;

import static org.example.flows.AddingItemToBagFlow.addToBagButton;
import static org.example.flows.AddingItemToBagFlow.bagButton;
import static org.example.flows.AddingItemToBagFlow.firstProductBrand;
import static org.example.steps.selenide_steps.SelenideMethods.clickSelenideElement;
import static org.example.steps.selenide_steps.SelenideMethods.moveToElement;

import io.cucumber.java.en.When;

public class AddingItemToBagSteps {

    @When("Пользователь добавляет товар нажатием на кнопку 'В корзину'")
    public void addProductToBag() {
        moveToElement(firstProductBrand);
        clickSelenideElement(addToBagButton);
        clickSelenideElement(bagButton);
    }
}
