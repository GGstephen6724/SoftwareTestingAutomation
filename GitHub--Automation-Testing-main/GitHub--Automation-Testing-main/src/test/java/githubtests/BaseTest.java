package githubtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeClass
    public void setUp() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup(); // handles path!
            driver = new ChromeDriver();
            driver.get("https://github.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }
}