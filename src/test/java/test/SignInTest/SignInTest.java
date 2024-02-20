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
        String email = "abc@email.com";
        String password = "parola1";


        LOG.info("Chek 'Sign in' button");
        Assert.assertTrue(signInPage.isSignINButtonDisplayed(), "Button is not displayed");

        LOG.info("Clik 'Sign in' button");
        signInPage.clicksignInButton();

        LOG.info("Verfy if logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Insert Email");
        signInPage.insertEmail(email);

        LOG.info("Insert Password");
        signInPage.insertPassword(password);

        LOG.info("Clik 'Enter' button");
        signInPage.clickEnterButton();

        LOG.info("Verfy if error message is  displayed");
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Errror mesage  is not displayed");

        LOG.info("Navigate back ");
        signInPage.clickBack();

        LOG.info("Clik 'Skip sign in button' ");
        signInPage.clickSkipSignInButton();


    }
}


