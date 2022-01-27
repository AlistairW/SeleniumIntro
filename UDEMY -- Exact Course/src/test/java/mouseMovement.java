import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseMovement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","C:\\Users\\alistair\\IdeaProjects\\SeleniumIntro\\UDEMY -- Exact Coursechromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com/");
        Actions a = new Actions(driver);


        WebElement move = driver.findElement(By.id("#nav-link-accountList"));
        a.moveToElement(driver.findElement(By.id("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        //build means build all of it and execute (perform) at once.
        a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();

    }
}
