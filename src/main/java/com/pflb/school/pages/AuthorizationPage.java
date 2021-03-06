package com.pflb.school.pages;

import com.pflb.school.DriverManager;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage  {

    public AuthorizationPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }


    @FindBy(id = "header-lk-button")
    private WebElement loginButton; // Кнопка "Войти"

    @FindBy(css = "#login")
    private WebElement emailFild; // Поле ввода почты

    @FindBy(css = "[type=password]")
    private WebElement passwordField; // Поле ввода пароля

    @FindBy(css = "#form_auth button")
    private WebElement logInPersonalAccount; // Кнопка "Вход" в личный кабинет

    @FindBy(className = "new_test")
    private WebElement buttonCreateTest; // Вкладка "Новый тест", как подтверждение успешного входа в личный кабинет

    @FindBy(id = "logout")
    private WebElement logOutButton; // Кнопка выйти


    @Step("Проверка вкладки 'Новый тест'")
    public boolean getCreateTestButtonState() {
        return buttonCreateTest.isDisplayed();
    }

    @Step("Нажимаем кнопку 'Войти' в личный кабинет")
    public void logInPersonalAccount() {
        logInPersonalAccount.click();
    }


    @Step("Вводим пароль {0}")
    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    @Step("Вводим емайл {0}")
    public void fillEmailField(String email) {
        emailFild.sendKeys(email);
    }


    @Step("Открываем окно авторизации")
    public void clickLoginButton() {
        loginButton.click();
    }

    @Step("Нажимаем кнопку 'Выйти' из личного кабинета")
    public void setLogOutButton() {
        logOutButton.click();
    }

    @Step("Открываем соединение")
    public void open(String url) {
        DriverManager.getDriver().get(url);
    }
}
