import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='searchInput']")).sendKeys("Software test automation");
		driver.findElement(By.xpath(".//*[@id='search-form']/fieldset/button")).click();
		driver.quit();
	}

}
