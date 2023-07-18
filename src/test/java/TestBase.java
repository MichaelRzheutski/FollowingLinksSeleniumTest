import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    protected WebDriver chromeDriver;
    protected WebDriver firefoxDriver;
    protected WebDriver edgeDriver;

    @BeforeMethod
    public void setup() {
        chromeDriver = new ChromeDriver();
        firefoxDriver = new FirefoxDriver();
        System.setProperty("webdriver.edge.driver","D:\\Java\\SeleniumDrivers\\Edge 109.0.1518.8\\msedgedriver.exe");
        edgeDriver = new EdgeDriver();

        chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
        firefoxDriver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
        edgeDriver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));

        chromeDriver.get("https://litecart.stqa.ru/en/");
        firefoxDriver.get("https://litecart.stqa.ru/en/");
        edgeDriver.get("https://litecart.stqa.ru/en/");
    }

    @AfterMethod
    public void teardown() {
        chromeDriver.quit();
        firefoxDriver.quit();
        edgeDriver.quit();
    }
}
