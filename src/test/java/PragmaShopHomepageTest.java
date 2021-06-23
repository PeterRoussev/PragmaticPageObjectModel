import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PragmaShopHomepage;
import pages.RegisterNewCustomerPage;
import utils.Browser;

import static pages.RegistrationConfirmationPage.*;

public class PragmaShopHomepageTest extends BaseTest{

    @Test
    public void goToRegistrationForm() {
        PragmaShopHomepage.goToPage();
        PragmaShopHomepage.clickMyAccount();
        PragmaShopHomepage.selectRegister();
    }

    @Test
    private void newCustomerRegistration(){
        goToRegistrationForm();
        RegisterNewCustomerPage.fillingInFirstANdLastName("Peter", "Roussev");
        RegisterNewCustomerPage.inputEmail();
        RegisterNewCustomerPage.inputPhoneNumber("0888987654");
        RegisterNewCustomerPage.inputPassword("neverShowIt99");
        RegisterNewCustomerPage.checkAgreeCheckBox();
        RegisterNewCustomerPage.acceptRegistrationFormByContinueButton();
    }

    @Test
    public void registrationAndConfirmation(){
        newCustomerRegistration();
        WebDriverWait wait = new WebDriverWait(Browser.driver, 3);
        wait.until(ExpectedConditions.titleIs("Your Account Has Been Created!"));
        Assert.assertEquals(getConfirmationText(), "Your Account Has Been Created!");
    }
}
