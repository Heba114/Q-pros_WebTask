import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @Parameters("browserName")
    @BeforeClass
    public void setUp(String browserName){

        if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
            ChromeOptions opt = new ChromeOptions();
            opt.addExtensions(new File("Extensions/AdBlock.crx"));
            driver = new ChromeDriver(opt);
            driver.get("https://practice.automationtesting.in/");
            driver.manage().window().maximize();
            homePage = new HomePage(driver);
        }
        else if (browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "resource/geckodriver.exe");
            //FirefoxOptions option = new FirefoxOptions();
            //FirefoxProfile profile = new FirefoxProfile();
            //profile.addExtension(new File("Extensions/AdBlock.crx"));
            //profile.setPreference("extensions.adblock.currentVersion", "2.4");
            //option.setProfile(profile);
            driver = new FirefoxDriver();
            driver.get("https://practice.automationtesting.in/");
            driver.manage().window().maximize();
            homePage = new HomePage(driver);
        }
    }

    @AfterClass
    public void TearDown(){
        driver.quit();
    }
}
