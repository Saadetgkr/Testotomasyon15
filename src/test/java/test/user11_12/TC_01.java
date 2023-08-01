package test.user11_12;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC_01 extends ExtentReport {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("Saadet", "Allovercommerce Test Edebilmeli");
        //Faker faker = new Faker();
        Page pages = new Page();


        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        ReusableMethods.bekle(3);
        assert pages.anasayfas.isDisplayed();
        ReusableMethods.webElementResmi(pages.anasayfas);
        extentTest.pass("Ana Sayfaya gidildi ve dogrulandi");


        //Sign in butonuna tıkla
        pages.signInButton.click();
        extentTest.info("Sıgn In butonuna tiklandi");
        ReusableMethods.bekle(3);




        //username ya da email adresi alanına username gir
        pages.userNames.sendKeys("saadetlisse.46@gmail.com");
        ReusableMethods.bekle(3);
        Assert.assertEquals(pages.userNames.getText(),("saadetlisse.46@gmail.com"));
        extentTest.info("Usename alanına email girildi");

        //şifre gir
        pages.passwords.sendKeys("admins12.");
        ReusableMethods.bekle(3);
        Assert.assertEquals(pages.passwords.getText(),("admins12."));
        extentTest.info("password alanına user name girildi");


        //Sign in butonuna tıkla
        //My account yazısının görünürlüğünü doğrula
        //Dashboard'un altında Orders'ın görünürlüğünü doğrula
        //Downloads'ın görünürlüğünü doğrula
        //Addresses'in görünürlüğünü doğrula
        //Account details'in görünürlüğünü doğrula
        //Wishlist'in görünürlüğünü doğrula
        //Chat box'ın görünürlüğünü doğrula
        //Support Tickets'in görünürlüğünü doğrula
        //Sayfayı aşağı doğru kaydır
        //Followings'in görünürlüğünü doğrula
        //Logout'un görünürlüğünü doğrula





    }
}
