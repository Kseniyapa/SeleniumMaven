package com.pflb.school.pages;

import com.pflb.school.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {

    public MenuPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "#header-lk-button")
    private WebElement loginButton; // Кнопка войти

    @FindBy(css = ".nl-header-link[ng-tr=\"NLHEA.NLHEA1\"]")
    private WebElement tabProductTitle; //Вкладка "О продукте"

    @FindBy(css = ".nl-header-link[ng-tr=\"NLHEA.NLHEA2\"]")
    private WebElement tabMenuItemPrice; //Вкладка "Цена"

    @FindBy(css = ".nl-header-link[ng-tr=\"NLHEA.NLHEA3\"]")
    private WebElement tabMenuItemFAQ; //Вкладка "FAQ"

    @FindBy(css = ".nl-header-link[ng-tr=\"NLHEA.NLHEA4\"]")
    private WebElement tabProductWantTest; //Вкладка "Хочу тестировать сайты"

    @Step(value = "Проверяем вкладку 'О продуте'")
    public boolean tabProductTitle() {
        return tabProductTitle.isEnabled();
    }

    @Step(value = "Проверяем вкладку 'Цены'")
    public boolean tabMenuItemPrice() {
        return tabMenuItemPrice.isEnabled();
    }

    @Step(value = "Проверяем вкладу 'FAQ'")
    public boolean tabMenuItemFAQ() {
        return tabMenuItemFAQ.isEnabled();
    }


    @Step(value = "Проверяем вкладку 'Хочу тестировать сайты'")
    public boolean tabWantTestButton() {
        return tabProductWantTest.isEnabled();
    }

    @Step(value = "Проверяем активность кнопки 'Войти'")
    public boolean loginButton() {
        return loginButton.isEnabled();
    }
}
