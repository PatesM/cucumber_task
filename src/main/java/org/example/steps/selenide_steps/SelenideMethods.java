package org.example.steps.selenide_steps;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

public class SelenideMethods {

    public static void openBrowser(String url, SelenideElement selenideElement) {
        open(url);
        selenideElement.shouldBe(visible);
    }

    public static void clickSelenideElement(SelenideElement selenideElement) {
        selenideElement.shouldBe(visible, interactable).click();
    }

    public static void sendKeysToInput(SelenideElement selenideElement, String itemName) {
        selenideElement.shouldBe(visible, interactable).sendKeys(itemName + Keys.ENTER);
    }

    public static String getSelenideElementText(SelenideElement selenideElement) {
        return selenideElement.shouldBe(visible).text();
    }

    public static void moveToElement(SelenideElement selenideElement) {
        Selenide.sleep(1500);
        selenideElement.shouldBe(visible, enabled).hover();
    }
}
