package herokuInternetApp.pageObjects;

import automation.library.selenium.core.Locator;
import automation.library.selenium.core.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuAppPage extends PageObject{


    By heading = By.tagName("h3");
    String alertBtn = "//button[normalize-space()='%s']";
    String menu = "//li/a[contains(text(),'%s')]";


    public HerokuAppPage(WebDriver driver) {
        super(driver);
    }

    public void clickLink(String linkName){
        $(Locator.Loc.XPATH,menu, linkName).click();
    }

    public String getHeading(){
        return $(heading).getText();
    }

    public void clickButton(String txt){
        $(Locator.Loc.XPATH, alertBtn, txt).click();
    }
}
