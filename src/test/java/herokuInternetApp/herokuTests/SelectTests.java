package herokuInternetApp.herokuTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class SelectTests extends BaseTest{

    @BeforeMethod
    public void beforeTest() {
        getDriver().get("https://the-internet.herokuapp.com/");
    }

    @AfterTest
    public void afterTest(){
        getDriver().close();
    }
}
