import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {


    @Test
    public void addToCart() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");

        Actions action = new Actions(driver);

        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("balan_claudiu90@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("#send2")).click();

        WebElement men = driver.findElement(By.cssSelector(".nav-2 .has-children"));
        action.moveToElement(men).perform();
        driver.findElement(By.cssSelector(".nav-2-2 a ")).click();
        driver.findElement(By.cssSelector("li>a[title*='Plaid Cotton Shirt']")).click();
        driver.findElement(By.cssSelector("#swatch17 .swatch-label")).click();
        driver.findElement(By.cssSelector("img[alt*='Charcoal']")).click();
        WebElement shirt = driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-name > span"));
        Assert.assertTrue(shirt.isDisplayed());
        Assert.assertEquals("PLAID COTTON SHIRT",shirt.getText());



    }
}
