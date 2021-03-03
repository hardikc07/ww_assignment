package Action;

import Pages.WorkShop;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkShopActions extends WorkShop {

    WebDriver driver;
    public WorkShopActions(WebDriver driver) {
        super(driver);
        System.out.println(driver.getTitle());
        this.driver = driver;
    }
    public String verifyTitle()
    {
        return driver.getTitle();
    }

}
