package Action;

import Pages.WorkShopSchedule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class WorkshopScheduleActions extends WorkShopSchedule {

    WebDriver driver;
    Date now = new Date();
    HashMap<String, Integer> PatientCount = new HashMap<>();

    public WorkshopScheduleActions(WebDriver driver) {
        super(driver);
        System.out.println(driver.getTitle());
        this.driver = driver;
    }

    public String findDynamicElement(int dayOfWeek) {
        return driver.findElement(By.xpath("//div[@class='hoursWrapper-1KHIv show-1db4o']/div/div[" + dayOfWeek + "]//div[@class='times-fms3v']")).getText();
    }

    public WebElement findDynamicDay(WebElement e, String today) {
        return e.findElement(By.xpath(".//span[text()='" + today + "']/ancestor::div[1]"));
    }

    public String findToday() {
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        return simpleDateformat.format(now).toUpperCase();
    }

    public int findDayofWeek() {
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        return c.get(Calendar.DAY_OF_WEEK);
    }

    public void printPatientSchedule(List<WebElement> patientList,WebElement workshopDays) {

        for (int i = 1; i < patientList.size(); i++) {
            String name = workshopDays.findElement(By.xpath(".//div[" + i + "]/span[2]")).getText();
            if (PatientCount.containsKey(name)) {
                PatientCount.put(name, PatientCount.get(name) + 1);
            } else
                PatientCount.put(name, 1);
        }
        System.out.println("Patients List for "+ findToday()+" is:");
        PatientCount.forEach((key, value) -> System.out.println(key + ":" + value));
    }

}
