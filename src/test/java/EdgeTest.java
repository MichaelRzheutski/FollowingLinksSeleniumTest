import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EdgeTest extends TestBase {

    @Test
    public void rubberDucksLinkEdgeTest() {
        WebElement rubberDucksLinkEdge = edgeDriver.findElement(By.xpath(
                "//td[@class='categories']//a")
        );
        rubberDucksLinkEdge.click();
        String rubberDucksTitleEdge = edgeDriver.getTitle();

        Assert.assertEquals(rubberDucksTitleEdge, "Rubber Ducks | My Store");
    }

    @Test
    public void manufacturersLinkEdgeTest() {
        WebElement manufacturersLinkEdge = edgeDriver.findElement(By.xpath(
                "//td[@class='manufacturers']//a")
        );
        manufacturersLinkEdge.click();
        String manufacturersTitleEdge = edgeDriver.getTitle();

        Assert.assertEquals(manufacturersTitleEdge, "ACME Corp. | My Store");
    }

    @Test
    public void customerServiceLinkEdgeTest() {
        WebElement customerServiceLinkEdge = edgeDriver.findElement(By.xpath(
                "//td[@class='account']//a[@href='https://litecart.stqa.ru/en/customer-service-s-0']")
        );
        customerServiceLinkEdge.click();
        String customerServiceTitleEdge = edgeDriver.getTitle();

        Assert.assertEquals(customerServiceTitleEdge, "Customer Service | My Store");
    }
}
