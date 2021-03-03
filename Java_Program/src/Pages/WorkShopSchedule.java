package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkShopSchedule {
    WebDriver driver;

    public WorkShopSchedule(WebDriver driver) {
        this.driver = driver;
    }

    By resultTitle = By.xpath("//div[@class='infoContainer-12kv1']//h1[@class='locationName-1jro_']");
    By resultAddress1 = By.xpath("//div[@class='address-2PZwW']//div[1]");
    By resultAddress2 = By.xpath("//div[@class='address-2PZwW']//div[2]");
    By businessHours = By.xpath("//div[@class='title-3o8Pv']");
    By wrokshopHeader = By.xpath("//div[@class='title-bEfSM' and text()='Virtual Workshops schedule']/ancestor::div[2]//div[3]");

    public By getResultTitle() {
        return resultTitle;
    }

    public By getWrokshopHeader() {
        return wrokshopHeader;
    }

    public By getResultAddress1() {
        return resultAddress1;
    }

    public By getBusinessHours() {
        return businessHours;
    }

    public By getResultAddress2() {
        return resultAddress2;
    }
}
