package test.RegisterTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;


public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String firstName = "Ion";
    String lastName = "Popescu";
    String address = "Cluj, Strada Ion Barbu  NR 456";
    String email = "automation@domain.com";
    String phone = "0147898547";
    String language = "English";
    String skill = "Java";
    String country = "India";
    String year = "1991";
    String month = "February";
    String day = "29";





    @Test
    public void fillRegister() {
        driver.get(newUrl);
        sleep(3000L);


        LOG.info("Press the consent button");
        registerPage.pressConsent();


        LOG.info("Typing full name");
        registerPage.insertFullName(firstName, lastName);

        LOG.info("Type in Address");
        registerPage.insertAdress(address);

        LOG.info("Type in email ");
        registerPage.insertEmail(email);

        LOG.info("Type in phone number");
        registerPage.insertPhoneNumber(phone);

        LOG.info("Select Gender");
        registerPage.setMaleGender();
        registerPage.setFemaleGender();

        LOG.info("Select Hobbies");
        registerPage.clickCricket();
        registerPage.clickMovies();
        registerPage.clickHockey();

        LOG.info("Select language");
        registerPage.selectLanguage(language);

        LOG.info("Select skill");
        registerPage.selectSkills(skill);

        LOG.info("Select Country");
        registerPage.selectCountry(country);

        LOG.info("Select date of birth");
        registerPage.setDateOfBirth(year, month, day);

        sleep(5000L);









    }
}
