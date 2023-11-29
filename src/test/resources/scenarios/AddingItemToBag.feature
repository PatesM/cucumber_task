@cart
@purchase
Feature: Добавление товара в корзину

  Background: Пользователь находится на странице с результатами поиска 'iPhone 13'
    Given Открываем сайт "https://www.wildberries.ru/catalog/0/search.aspx?search=iPhone%2013"

  Scenario: Добавление товара 'iPhone 13' в корзину
    When Пользователь добавляет товар нажатием на кнопку 'В корзину'
    Then В корзине находится товар 'iPhone 13'