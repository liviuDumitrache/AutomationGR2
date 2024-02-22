package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By impautFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By imputLastName = By.xpath("//input[@ng-model='LastName']");
    private By acceptConsent = By.xpath("//p[text()='Consent']");
    private By imputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmail = By.xpath("//input[@type='email']");
    private By inputPhoneNumber = By.xpath("//input[@ng-model='Phone' ]");




    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(impautFirstName).sendKeys(fName);
        driver.findElement(imputLastName).sendKeys(lName);
    }

    public void pressConsent() {
        LOG.info("Press consent");
        driver.findElement(acceptConsent).click();
    }


    public void insertAdress(String address) {
        LOG.info("Insert address");
        driver.findElement(imputAddress).sendKeys(address);
    }

    public void insertEmail(String email){
        LOG.info("Insert email");
        driver.findElement(inputEmail).sendKeys(email);

    }

    public void  insertPhoneNumber(String phoneNumber){
        LOG.info("Insert phone number");
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
    }


}
