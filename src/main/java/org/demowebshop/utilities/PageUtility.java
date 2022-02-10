package org.demowebshop.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PageUtility {


    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void EnterText(WebElement element, String value) {
        element.sendKeys(value);
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }

    public String getAttributeValue(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public String getTagName(WebElement element) {
        return element.getTagName();
    }

    public void clearValue(WebElement element) {
        element.clear();
    }

    public Dimension getElementSize(WebElement element) {
        return element.getSize();
    }

    public boolean getDisplayValue(WebElement element) {
        boolean status = element.isDisplayed();
        return status;
    }
    public boolean getSelectedValue(WebElement element) {
        boolean status = element.isSelected();
        return status;
    }
    public boolean getEnabledValue(WebElement element) {
        boolean status = element.isEnabled();
        return status;
    }
    public void SubmitOnElement(WebElement element) {
        element.submit();
    }
    public Point getLocationValue(WebElement element) {
        return element.getLocation();
    }
    public void getClear(WebElement element) {
        element.clear();
    }
    public String getTagnameValue(WebElement element) {
        return element.getTagName();
    }
    public void selectDropDownByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void deselectDropDownByByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByVisibleText(value);
    }
    public void selectDropDownByIndex(WebElement element, int i) {
        Select select = new Select(element);
        select.selectByIndex(i);
    }
    public void deselectDropDownByIndex(WebElement element, int i) {
        Select select = new Select(element);
        select.deselectByIndex(i);
    }
    public void selectDropDownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void deselectDropDownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByValue(value);
    }
    public void selectDropDownByisMultiple(WebElement element) {
        Select select = new Select(element);
        select.isMultiple();
    }
    public void selectDropDownBydeSelectall(WebElement element) {
        Select select = new Select(element);
        select.deselectAll();
    }
    public void acceptAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public String alertGetText(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
    public void alertPrompt(WebDriver driver, String value) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(value);
    }
    public void alertDismiss(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public void doubleClick(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).build().perform();
    }
    public void clickAndHold(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
    }
    public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }
    public void dragAndDropByDragByoffset(WebDriver driver, WebElement source, int x, int y) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(source, x, y).build().perform();
    }
    public void moveToElement(WebDriver driver, WebElement source, int x, int y) {
        Actions actions = new Actions(driver);
        actions.moveToElement(source, x, y).build().perform();
    }
    public void contextClick(WebDriver driver, WebElement target) {
        Actions actions = new Actions(driver);
        actions.contextClick(target).build().perform();
    }
    public List<WebElement> dropDownValuesOptions(WebElement element) {
        Select select = new Select(element);
        return select.getOptions();
    }
    public void navigateTo(WebDriver driver, String url) {
        driver.navigate().to(url);
    }
    public void navigateForward(WebDriver driver) {
        driver.navigate().forward();
    }
    public void navigateBack(WebDriver driver) {
        driver.navigate().back();
    }
    public void navigateRefresh(WebDriver driver) {
        driver.navigate().refresh();
    }
    public void getWindowhandle(WebDriver driver, String value) {
        driver.getWindowHandle();
    }
    public void frameByIndex(WebDriver driver, int i) {
        Frame frame = new Frame();
        driver.switchTo().frame(i);
    }
    public void frameByNameOrId(WebDriver driver, String value) {
        Frame frame = new Frame();
        driver.switchTo().frame(value);
    }
    public void frameByWebElement(WebDriver driver, WebElement element) {
        Frame frame = new Frame();
        driver.switchTo().frame(element);
    }
    public String windowHandlesTogetParent(WebDriver driver) {
        return driver.getWindowHandle();
    }
    public Set<String> windowHandlesToGetChild(WebDriver driver) {
        return driver.getWindowHandles();
    }
}

