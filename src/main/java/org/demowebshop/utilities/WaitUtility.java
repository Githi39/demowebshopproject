package org.demowebshop.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility {
    public static final long PAGE_LOAD_WAIT = 20;
    public static final long EXPLICIT_WAIT = 50;

    public enum LocaterType
    {
        Id, Name, ClassName, Xpath, LinkText, PartialLinkText,TagName;
    }
    public void waitForTheElementToBeVisible(WebDriver driver, String target, Enum locatertype) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        if(locatertype.equals(LocaterType.Id))
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(target)));
        }
        if(locatertype.equals(LocaterType.ClassName))
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(target)));
        }
        if(locatertype.equals(LocaterType.Name))
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(target)));
        }
        if(locatertype.equals(LocaterType.Xpath))
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(target)));
        }
        if(locatertype.equals(LocaterType.LinkText))
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(target)));
        }
        if(locatertype.equals(LocaterType.PartialLinkText))
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(target)));
        }
        if(locatertype.equals(LocaterType.TagName))
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(target)));
        }
    }


}
