import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodSite {
    public static void main(String[] args) {

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alistair\\Documents\\Selenium Web Drivers\\chromedriver");
        WebDriver driver = new ChromeDriver(options);

        String[] itemsNeeded = {"Cucumber", "Brocolli"};

        driver.get("https://rahulshettyacademy.com/seleniumPractice/");
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        List al = Arrays.asList(itemsNeeded);

        for(int i=0; i<products.size();i++){
           String name = products.get(i).getText();

           if(al.contains(name)){
               //click on add to cart
               driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
           }
        }
    }
}
