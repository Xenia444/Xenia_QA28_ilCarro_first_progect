// Generated by Selenium IDE
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1Test {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void test1() {
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("WebDriver" + Keys.ENTER);
  }
}
