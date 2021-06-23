package pages;

import core.BasePage;
import org.openqa.selenium.By;
import utils.Browser;

public class RegistrationConfirmationPage extends BasePage {

    private static final By CONFIRMATION_TEXT= By.cssSelector("#content h1");

    public static String getConfirmationText(){
       return BasePage.getTextFrom(CONFIRMATION_TEXT);
    }
}
