package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

    static {
        Logger logger = Logger.getLogger("");//shows only severe problems on the console
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));//Waits for 15 secs for page to be loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//If it takes more than 15 secs to a page
        // being loaded it throws an exception

    }

    public static void WaitAndQuit() {
        MyMethods.MyWait(4);
        driver.quit();

    }
}
