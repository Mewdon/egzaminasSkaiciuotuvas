import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calculator {
    static WebDriver driver;

    public static void setup() {

        System.setProperty("webdriver.chrome.driver", "src/webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
    }

    public static void closeBrowser() {
        driver.close();
    }


    public static boolean confirmUserLogin() {

        boolean result;
        try {
            driver.findElement(By.cssSelector("body > nav > div > ul.nav.navbar-nav.navbar-right > a"));
            result = true;
        } catch (NoSuchElementException e) {
            result = false;
        }
        return result;
    }


    public static boolean confirRecord() {

        boolean result;
        try {
            driver.findElement(By.cssSelector("#sk1\\.errors"));
            result = false;
        } catch (NoSuchElementException e) {
            result = true;
        }
        return result;
    }

    public static boolean confirmRecordEdit() {

        boolean result;
        try {
            driver.findElement(By.cssSelector("body > h1"));
            result = false;
        } catch (NoSuchElementException e) {
            result = true;
        }
        return result;
    }


    public static void goAtliktosOperacijos() {
        driver.findElement(By.cssSelector("body > nav > div > ul.nav.navbar-nav.navbar-left > li > a")).click();
    }


    public static boolean delete() {

        boolean result;

        List<WebElement> rowsBeforeDelete = driver.findElements(By.cssSelector("body > div > table > tbody > tr"));
        rowsBeforeDelete.size();


        driver.findElement(By.cssSelector("body > div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a:nth-child(2)")).click();
        driver.switchTo().alert().accept();

        List<WebElement> rowsAfterDelete = driver.findElements(By.cssSelector("body > div > table > tbody > tr"));
        rowsAfterDelete.size();


        if (rowsBeforeDelete.size() > rowsAfterDelete.size()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}


