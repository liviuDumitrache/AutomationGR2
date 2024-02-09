package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By signInButton = By, id("btn1");

    public void clicksignInButton() {
        LOG.info("Click 'Sign' in button");
        driver.findElement(signInButton).click();
    }

    public  boolean isSignINButtonDisplayed(){
        LOG.info(("Very if 'Sign in button is dysplayed");
        return driver.findElement(signInButton).isDisplayed();


    }
}
