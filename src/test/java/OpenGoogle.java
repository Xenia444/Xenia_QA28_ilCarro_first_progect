import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGoogle {

    WebDriver wd;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
     //   System.setProperty("webdriver.gecko.driver", "/home/ksu/QA_Tools/geckodriver");
     //   wd = new FirefoxDriver();
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, 20);
        wd.manage().window().maximize();
        wd.get("https://www.google.com/");
    }

    @Test
    public void searchWebDriver() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q"))).click();
       // wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("WebDriver" + Keys.ENTER);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        wd.quit();
    }
}
