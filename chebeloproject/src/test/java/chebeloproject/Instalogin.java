package chebeloproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instalogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://edu-adminweb.adaptit.com/");
		
	    driver.findElement(By.id("emailInput")).sendKeys("9910");
	    
		driver.findElement(By.id("passwordInput")).sendKeys("1234");
		
		WebElement login = driver.findElement(By.xpath("//span[text()=' Sign In']"));
		
		login.click();
		

		
		// TODO Auto-generated method stub

	}

}
