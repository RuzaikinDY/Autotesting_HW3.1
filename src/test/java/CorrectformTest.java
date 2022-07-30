import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CorrectformTest {

    private WebDriver driver;

    @BeforeAll
    static void SetupAll(){
        System.setProperty("webdriver.chrome.driver", "C:\\Education\\AutoTesting\\Selenium&Selenide\\driver\\win\\chromedriver.exe");
    }
    @BeforeEach
    void serUp(){
        driver=new ChromeDriver();
    }

    @Test
    void test(){
        driver.get("http://localhost:9999");
        
    }



    @AfterEach
    void tearDown(){
        driver.quit();
        driver=null;
    }
}
