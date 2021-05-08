package herokuInternetApp.herokuTests;

import herokuInternetApp.pageObjects.HerokuAppPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HerokuTests extends BaseTest{

    @BeforeMethod
    public void beforeTest() {
        getDriver().get("https://the-internet.herokuapp.com/");
    }

    @AfterTest
    public void afterTest(){
        getDriver().close();
    }

    @Test(description = "validate page title for the sortable data tables page")
    public void validatePageTitle(){

        HerokuAppPage po = new HerokuAppPage(getDriver());
        po.clickLink("Sortable Data Tables");
        Assert.assertEquals(po.getHeading(),"Data Tables");

    }

}
