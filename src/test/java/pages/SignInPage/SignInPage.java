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

    private By signInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By emailField = By.xpath("//input[@ng-model='Email']");
    private By passwordField = By.xpath("//input[@ng-model='Password']");
    private By enterButton = By.id("enterbtn");
    private By errormesage = By.id("errormsg");
    private By skipSignInButton = By.id("btn2");
    private By signUp = By.id("email");
    private By registerButton = By.id("enterimg");


    //metoda asta face clic pe buton
    public void clicksignInButton() {
        LOG.info("Click 'Sign' in button");
        driver.findElement(signInButton).click();
    }

    public boolean isSignINButtonDisplayed() {
        LOG.info("Very if 'Sign in button is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isLogoDisplayed() {
        LOG.info("Very if Logo image is didplayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void insertEmail(String Email) {
        LOG.info("imput 'Email' in field");
        driver.findElement(emailField).sendKeys(Email);
    }


    public void insertPassword(String Password) {
        LOG.info("imput 'Password' in field");
        driver.findElement(passwordField).sendKeys(Password);
    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        LOG.info("Very if error mesage  is displayed");
        return driver.findElement(errormesage).isDisplayed();
    }

    public void clickBack() {
        LOG.info("Click back in browser");
        driver.navigate().back();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click 'Skip sign in button' ");
        driver.findElement(skipSignInButton).click();
    }

    public void insertemail(String email) {
        LOG.info("insert email adress");
        driver.findElement(signUp).sendKeys(email);
    }

    public void clickregisterButton() {
        LOG.info("click register button");
        driver.findElement(registerButton).click();
    }

}

