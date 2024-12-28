package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class C04_firstTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");

        if (driver.getTitle().contains("Test")){
            System.out.println("Title test PASSED");
        }else System.out.println("Title test FAILED");

        System.out.println(driver.getTitle());

        driver.quit();


    }
}
