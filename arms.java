package st3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
public class arms {
	public static void main(String[] args) {
		System.out.println("hai");
		System.setProperty("webdriver.gecko.driver ","C:\\Users\\Hema vershini\\Downloads\\CSA37 Lab details\\Sellinium and junit\\selenium jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://arms.sse.saveetha.com");
		WebElement username=driver.findElement(By.id("txtusername"));
		
		System.out.println(username);
	
		WebElement password=driver.findElement(By.id("txtpassword"));
		System.out.println(password);
		WebElement login=driver.findElement(By.name("btnlogin"));
		
		System.out.println(login);
		username.sendKeys("192121047");
		password.sendKeys("Aksmk");
		login.click();

	}
}