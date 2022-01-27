import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class Assesment_3 {


        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\alistair\\IdeaProjects\\SeleniumIntro\\UDEMY -- Exact Course");
            WebDriver driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://rahulshettyacademy.com/loginpagePractise/");
            driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
            driver.findElement(By.id("password")).sendKeys("learning");
            driver.findElement(By.xpath("//label[2]//span[2]")).click();
            Thread.sleep(4000);
            driver.findElement(By.id("okayBtn")).click();
            driver.findElement(By.id("terms")).click();
            driver.findElement(By.xpath("//option[@value=\"consult\"]")).click();
            driver.findElement(By.id("signInBtn")).click();
            List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='card-title']"));
            String [] name = new String[productName.size()];

            for (int i = 0; i < productName.size(); i++) {

                name[i]=productName.get(i).getText();
                driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]")).get(i).click();
            }


        }
    }

