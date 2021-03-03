package TestCases;

import Action.ElementFind;
import Action.HomePageActions;
import Action.WorkShopActions;
import Action.WorkshopScheduleActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    static WebDriver driver;
    ElementFind ef;
    HomePageActions hpa;
    WorkShopActions wpa;
    WorkshopScheduleActions wssa;
    SoftAssert s1 = new SoftAssert();
    SoftAssert s2 = new SoftAssert();
    SoftAssert s3 = new SoftAssert();
    String SearchAddress = "";
    String SearchTitle = "";

    @BeforeTest
    public void initializeWebDriver() throws IOException {
        System.setProperty("webdriver.chrome.driver",".\\src\\chromedriver.exe");
     //   System.setProperty("webdriver.chrome.driver", "H:\\Java_Selenium\\chromedriver.exe");

        driver = new ChromeDriver();
        ef = new ElementFind(driver);
        hpa = new HomePageActions(driver);
        wpa = new WorkShopActions(driver);
        wssa = new WorkshopScheduleActions(driver);
        // To maximize browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // To open Gmail site
        driver.get("https://www.weightwatchers.com/us/");

    }

    @Test(priority = 1)
    public void HomePageAutomation() {

        s1.assertEquals(hpa.verifyTitle(), "\"WW (Weight Watchers): Weight Loss & Wellness Help | WW USA");
        hpa.clickOnMenu();
        hpa.clickOnMenuItem();
        s1.assertAll();
    }

    @Test(priority = 2)
    public void WorkshopPageAutomation() {
        s2.assertEquals(wpa.verifyTitle(),"Find WW Studios & Meetings Near You | WW USA");
        ef.findElement(wpa.getStudioTitle()).click();
        ef.sendText(wpa.getTextBox(), "10011");
        SearchTitle = ef.getTextFromElement(wpa.getTitleLink());
        SearchAddress = ef.getTextFromElement(wpa.getAddress());
        System.out.println("Search Result:" + SearchTitle);
        System.out.println("Distance :" + ef.getTextFromElement(wpa.getDistance()));
        System.out.println("Address :" + SearchAddress);
        ef.clickOnElement(wpa.getTitleLink());
        s2.assertAll();
    }

    @Test(priority = 3)
    public void WorkshopScheduleAutomation() {

        s3.assertEquals(SearchTitle, ef.getTextFromElement(wssa.getResultTitle()));
        String resultAdd = ef.getTextFromElement(wssa.getResultAddress1()) + "\n" + ef.getTextFromElement(wssa.getResultAddress2());
        s3.assertEquals(SearchAddress, resultAdd);
        ef.clickOnElement(wssa.getBusinessHours());

        System.out.println("\nToday is: " + wssa.findToday() + " and schedule: " + wssa.findDynamicElement(wssa.findDayofWeek()) + "\n");

        WebElement workshopHeader = ef.findElement(wssa.getWrokshopHeader());
        WebElement workshopDays = wssa.findDynamicDay(workshopHeader, wssa.findToday());
        List<WebElement> patientList = workshopDays.findElements(By.xpath("./child::*"));
        wssa.printPatientSchedule(patientList, workshopDays);
        s3.assertAll();
    }


    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}