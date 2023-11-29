package org.example.configurations;

import static com.codeborne.selenide.Selenide.$x;
import static org.example.steps.selenide_steps.SelenideMethods.openBrowser;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

    public static void configureWebDriver() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.timeout = 10000;
    }

    @Given("Открываем сайт {string}")
    public void openPage(String url) {
        configureWebDriver();
        openBrowser(url, $x("//div[@class='product-card__top-wrap']"));
    }
}
