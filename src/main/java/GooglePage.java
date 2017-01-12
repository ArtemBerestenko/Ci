import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by aberestenko on 12/28/2016.
 */
public class GooglePage {
    String url;
    WebDriver driver
    private By googleInputLocator = By.id("lst-ib");

    public GooglePage() {
        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();

        url = "https://www.google.com.ua";
        driver.get(url);
    }


    public void setTextToSearch(String text) {
        driver.findElement(googleInputLocator).sendKeys(text);
        driver.findElement(googleInputLocator).sendKeys(Keys.ENTER);

    }


}
