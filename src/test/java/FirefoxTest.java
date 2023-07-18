import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirefoxTest extends TestBase{

    @Test
    public void rubberDucksLinkFirefoxTest() {
        WebElement rubberDucksLinkFirefox = firefoxDriver.findElement(By.xpath(
                "//td[@class='categories']//a")
        );
        rubberDucksLinkFirefox.click();
        String rubberDucksTitleFirefox = firefoxDriver.getTitle();

        Assert.assertEquals(rubberDucksTitleFirefox, "Rubber Ducks | My Store");
    }

    @Test
    public void manufacturersLinkFirefoxTest() {
        WebElement manufacturersLinkFirefox = firefoxDriver.findElement(By.xpath(
                "//td[@class='manufacturers']//a")
        );
        manufacturersLinkFirefox.click();
        String manufacturersTitle = firefoxDriver.getTitle();

        Assert.assertEquals(manufacturersTitle, "ACME Corp. | My Store");
    }

    @Test
    public void customerServiceLinkFirefoxTest() {
        WebElement customerServiceLinkFirefox = firefoxDriver.findElement(By.xpath(
                "//td[@class='account']//a[@href='https://litecart.stqa.ru/en/customer-service-s-0']")
        );
        customerServiceLinkFirefox.click();
        String customerServiceTitleFirefox = firefoxDriver.getTitle();

        Assert.assertEquals(customerServiceTitleFirefox, "Customer Service | My Store");
    }
}
