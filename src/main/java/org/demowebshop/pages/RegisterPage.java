package org.demowebshop.pages;

import org.demowebshop.utilities.TestHelpUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class RegisterPage extends TestHelpUtility {
    WebDriver driver;
    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    private final String _genders = "//div[@class='gender']//label";
    @FindBy(xpath=_genders)
    private List<WebElement> genders;

    private final String _fName = "FirstName";
    @FindBy(id=_fName)
    private WebElement fName;

    private final String _lName = "LastName";
    @FindBy(id=_lName)
    private WebElement lName;

    private final String _email = "Email";
    @FindBy(id=_email)
    private WebElement email;

    private final String _password = "Password";
    @FindBy(id=_password)
    private WebElement password;

    private final String _confirmPassword = "ConfirmPassword";
    @FindBy(id=_confirmPassword)
    private WebElement confirmPassword;

    private final String _registerButton = "register-button";
    @FindBy(id=_registerButton)
    private WebElement registerButton;
    public void selectGender(String genderToSelect)
    {
        for (int i = 0;i<genders.size();i++)
        {
            String value = page.getElementText(genders.get(i));
            if(value.equals(genderToSelect))
            {
                page.clickOnElement(genders.get(i));
            }
        }
    }
    public void enterFirstName(String fNameToEnter)
    {
        page.EnterText(fName,fNameToEnter);

    }
    public void enterLastName(String lNameToEnter)
    {
        page.EnterText(lName,lNameToEnter);
    }
    public void enterEmail(String emailToEnter)
    {
        page.EnterText(email,emailToEnter);
    }
    public void enterPassword(String passwordToEnter)
    {
        page.EnterText(password,passwordToEnter);
    }
    public void enterConfirmPassword(String confirmPasswordToEnter)
    {
        page.EnterText(confirmPassword,confirmPasswordToEnter);
    }
    public UserAccountPage clickOnRegisterButton()
    {
        page.clickOnElement(registerButton);
        return new UserAccountPage(driver);
    }

}
