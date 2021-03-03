package Pages;

import Action.ElementFind;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
   By menu = By.xpath("//span[@class='MenuItem_menu-item__inner-wrapper__1trJ0']//span[text()='Attend']");
    By menuItem = By.xpath("//span[@class='MobileMenuItem_mobile-menu-item__inner-wrapper__1mPxN MobileMenuItem_flexColumn__3lt9K']/parent::a[@aria-label='Virtual or in-person Workshops']");
    public By getMenu() {
        return menu;
    }

    public By getMenuItem() {
        return menuItem;
    }



}
