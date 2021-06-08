package SourceFuse_KrishanMohan;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RequiredFields {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Base\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview");
		getAllRequiredFields();
	}

	public static void getAllRequiredFields()
	{	
		List<WebElement> requiredLabels = driver.findElements(By.xpath("//div[@class='form-group']"));
		for (int i = 0; i < requiredLabels.size(); i++) {

			if (requiredLabels.get(i).getText().contains("*")) {
				System.out.println("Required fields labels printed below:- "+ requiredLabels.get(i).getText());
			}
		}
		driver.quit();
	}
}
