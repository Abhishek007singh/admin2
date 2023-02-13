package chebeloproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.html/");
		
		WebElement textbox_email = driver.findElement(By.name("email"));
		textbox_email.isDisplayed();
		textbox_email.isEnabled();
		textbox_email.sendKeys("abhisheksinghkashyap@gmail.com");
		
		WebElement textbox_password = driver.findElement(By.name("pass"));
		textbox_password.isDisplayed();
		textbox_password.isEnabled();
		textbox_password.sendKeys("678ghy");
		
		WebElement login_button = driver.findElement(By.name("login"));
		login_button.isDisplayed();
		login_button.isEnabled();
		login_button.click();

	}

}
