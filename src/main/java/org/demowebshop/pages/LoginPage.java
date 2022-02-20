package org.demowebshop.pages;

import org.demowebshop.utilities.TestHelpUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestHelpUtility {
    WebDriver driver;
    /**page constructor **/
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    /**page elements **/
    private final String _userName="//input[@id='Email']";
    @FindBy(xpath=_userName)  private WebElement userName;

    private final String _password="//input[@id='Password']";
    @FindBy(xpath=_password)  private WebElement password;

    private final String _loginButton="//input[@class='button-1 login-button']";
    @FindBy(xpath=_loginButton)  private WebElement loginButton;

    /**user action methods **/

    public void enterUserName(String uName)
    {
        page.EnterText(userName,uName);
    }
    public void enterPassword(String PassWord)
    {
        page.EnterText(password,PassWord);
    }
    public UserAccountPage clickOnLoginButton()
    {
        page.clickOnElement(loginButton);
        return new UserAccountPage(driver);
    }
}
