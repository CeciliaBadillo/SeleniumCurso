package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config
{
    public static String URL_QA = "http://automationpractice.com/index.php";
    public static String URL_DEV = "http://automationpractice.com/index.php";
    public static String user = "test.0@test.com";
    public static String password = "test1234";

    public static WebDriver navegadorChrome ()
    {
        System.getProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDrivers/chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver navegadorFireFox()
    {
        System.getProperty("webdriver.gecko.driver", "src/main/resources/Drivers/ChromeDrivers/chromedriver.exe");
        return new FirefoxDriver();
    }
}

