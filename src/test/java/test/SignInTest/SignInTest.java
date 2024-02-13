package test.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {
        LOG.info("Chek 'Sign in' button");
        Assert.assertTrue(signInPage.isSignINButtonDisplayed(), "Button is not displayed");

        LOG.info("Clik 'Sign in' button");
        signInPage.clicksignInButton();

        LOG.info("Verfy if logo id displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");


    }
}


