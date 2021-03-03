public class bluePrint {


    /*   @Test
    public void testWebPage() throws InterruptedException {
        try {


                String actualTitle = driver.getTitle();
               System.out.println(actualTitle);
               Assert.assertEquals(actualTitle,"WW (Weight Watchers): Weight Loss & Wellness Help | WW USA");

            driver.findElement(By.xpath("//span[@class='MenuItem_menu-item__inner-wrapper__1trJ0']//span[text()='Attend']")).click();
            driver.findElement(By.xpath("//span[@class='MobileMenuItem_mobile-menu-item__inner-wrapper__1mPxN MobileMenuItem_flexColumn__3lt9K']/parent::a[@aria-label='Virtual or in-person Workshops']")).click();

            String findClassTitle = driver.findElement(By.xpath("//div[@id='search-container']//h1")).getText();
            Assert.assertEquals("Find Your Workshop", findClassTitle);

            driver.findElement(By.xpath("//span[@class='buttonText-3DCCO' and text()='Studio']")).click();
           WebElement textbox = driver.findElement(By.xpath("//input[@id='location-search']"));
           textbox .sendKeys("10011");
           textbox .submit();



            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement searchResult = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='linkContainer-1NkqM']//a")));
            String searchResultText = searchResult.getText();
            System.out.println("Title of Result :" + searchResult.getText());
            System.out.println("Distance : " + driver.findElement(By.xpath("//div[@class='heading-3yCF-']//span")).getText());
            String Address= driver.findElement(By.xpath("//div[@class='address-3-YC0']")).getText();
            System.out.println("Address :"+ Address);
            searchResult.click();



//last
            String searchAddress = "";
            wait = new WebDriverWait(driver, 10);
            String firstResult = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='infoContainer-12kv1']//h1[@class='locationName-1jro_']"))).getText();

            searchAddress = driver.findElement(By.xpath("//div[@class='address-2PZwW']//div[1]")).getText()+"\n";
            searchAddress += driver.findElement(By.xpath("//div[@class='address-2PZwW']//div[2]")).getText();
      //      System.out.println("Expected Title :"+firstResult);
      //      System.out.println("Expected Address:" + searchAddress);
            Assert.assertEquals(searchResultText,firstResult,"Title Matched");
            Assert.assertEquals(Address,searchAddress,"Search Address Matched");


             wait = new WebDriverWait(driver, 15);
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='title-3o8Pv']"))).click();

            Date now = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(now);
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            //System.out.println("Today is :" + dayOfWeek);
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
            String Today = simpleDateformat.format(now).toUpperCase();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // driver.findElement(By.xpath("//div[@class='hoursWrapper-1KHIv show-1db4o']/div/div[i]//div[@class='dayName-CTNC6']")).getText()))
            System.out.println("Schdeule: " + driver.findElement(By.xpath("//div[@class='hoursWrapper-1KHIv show-1db4o']/div/div[" + dayOfWeek + "]//div[@class='times-fms3v']")).getText());

            WebElement workshopHeader = driver.findElement(By.xpath("//div[@class='title-bEfSM' and text()='Virtual Workshops schedule']/ancestor::div[2]//div[3]"));

            WebElement workshopDays = workshopHeader.findElement(By.xpath(".//span[text()='"+Today+"']/ancestor::div[1]"));
            //  List patientList = workshopDays.findElements(By.xpath(".//div/span/span"));
            List<WebElement> pateinetList = workshopDays.findElements(By.xpath("./child::*"));
//            System.out.println("Size :" + pateinetList.size());
            HashMap<String, Integer> PatientCount = new HashMap<>();
          //  System.out.println("Patient Name : " + workshopDays.findElement(By.xpath(".//div/span[2]")).getText());

            for (int i = 1; i < pateinetList.size(); i++) {
                String name = workshopDays.findElement(By.xpath(".//div["+i+"]/span[2]")).getText();
               // System.out.println("Patient Name :" + name);
                if (PatientCount.containsKey(name)) {
                    PatientCount.put(name, PatientCount.get(name) + 1);
                }
                else
                    PatientCount.put(name,1);
            }

            PatientCount.forEach((key, value) -> System.out.println(key + ":" + value));

            //      WebElement workshop= driver.findElement(By.xpath("//span[@class='MobileMenuItem_sub-menu__text__3F9pM']//span[text()='Unlimited Workshops']//ancestor::a[@href='https://www.weightwatchers.com/us/find-a-workshop/']"));
        } catch (
                Exception e) {
            e.printStackTrace();
        }

    }*/

}
