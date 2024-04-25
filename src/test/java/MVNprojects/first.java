package MVNprojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class first {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		  //ChromeOptions ops = new ChromeOptions();
		  //ops.addArguments("--remote-allow-origins=*");
		  //ChromeDriver driver = new ChromeDriver(ops);
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  
		 // WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
		System.setProperty("webdiver.gecko.driver","Drivers/geckodriver");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("https://demoqa.com/frames");
		  
		  
//		  driver.switchTo().frame("frame1");
//		  String header = driver.findElement(By.id("sampleHeading")).getText();
//		  System.out.println(header);
//		  
//		  driver.switchTo().defaultContent();
		  
	}	  

}
