import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicSelenium extends TestManager {

    @Test
    public void openHomePage() {


        //    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://trello.com/");
//        driver.quit();
//    }
//    static WebDriver driver;
//
//    @BeforeAll
//    public static void  setUp(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

//    @AfterAll
//    public static void  tearDown(){
//        driver.quit();
//    }

            driver.get("https://trello.com/");
            String title = driver.getTitle();
            Assertions.assertEquals(title, "Trello");
        }
    }
