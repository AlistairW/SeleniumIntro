import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;


public class DropDown {



  public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

      Map<String, Object> prefs = new HashMap<String, Object>();
      prefs.put("profile.default_content_setting_values.notifications", 2);
      ChromeOptions options = new ChromeOptions();
      options.setExperimentalOption("prefs", prefs);
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\alistair\\Documents\\Selenium Web Drivers\\chromedriver");
      WebDriver driver = new ChromeDriver(options);

    driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

    driver.findElement(By.xpath("//a[@value='BLR']")).click();

    Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".ui-state-highlight")).click();


  }



}

