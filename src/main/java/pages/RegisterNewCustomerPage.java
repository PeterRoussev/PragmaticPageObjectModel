package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import utils.Browser;

public class RegisterNewCustomerPage {
    private static final By FIRST_NAME_FIELD = By.id("input-firstname");
    private static final By LAST_NAME_FIELD = By.id("input-lastname");
    private static final By EMAIL_FIELD = By.id("input-email");
    private static final By PHONE_FIELD = By.id("input-telephone");
    private static final By PASSWORD_FIELD = By.id("input-password");
    private static final By CONFIRM_PASSWORD_FIELD = By.id("input-confirm");
    private static final By AGREE_CHECK_BOX = By.cssSelector("input[name='agree']");
    private static final By CONTINUE_BUTTON = By.cssSelector(".btn.btn-primary");

    public static void fillingInFirstANdLastName(String firstname, String lastname) {
        Browser.driver.findElement(FIRST_NAME_FIELD).sendKeys(firstname);
        Browser.driver.findElement(LAST_NAME_FIELD).sendKeys(lastname);
    }

    public static void inputEmail() {
        String generatedRandomEmail = RandomStringUtils.random(9,true, false) + "@mail.bg";
        Browser.driver.findElement(EMAIL_FIELD).sendKeys(generatedRandomEmail);
    }

    public static void inputPhoneNumber(String phone) {
        Browser.driver.findElement(PHONE_FIELD).sendKeys(phone);
    }

    public static void inputPassword(String password) {
        Browser.driver.findElement(PASSWORD_FIELD).sendKeys(password);
        Browser.driver.findElement(CONFIRM_PASSWORD_FIELD).sendKeys(password);
    }
    public static void checkAgreeCheckBox(){
        Browser.driver.findElement(AGREE_CHECK_BOX).click();
    }

    public static void acceptRegistrationFormByContinueButton(){
        Browser.driver.findElement(CONTINUE_BUTTON).click();
    }
}