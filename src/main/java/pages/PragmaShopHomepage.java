package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class PragmaShopHomepage {

    private static final String url = "http://shop.pragmatic.bg/";
    private static final By MY_ACCOUNT_FIELD = By.xpath("//ul[@class='list-inline']/li[2]");
    private static final By REGISTER_FIELD = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]");

    public static void goToPage(){
        Browser.driver.get(url);
    }

    public static void clickMyAccount(){
        Browser.driver.findElement(MY_ACCOUNT_FIELD).click();
    }

    public static void selectRegister(){
        Browser.driver.findElement(REGISTER_FIELD).click();
    }


}
