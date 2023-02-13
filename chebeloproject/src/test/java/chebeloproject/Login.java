package chebeloproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.html/");
		
		WebElement login = driver.findElement(By.xpath(("//button[@id='loginbutton']")));
		login.click();
		driver.findElement(By.name("email")).sendKeys("abhishek.singhkashyap@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("hickenbottomcr7");
		driver.findElement(By.name("login")).click();
	



		// TODO Auto-generated method stub

	}

}
