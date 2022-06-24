package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class ElementsTest extends BaseTest {
    @BeforeMethod
    public void pageSetup() {
        driver.manage().window().maximize();
        //driver.navigate().to("https://demoqa.com/elements");
        // ne radi mi lokator za elements tako da idem direkt u svakom testu gde treba
    }

    @Test (priority = 10) //test da li moze da se cekira checkbox
    public void Checkbox() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/elements");
        sidebarPage.clickOnCheckBoxButton();
        Thread.sleep(2000);
        checkboxPage.clickOnCheckboxField();

        Assert.assertTrue(checkboxPage.getResult().isDisplayed());
    }

    @Test (priority = 20)//test promene imena u tabelama
    public void Webtables() {
        driver.get("https://demoqa.com/webtables");
        //sidebarPage.clickOnWebTablesButton();
        webtablesPage.clickOnEditButton1();
        webtablesPage.clickOnFirstNameButton1();
        webtablesPage.changeName();
        webtablesPage.clickOnSubmit();

//Assert.assertTrue(.contains("Vlada"));
    }

    @Test (priority = 30) // test upisivanja i submitovanja kredencijala
    public void Textbox(){
        driver.get("https://demoqa.com/text-box");
        textboxPage.clickOnFullName();
        textboxPage.insertName();
        textboxPage.clickOnEmail();
        textboxPage.insertEmail();
//        textboxPage.clickOnCurrentAddress();
//        textboxPage.insertCurrentAddress();
//        textboxPage.clickOnPermanentAddress();
//        textboxPage.insertPermanentAddress();
//       textboxPage.clickOnSubmitButton();
    }

    @Test (priority = 40)//testiranje click dugmeta
    public void Buttons() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(3000);
        buttonsPage.clickOnClickMeButton();
        Assert.assertTrue(buttonsPage.getNotification().isDisplayed());

    }

    @Test (priority = 50) // testiranje yes i impressive radio button
    public void radioButton() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.checkYesField();
        Assert.assertTrue(radioButtonPage.getYesConfirmationMessage().isDisplayed());
        Thread.sleep(5000);
        radioButtonPage.checkImpressiveField();
        Assert.assertTrue(radioButtonPage.getImpressiveConfirmationMessage().isDisplayed());

    }

    @Test (priority = 60) //brisanje podataka iz webtables
    public void Webtables1() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        webtablesPage.clickOnDeleteButton();
        Thread.sleep(3000);
        webtablesPage.clickOnDeletButton2();
        Thread.sleep(3000);
        webtablesPage.clickOnDeleteButton3();
        Thread.sleep(3000);
        //Assert.assertFalse(webtablesPage.getFirstName().isDisplayed());
    }

    @Test (priority = 70) //klikabilnost stranica
    public void Links(){
        driver.get("https://demoqa.com/links");
        linksPage.clickOnCreatedLink();
        Assert.assertTrue(linksPage.getCreatedNotification().isDisplayed());
    }

    @Test (priority = 80)//test skidanja slike
    public void DownloadImage(){
        driver.get("https://demoqa.com/upload-download");
        uploadAndDownloadPage.clickOnDownloadButton();
        File f = new File("C:\\Users\\Milos\\Downloads\\sampleFile.jpeg");
        //umesto Milos dodati user na kompjuteru na kom se testira. zatim izbrisati fajl da buduci testovi ne bi
        //pronalazili ovaj isti fajl

        Assert.assertTrue(f.exists());

    }

}