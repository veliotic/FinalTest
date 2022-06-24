package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {
    WebDriver driver;
    WebDriverWait wdwait;
WebElement yesField;
WebElement impressiveField;
    WebElement yesConfirmationNotification;
    WebElement impressiveConfirmationNotification;
    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getYesField() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]"));
    }

    public WebElement getImpressiveField() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]"));
    }

    public WebElement getYesConfirmationMessage() {
        return driver.findElement(By.xpath("//span[text()='Yes']"));
    }

    public WebElement getImpressiveConfirmationMessage() {
        return driver.findElement(By.xpath("//span[text()='Impressive']"));
    }

    public void checkYesField(){
        this.getYesField().click();
    }
    public void checkImpressiveField(){
        this.getImpressiveField().click();
    }
}
