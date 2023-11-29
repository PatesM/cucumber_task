@search
Feature: Поиск товара по названию

  Background: Пользователь находится на главной странице сайта Wildberries
    Given Открываем сайт "https://www.wildberries.ru/"

  Scenario: Поиск товара "iPhone 13"
    When Пользователь вводит в поисковую строку "iPhone 13"
    Then Открывается страница результатов поиска с заголовком "iPhone 13"