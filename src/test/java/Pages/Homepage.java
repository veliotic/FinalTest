package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Homepage {
    WebDriver driver;
    WebDriverWait webDriverWait;
    WebElement elementsButton;
    WebElement formsButton;
    WebElement afwButton;
    WebElement widgetsButton;
    WebElement interactionsButton;
    WebElement bookStoreButton;


    public Homepage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public WebElement getElementsButton() {

        return driver.findElement(By.xpath("//div//h5[text() = 'Elements']"));
    }

    public void clickOnElementsButton(){
        getElementsButton().click();
    }

}