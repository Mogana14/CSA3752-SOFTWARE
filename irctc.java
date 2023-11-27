package st1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class irctc
{
    public static void main(String[] args) {
        System.out.println("Starting IRCTC login automation");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohan\\Downloads\\CSA37 Lab details\\Sellinium and junit\\selenium jar\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        // Open IRCTC website
        driver.get("https://www.irctc.co.in/nget/"); // Missing semicolon

        // Locate and interact with elements
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]"));
        loginButton.click();

        WebElement usernameField = driver.findElement(By.id("userId"));
        WebElement passwordField = driver.findElement(By.id("pwd"));
        WebElement loginSubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));

        usernameField.sendKeys("GOKUL gowtham C"); // Replace with your actual IRCTC username
        passwordField.sendKeys("2003"); // Replace with your actual IRCTC password
        loginSubmitButton.click();

        // Add a delay or close the browser as needed
        // driver.quit();
    }
}