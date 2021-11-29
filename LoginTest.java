import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Source/resources");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/login");

        driver.findElement(By.id("email")).sendKeys("user@phptravels.com");
        driver.findElement(By.id("password")).sendKeys("demouser");
        Thread.sleep(1000);

        driver.findElement(By.className("Login")).click();
        Thread.sleep(4000);

        driver.quit();

    }
}
