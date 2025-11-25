package AppTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {


    protected static WebDriver driver;
    protected static WebDriverWait wait;


    @BeforeClass
    public static void beforeClass() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    @AfterClass
    public static void afterClass() throws Exception {

        driver.quit();


    }

    @Before
    public void setUp() throws Exception {

        driver.get("https://www.euroleaguebasketball.net/en/euroleague/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }


    @After
    public void tearDown() throws Exception {

    }
}