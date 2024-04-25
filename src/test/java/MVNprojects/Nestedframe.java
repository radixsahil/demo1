package MVNprojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nestedframe {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  ChromeOptions ops = new ChromeOptions();
//		  ops.addArguments("--remote-allow-origins=*");
//		  ChromeDriver driver = new ChromeDriver(ops);
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		  
		 WebDriver driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demoqa.com/alerts");
		  
		  
		  driver.switchTo().frame("frame1").switchTo().frame(0);
		  String displaytext = driver.findElement(By.tagName("p")).getText();
		  System.out.println(displaytext);
		  
		  driver.switchTo().parentFrame();
		  System.out.println("Partent iframe"+driver.getPageSource());
		  
	      driver.switchTo().defaultContent();
	      System.out.println("Main iframe"+driver.getPageSource());
		  
		  driver.close();
	}

}
