package testPages;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
        step("Проверяем функционал авторизации'");
        authorizationPage.open(BASEURL);
        authorizationPage.authClient(EMAILCLIENT, PASSWORDCLIENT);
        boolean elementAfterAuth = authorizationPage.getCreateTestButtonState();
        Assert.assertTrue(elementAfterAuth, "Can not log in");
    }
}

