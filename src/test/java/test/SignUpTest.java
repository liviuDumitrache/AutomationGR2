package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;


public class SignUpTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void signUp() {
        String email = "abcd@yahoo.com";

        LOG.info("Insert email");
        signInPage.insertemail(email);

        LOG.info("click register button");
        signInPage.clickregisterButton();


    }
}
