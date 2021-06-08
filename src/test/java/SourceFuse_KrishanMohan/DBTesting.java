package SourceFuse_KrishanMohan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DBTesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, AWTException {
		String url = "jdbc:mysql://localhost:3036/qa";
		String username = "sfwebhtml";	
		String password = "t63KUfxL5vUyFLG4eqZNUcuRQ";
		String query ="Select * from QA";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		while (rs.next()){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Base\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
			driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview");
			driver.findElement(By.xpath("//div[@id='fnameInput']/input")).sendKeys(rs.getString("firstname"));
			driver.findElement(By.xpath("//div[@id='lnameInput']/input")).sendKeys(rs.getString("lastname"));
			driver.findElement(By.xpath("//div[@id='emailInput']/input")).sendKeys(rs.getString("email"));
			driver.findElement(By.xpath("//div[@id='curCompanyInput']/input")).sendKeys(rs.getString("currentcompany"));
			driver.findElement(By.xpath("//div[@id='mobInput']/input")).sendKeys(rs.getString("mobilenumber"));
			driver.findElement(By.xpath("//div[@id='DOBInput']/div/input")).sendKeys(rs.getString("DOB"));
			driver.findElement(By.xpath("//div[@id='positionInput']/input")).sendKeys(rs.getString("positionYouAreApplyingFor"));
			driver.findElement(By.xpath("//div[@id='portfolioInput']/input")).sendKeys(rs.getString("portfolioWebsite"));
			driver.findElement(By.xpath("//div[@id='salaryInput']/input")).sendKeys(rs.getString("salaryrequirements"));
			driver.findElement(By.xpath("//div[@id='whenStartInput']/input")).sendKeys(rs.getString("whenCanYouStart"));
			driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(rs.getString("address"));
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
		}
	}
	
}
