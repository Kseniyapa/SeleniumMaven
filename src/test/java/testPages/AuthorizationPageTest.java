package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pflb.school.pages.AuthorizationPage;

public class AuthorizationPageTest {

    private final AuthorizationPage authorizationPage = new AuthorizationPage();

    private static final String EMAILCLIENT = "kspatschool@1secmail.com";

    private static final String PASSWORDCLIENT = "xclvTw";

    private static final String BASEURL = "http://test.uxcrowd.ru";

    @Test
    public void authClient() {
        authorizationPage.open(BASEURL);
        authorizationPage.authClient(EMAILCLIENT, PASSWORDCLIENT);
        boolean elementAfterAuth = authorizationPage.getCreateTestButtonState();
        Assert.assertTrue(elementAfterAuth, "Can not log in");
    }
}

