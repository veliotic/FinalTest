package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {
    WebDriverWait wdwait;
    WebDriver driver;
    WebElement clickMeButton;
    WebElement notification;

    public ButtonsPage(WebDriver driver, WebDriverWait wdwait) {
        this.wdwait = wdwait;
        this.driver = driver;
    }


    public WebElement getClickMeButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
    }

    public void clickOnClickMeButton(){
        this.getClickMeButton().click();
    }

    public WebElement getNotification() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }
}
