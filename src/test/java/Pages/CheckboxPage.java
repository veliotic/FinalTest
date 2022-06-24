package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxPage {
    WebDriver driver;
    WebDriverWait wdwait;
WebElement ckeckboxField;
WebElement result;
    public CheckboxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getResult() {
        return driver.findElement(By.id("result"));
    }

    public WebElement getCkeckboxField() {
        return driver.findElement(By.className("rct-checkbox"));
    }
    public void clickOnCheckboxField(){
        this.getCkeckboxField().click();
    }
}
