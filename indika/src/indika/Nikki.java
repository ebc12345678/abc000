package indika;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nikki {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
driver.get("file:///D:/Selenium/JBK%20Eclipse%20Configured%2064-bit%20(1)/javabykiran-"
		+ "Selenium-Softwares/Offline%20Website/index.html");

		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
}



