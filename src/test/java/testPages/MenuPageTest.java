package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pflb.school.DriverManager;
import com.pflb.school.pages.*;

public class MenuPageTest {

    private final MenuPage menuPage = new MenuPage();
    private final AuthorizationPage authorizationPage = new AuthorizationPage();
    private static final String BASEURL = "http://test.uxcrowd.ru";

    @Test(priority = 1)
    public void checkTabsProduct() {
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.tabProductTitle());
    }

    @Test(priority = 2)
    public void checkTabsPrice() {
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.tabMenuItemPrice());
    }

    @Test(priority = 3)
    public void checkTabsFAQ() {
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.tabMenuItemFAQ());
    }

    @Test(priority = 4)
    public void checkTabsWantTest() {
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.tabWantTestButton());
    }

    @Test(priority = 5)
    public void checkLoginButton() {
        authorizationPage.open(BASEURL);
        Assert.assertTrue(menuPage.loginButton());
        DriverManager.getDriver().quit();
    }
}

