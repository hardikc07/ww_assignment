package Pages;

import Action.ElementFind;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WorkShop {

    WebDriver driver;
    public WorkShop(WebDriver driver) {
        this.driver = driver;
    }

    By workshopTitle = By.xpath("//div[@id='search-container']//h1");
    By studioTitle = By.xpath("//span[@class='buttonText-3DCCO' and text()='Studio']");
    By textBox = By.xpath("//input[@id='location-search']");

    // after zip code search
   By titleLink= By.xpath("//div[@class='linkContainer-1NkqM']//a");
   By distance = By.xpath("//div[@class='heading-3yCF-']//span");
   By address = By.xpath("//div[@class='address-3-YC0']");

    public By getTitleLink() {
        return titleLink;
    }

    public By getDistance() {
        return distance;
    }

    public By getAddress() {
        return address;
    }

    public By getWorkshopTitle() {
        return workshopTitle;
    }

    public By getStudioTitle() {
        return studioTitle;
    }

    public By getTextBox() {
        return textBox;
    }
}
