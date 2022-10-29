package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trivago {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://weekend.trivago.co.uk/en-GB/GBP");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		
		 String xpath="//div[@class='Inspiration_searchForm__3NLKF']//div[@class='Control_control__2CV0z Control_type-distance__2OkWA Control_default__1oU77']//div[@role='button']";
		
		
		 driver.findElement(By.xpath(xpath)).click();
		 driver.findElement(By.xpath("//span[contains(text(),'100 miles')]")).click();
		
	
		 
		 
		
		
	}

}
