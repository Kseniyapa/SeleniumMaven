package testPages;

import Listener.ScreenshotListener;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pflb.school.DriverManager;
import com.pflb.school.pages.*;

import static io.qameta.allure.Allure.step;

@Listeners({ScreenshotListener.class})
public class MenuPageTest {

    private final MenuPage menuPage = new MenuPage();
    private final AuthorizationPage authorizationPage = new AuthorizationPage();
    private static final String BASEURL = "http://test.uxcrowd.ru";

    @Test(priority = 1, groups = {"positive test menu"})
    @Description("Проверяем вкладку 'О продукте', " +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsProduct() {
        step("Проверяем вкладку 'О продуте'");
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.tabProductTitle());
    }

    @Test(priority = 2, groups = {"positive test menu"})
    @Description("Проверяем вкладку 'Цены'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsPrice() {
        step("Проверяем вкладку 'Цены'");
        Assert.assertTrue(menuPage.tabMenuItemPrice());
    }

    @Test(priority = 3, groups = {"positive test menu"})
    @Description("Проверяем вкладку 'FAQ'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsFAQ() {
        step("Проверяем вкладку 'FAQ'");
        Assert.assertTrue(menuPage.tabMenuItemFAQ());
    }

    @Test(priority = 4, groups = {"positive test menu"})
    @Description("Проверяем вкладку 'Хочу тестировать сайты'" +
            "должна быть активна и при нажатии открывать соответствующий функционал")
    public void checkTabsWantTest() {
        step("Проверяем вкладку 'Хочу тестировать сайты'");
        Assert.assertTrue(menuPage.tabWantTestButton());
    }

    @Test(priority = 5, groups = {"positive test menu"})
    @Description("Проверяем кнопку 'Войти'" +
            "должна быть активна и при нажатии открывать окно авторизации")
    public void checkLoginButton() {
        step("Проверяем кнопку 'Войти'");
        Assert.assertTrue(menuPage.loginButton());
        DriverManager.getDriver().quit();
    }

}


