package SourceFuse_KrishanMohan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitAllFields {

	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Base\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview");
		SubmitAllFields sm = new SubmitAllFields();
		sm.formSavingWithAllFields(driver);
	}
	
	public void formSavingWithAllFields(WebDriver driver) throws AWTException
	{
		driver.findElement(By.xpath("//div[@id='fnameInput']/input")).sendKeys("Krishan");
		driver.findElement(By.xpath("//div[@id='lnameInput']/input")).sendKeys("Bhalla");
		driver.findElement(By.xpath("//div[@id='emailInput']/input")).sendKeys("krishanmohanbhalla@live.com");
		driver.findElement(By.xpath("//div[@id='curCompanyInput']/input")).sendKeys("Vertex Infosoft Solutions Pvt. Ltd.");
		driver.findElement(By.xpath("//div[@id='mobInput']/input")).sendKeys("9988720819");
		driver.findElement(By.xpath("//div[@id='DOBInput']/div/input")).sendKeys("04/16/1988");
		driver.findElement(By.xpath("//div[@id='positionInput']/input")).sendKeys("QA Automation");
		driver.findElement(By.xpath("//div[@id='portfolioInput']/input")).sendKeys("google.com");
		driver.findElement(By.xpath("//div[@id='salaryInput']/input")).sendKeys("10 lakhs");
		driver.findElement(By.xpath("//div[@id='whenStartInput']/input")).sendKeys("2 months");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("H.no. 2886 New Tagore Nagar haibowal kalan");
		driver.findElement(By.xpath("//div[@id='resumeInput']")).click();
		Robot robot = new Robot();
		robot.setAutoDelay(1000);
		String filepath = System.getProperty("user.dir")+"\\src\\main\\java\\Base\\Resume-Krishan-Software Testing-7 YOE";
		StringSelection stringselection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.setAutoDelay(1000);
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println("Form saved successfully");
		driver.quit();
	}

}
