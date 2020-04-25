import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2Test {

    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @After
    public void afterTest() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void openOtusSiteInChrome() {
        driver.get("https://otus.ru");
    }
}
