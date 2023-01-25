import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLogin {
    public static void main (String[] args){

        //Setting system properties of ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        //object of Chromedriver
        WebDriver driver = new ChromeDriver();

        //launching the specified URL
        driver.get("https://www.hudl.com/login");

        //deleting all cookies
        driver.manage().deleteAllCookies();

        //locating elements and sending keys
        WebElement username=driver.findElement(By.id("email"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.id("logIn"));

        username.sendKeys("s_egeolu@yahoo.co.uk");
        password.sendKeys("huPmaf-piwva2-jendeq");
        login.click();
        driver.getCurrentUrl();
        driver.navigate().to("https://www.browserstack.com/");
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        assertTrue(verifyTitle);
    }
}

