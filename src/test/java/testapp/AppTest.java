package testapp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {
    private WebDriver driver;

    @Test
    public void check() {
        driver.get("http://www.google.pl");
        driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).getText().contains("Zaloguj"));

    }

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\SeleniumDrivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
