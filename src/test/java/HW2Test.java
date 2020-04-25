import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2Test {

    private static WebDriver driver;
    private static String driverName;
    private static final Logger logger = LogManager.getLogger(HW2Test.class);

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
        logger.info("ChromeDriver is configurated");
    }

    @Before
    public void beforeTest() {
        driver = new ChromeDriver();
        driverName = driver.toString();
        logger.info(driverName + " started");
    }

    @After
    public void afterTest() {
        if (driver != null) {
            driver.quit();
            logger.info(driverName + " quited");
        }
        else {
            logger.warn("Driver to quit not found");
        }
    }

    @Test
    public void openOtusSiteInChrome() {
        driver.get("https://otus.ru");
        logger.info("OTUS site is opened in " + driverName);
    }
}
