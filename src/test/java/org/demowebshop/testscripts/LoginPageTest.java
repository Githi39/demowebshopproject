package org.demowebshop.testscripts;

import org.demowebshop.automationCore.Base;
import org.demowebshop.constants.Constants;
import org.demowebshop.pages.HomePage;
import org.demowebshop.pages.LoginPage;
import org.demowebshop.pages.UserAccountPage;
import org.demowebshop.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends Base {
    HomePage home;
    LoginPage login;
    UserAccountPage userAccount;
    ExcelUtility excel=new ExcelUtility();
    @Test(priority = 1)
    public void verifyValidLogin() {
        home = new HomePage(driver);
        login = home.clickOnLoginMenu();
        List<List<String>> data = excel.excelDataReader("login");
        String uname = data.get(1).get(0);
        login.enterUserName(uname);
        String pwd = data.get(1).get(1);
        login.enterPassword(pwd);
        userAccount = login.clickOnLoginButton();
        String actualEmailId=userAccount.getUserAccountEmail();
        Assert.assertEquals(actualEmailId,uname,"ERROR: USER LOGIN FAILED");
    }
}
