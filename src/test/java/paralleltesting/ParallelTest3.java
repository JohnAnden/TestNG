package paralleltesting;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.Assert;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.Test;

public class ParallelTest3 {
//testing firefox browser
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException
    {
        System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/img"));

        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }

    @Test
    void homePageTitle() throws InterruptedException
    {
        System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);

    }

    @AfterMethod
    void tearDown()
    {
        driver.quit();
    }
}
