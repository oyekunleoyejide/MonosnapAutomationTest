package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;

    //import chromeDriver
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //input project URL = DeyDam login URL
        driver.get("https://monosnap.com/");
        //waiting for globally
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //maximise the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());

        //Locate Sign In button
        driver.findElement(By.className("headButton")).click();

        //Locate username field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[1]")).sendKeys("oyejideoyekunle@gmail.com");

        //Locate password field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[2]")).sendKeys("holyspirit77");

        //Click on sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();


        Thread.onSpinWait();
        //close the  after test
        driver.quit();
    }


    //initiate the test run command
    public static void main (String[] args) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }


    }
