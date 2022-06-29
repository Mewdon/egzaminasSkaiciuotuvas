import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUser {
    static WebDriver driver;

    public static void loginUserPositive() {
        WebElement userName = driver.findElement(By.cssSelector("body > div > form > div > input:nth-child(2)"));
        userName.sendKeys("Test1");
        WebElement userPassword = driver.findElement(By.cssSelector("body > div > form > div > input:nth-child(3)"));
        userPassword.sendKeys("test123");
        driver.findElement(By.cssSelector("body > div > form > div > button")).click();
    }

    public static void loginUserNegative() {
        WebElement userName = driver.findElement(By.cssSelector("body > div > form > div > input:nth-child(2)"));
        userName.sendKeys("");
        WebElement userPassword = driver.findElement(By.cssSelector("body > div > form > div > input:nth-child(3)"));
        userPassword.sendKeys("");
        driver.findElement(By.cssSelector("body > div > form > div > button")).click();
    }
}
