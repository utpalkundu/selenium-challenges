package herokuInternetApp.herokuTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    protected WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().version("90.0.4430.24").setup();
            driver = new ChromeDriver();
        }
        return driver;
    }


}
