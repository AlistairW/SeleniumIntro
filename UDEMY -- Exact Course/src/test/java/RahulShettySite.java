import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class RahulShettySite {


        public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("profile.default_content_setting_values.notifications", 2);
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", prefs);        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alistair\\Documents\\Selenium Web Drivers\\chromedriver");
                WebDriver driver = new ChromeDriver(options);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get("https://rahulshettyacademy.com/locatorspractice/");

            driver.manage().window().maximize();

            driver.findElement(By.id("inputUsername")).sendKeys("rahul");

            driver.findElement(By.name("inputPassword")).sendKeys("hello123");

            driver.findElement(By.className("signInBtn")).click();

            System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

            driver.findElement(By.linkText("Forgot your password?")).click();

            Thread.sleep(1000);//

            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

            driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

            driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

            driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

            driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

            driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

            System.out.println(driver.findElement(By.cssSelector("form p")).getText());

            driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

            Thread.sleep(1000);

            driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

            driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

            driver.findElement(By.id("chkboxOne")).click();

            driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        }





    public class WindowActivities {



        public static void main(String[] args) {

// TODO Auto-generated method stub



            System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\alistair\\IdeaProjects\\karateFramework (1)\\karateFramework\\karateFramework\\karateautomation\\UDEMY -- Exact Course\\chromedriver\"");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("http://google.com");

            driver.navigate().to("https://rahulshettyacademy.com");

            driver.navigate().back();

            driver.navigate().forward();

        }



    }

    }



