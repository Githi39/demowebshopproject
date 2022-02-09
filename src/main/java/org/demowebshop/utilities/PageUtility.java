package org.demowebshop.utilities;

import org.openqa.selenium.WebElement;

public class PageUtility {
    public void clickOnElement(WebElement element)
    {
        element.click();
    }
    public void EnterText(WebElement element, String value)
    {
        element.sendKeys(value);
    }
    public String getElementText(WebElement element)
    {
        return element.getText();
    }
    public String getAttributeValue(WebElement element,String attribute)
    {
        return element.getAttribute(attribute);
    }
    public boolean getDisplayValue(WebElement element)
    {
        return element.isDisplayed();
    }
    public boolean getSelectedValue(WebElement element)
    {
        return element.isSelected();
    }
    public boolean getEnabledValue(WebElement element)
    {
        return element.isEnabled();
    }
    public void SubmitOnElement(WebElement element)
    {
        element.submit();
    }
    public void getLocationValue(WebElement element)
    {
        element.getLocation();
    }
    public void getClear(WebElement element)
    {
        element.clear();
    }
    public String getTagnameValue(WebElement element)
    {
        return element.getTagName();
    }
}
