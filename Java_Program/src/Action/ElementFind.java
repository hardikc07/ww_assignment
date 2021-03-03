package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementFind {

    WebDriver driver;
    public ElementFind(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By b)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(b));
    }

    public String getTextFromElement(By e)
    {
        return findElement(e).getText();
    }

    public void clickOnElement(By ele)
    {
        findElement(ele).click();
    }
    public  void sendText(By e, String txt)
    {
        WebElement textbox = findElement(e);
        textbox.sendKeys(txt);
        textbox.submit();
    }


}
