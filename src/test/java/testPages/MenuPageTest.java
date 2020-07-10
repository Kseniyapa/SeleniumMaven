package testPages;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pflb.school.DriverManager;
import com.pflb.school.pages.*;

import static io.qameta.allure.Allure.step;

public class MenuPageTest {

    private final MenuPage menuPage = new MenuPage();
    private final AuthorizationPage authorizationPage = new AuthorizationPage();
    private static final String BASEURL = "http://test.uxcrowd.ru";

    @Test(priority = 1)
    @Description(value = "Проверяем вкладку 'О продукте', " +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsProduct() {
        step("Проверяем вкладку 'О продуте'");
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.tabProductTitle());
    }

    @Test(priority = 2)
    @Description(value = "Проверяем вкладку 'Цены'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsPrice() {
        step("Проверяем вкладку 'Цены'");
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.tabMenuItemPrice());
    }

    @Test(priority = 3)
    @Description(value = "Проверяем вкладку 'FAQ'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsFAQ() {
        step("Проверяем вкладку 'FAQ'");
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.tabMenuItemFAQ());
    }

    @Test(priority = 4)
    @Description(value = "Проверяем вкладку 'Хочу тестировать сайты'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsWantTest() {
        step("Проверяем вкладку 'Хочу тестировать сайты'");
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.tabWantTestButton());
    }

    @Test(priority = 5)
    @Description(value = "Проверяем кнопку 'Войти'" +
            "должна быть активна и при нажатии открывать окно авторизации")
    public void checkLoginButton() {
        step("Проверяем кнопку 'Войти'");
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.loginButton());
        DriverManager.getDriver().quit();
    }

}


