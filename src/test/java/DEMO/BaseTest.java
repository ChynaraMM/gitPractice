package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setUpBrowser(){
        WebDriverManager.chromiumdriver().setup();// настроить драйвер хрома
        driver = new ChromeDriver(); // Управлять страницой и браузером, доступ
        driver.manage().window().maximize();//
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public  void tearDown(){
        driver.close();
        driver.quit();
    }
}
