package herokuInternetApp.herokuTests;

import herokuInternetApp.pageObjects.HerokuAppPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest{

    HerokuAppPage po = new HerokuAppPage(getDriver());

    @BeforeMethod
    public void beforeTest() {
        getDriver().get("https://the-internet.herokuapp.com/");
    }

    @AfterTest
    public void afterTest(){
        getDriver().close();
    }

    @Test( description = "validate alerts text")
    public void validateTableContents(){
        po.clickLink("JavaScript Alerts");
        po.clickButton("Click for JS Alert");
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "I am a JS Alert", "Alert text is not as expected");
        getDriver().switchTo().alert().accept();


    }

}
