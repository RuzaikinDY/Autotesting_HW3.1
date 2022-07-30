import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorrectformTest {

    private WebDriver driver;
    private ChromeOptions options;


    @BeforeAll
    static void SetupAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Education\\AutoTesting\\Selenium&Selenide\\driver\\win\\chromedriver.exe");
    }

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver = new ChromeDriver();
    }

    @Test
    void test() {
       driver.get("http://localhost:9999");
//        List<WebElement> elements = driver.findElements(By.className("input__control"));
//        elements.get(0).sendKeys("Иванов Иван");
//        elements.get(1).sendKeys("+79271520804");
        driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[type=\"tel\"]")).sendKeys("+79271520804");

        driver.findElement(By.className("checkbox__box")).click();
//        driver.findElement(By.className("button")).click();
        driver.findElement(By.tagName("button")).click();
        String text = driver.findElement(By.className("Success_successBlock__2L3Cw")).getText();
        assertEquals("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.", text.trim());
    }


    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }
}
