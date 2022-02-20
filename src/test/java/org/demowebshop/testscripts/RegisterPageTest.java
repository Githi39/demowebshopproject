package org.demowebshop.testscripts;

import org.demowebshop.automationCore.Base;
import org.demowebshop.pages.HomePage;
import org.demowebshop.pages.RegisterPage;
import org.demowebshop.pages.UserAccountPage;
import org.demowebshop.utilities.ExcelUtility;
import org.demowebshop.utilities.RandomDataUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterPageTest extends Base {
    HomePage home;
    RegisterPage register;
    UserAccountPage userAccount;
    ExcelUtility excel = new ExcelUtility();
    @Test(priority=1)
    public void verifyUserRegistration()
    {
        home = new HomePage(driver);
        register = home.clickOnRegisterMenu();
        List<List<String>> data= excel.excelDataReader("registerPage");
        RandomDataUtility random=new RandomDataUtility();
        String email=random.getRandomString("email");
        //String email = register.randomStringGeneration();
        register.selectGender(data.get(1).get(0));
        register.enterFirstName(data.get(1).get(1));
        register.enterLastName(data.get(1).get(2));
        register.enterEmail(email);
        register.enterPassword(data.get(1).get(3));
        register.enterConfirmPassword(data.get(1).get(3));
        userAccount = register.clickOnRegisterButton();
         String actualEmail=userAccount.getUserAccountEmail();
        Assert.assertEquals(actualEmail,email,"ERROR:REGISTRATION FAILED");
    }
}
