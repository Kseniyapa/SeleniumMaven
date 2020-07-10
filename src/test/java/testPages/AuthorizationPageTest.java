package testPages;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pflb.school.pages.AuthorizationPage;


import static io.qameta.allure.Allure.step;

public class AuthorizationPageTest {

    private final AuthorizationPage authorizationPage = new AuthorizationPage();

    private static final String EMAILCLIENT = "kspatschool@1secmail.com";

    private static final String PASSWORDCLIENT = "xclvTw";

    private static final String BASEURL = "http://test.uxcrowd.ru";

    @Test
    @Description(value = "Провека функционала авторизации с заранее известными данными, " +
            "при успешном прохождении должны попасть в личный кабинет")
    public void authClient() {
        step("Открываем соединение'");
        authorizationPage.open(BASEURL);
        step("Нажимаем кнопку'Войти'");
        authorizationPage.clickLoginButton();
        step("Вводим email");
        authorizationPage.fillEmailField(EMAILCLIENT);
        step("Вводим password");
        authorizationPage.fillPasswordField(PASSWORDCLIENT);
        step("Нажимаем кнопку 'Войти' в личный кабинет");
        authorizationPage.logInPersonalAccount();
        step("Нажимаем кнопку 'Выйти' из личного кабинета");
        authorizationPage.setLogOutButton();
        Assert.assertTrue(authorizationPage.getCreateTestButtonState(), "Can not log in");


    }

}

