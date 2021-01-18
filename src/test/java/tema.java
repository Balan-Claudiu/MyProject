import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tema {

    public void tema(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
}
