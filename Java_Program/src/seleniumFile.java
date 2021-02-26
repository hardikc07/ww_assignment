import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumFile {
    public static void main(String[] args){

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver","H:\\Java_Selenium\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        driver.get(" https://www.weightwatchers.com/us/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if(actualTitle.equalsIgnoreCase("WW (Weight Watchers): Weight Loss & Wellness Help | WW USA"))
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");
        driver.close();
        driver.quit();

    }
}
