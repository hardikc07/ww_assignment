package TestCases;

import Action.HomePageActions;
import Pages.HomePage;;
import org.testng.Assert;

public class HomePageTestCases extends BaseClass {

    public void testHomePage()
    {
        System.out.println("i am inside homepage testcases");
        HomePageActions hpa = new HomePageActions(BaseClass.driver);
        Assert.assertEquals(hpa.verifyTitle(),"\"WW (Weight Watchers): Weight Loss & Wellness Help | WW USA");
        hpa.clickOnMenu();
        hpa.clickOnMenuItem();
    }

}
