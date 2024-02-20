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

    private By impautFirstName = By.xpath("//input[@ng-model='FirstName]");
    private By imputLastName = By.xpath("//input[@ng-model='LastName']");

    public void  insertFullName(String fName, String lName){
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(impautFirstName).sendKeys(fName);
        driver.findElement(imputLastName).sendKeys(lName);
    }



}
