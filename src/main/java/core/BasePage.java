package core;

import org.openqa.selenium.By;
import utils.Browser;

public class BasePage {

    public static String getTextFrom(By by){
        return Browser.driver.findElement(by).getText();
    }
}
