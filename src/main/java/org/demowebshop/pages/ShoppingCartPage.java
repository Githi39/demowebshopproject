package org.demowebshop.pages;

import org.demowebshop.utilities.TestHelpUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends TestHelpUtility {
    WebDriver driver;

    /**Page Constructor**/
    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**Page elements**/

    private final String _product="//td[@class='product']/a[@class='product-name']";
    @FindBy(xpath = _product ) private WebElement product;

    /**User action methods**/

    public String getProductNameDisplayed() {
        return page.getElementText(product);
    }
}
