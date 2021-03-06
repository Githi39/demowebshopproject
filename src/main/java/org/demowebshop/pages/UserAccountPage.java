package org.demowebshop.pages;

import org.demowebshop.utilities.TestHelpUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountPage extends TestHelpUtility {
    WebDriver driver;
    public UserAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final String _actualUserName = "//div[@class='header-links']//a[@class='account']";
    @FindBy(xpath = _actualUserName)
    private WebElement actualUserName;


    /**User action methods**/
    public  String getUserAccountEmail(){
        String email = page.getElementText(actualUserName);
        return email;
    }
}
