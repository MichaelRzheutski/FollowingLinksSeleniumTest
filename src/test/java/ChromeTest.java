import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest extends TestBase {

    @Test
    public void rubberDucksLinkChromeTest() {
        WebElement rubberDucksLinkChrome = chromeDriver.findElement(By.xpath(
                "//td[@class='categories']//a")
        );
        rubberDucksLinkChrome.click();
        String rubberDucksTitleChrome = chromeDriver.getTitle();

        Assert.assertEquals(rubberDucksTitleChrome, "Rubber Ducks | My Store");
    }

    @Test
    public void manufacturersLinkChromeTest() {
        WebElement manufacturersLinkChrome = chromeDriver.findElement(By.xpath(
                "//td[@class='manufacturers']//a")
        );
        manufacturersLinkChrome.click();
        String manufacturersTitleChrome = chromeDriver.getTitle();

        Assert.assertEquals(manufacturersTitleChrome, "ACME Corp. | My Store");
    }

    @Test
    public void customerServiceLinkChromeTest() {
        WebElement customerServiceLinkChrome = chromeDriver.findElement(By.xpath(
                "//td[@class='account']//a[@href='https://litecart.stqa.ru/en/customer-service-s-0']")
        );
        customerServiceLinkChrome.click();
        String customerServiceTitleChrome = chromeDriver.getTitle();

        Assert.assertEquals(customerServiceTitleChrome, "Customer Service | My Store");
    }

}
