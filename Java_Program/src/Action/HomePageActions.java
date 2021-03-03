package Action;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageActions extends HomePage {

    WebDriver driver;
    public HomePageActions(WebDriver driver) {
        super(driver);
        System.out.println(driver.getTitle());
        this.driver = driver;
    }
    public String verifyTitle()
    {
        return driver.getTitle();
    }

    public void clickOnMenu()
    {
     //   driver.findElement(By.xpath("//span[@class='MenuItem_menu-item__inner-wrapper__1trJ0']//span[text()='Attend']")).click();
        driver.findElement(getMenu()).click();
    }
    public void clickOnMenuItem()
    {
      String link= driver.findElement(getMenuItem()).getAttribute("href");
      driver.get(link);
    }



}
