package SourceFuse_KrishanMohan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	SoftAssert softAssertion = new SoftAssert();

	@Test
	public void softAssertionForAllFields() {
		String firstName = "Krishan";
		String lastName = "Bhalla";
		String email = "krishanmohanbhalla@live.com";
		String currentCompany = "Vertex Infosoft Solutions Pvt. Ltd.";
		String mobileNumber = "9988720819";
		String dateOfBirth = "04/16/1988";
		String positionYouAreApplyingFor = "QA Automation";
		String portfolioWebsite = "//google.com";
		String salaryrequirements = "10Lakhs";
		String whenCanYouStart = "2 months";
		String address = "H.no. 2886 New Tagore Nagar haibowal kalan";

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Base\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		driver.get(
				"http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview");
		driver.findElement(By.xpath("//div[@id='fnameInput']/input")).sendKeys(firstName);
		driver.findElement(By.xpath("//div[@id='lnameInput']/input")).sendKeys(lastName);
		driver.findElement(By.xpath("//div[@id='emailInput']/input")).sendKeys(email);
		driver.findElement(By.xpath("//div[@id='curCompanyInput']/input")).sendKeys(currentCompany);
		driver.findElement(By.xpath("//div[@id='mobInput']/input")).sendKeys(mobileNumber);
		driver.findElement(By.xpath("//div[@id='DOBInput']/div/input")).sendKeys(dateOfBirth);
		driver.findElement(By.xpath("//div[@id='positionInput']/input")).sendKeys(positionYouAreApplyingFor);
		driver.findElement(By.xpath("//div[@id='portfolioInput']/input")).sendKeys(portfolioWebsite);
		driver.findElement(By.xpath("//div[@id='salaryInput']/input")).sendKeys(salaryrequirements);
		driver.findElement(By.xpath("//div[@id='whenStartInput']/input")).sendKeys(whenCanYouStart);
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(address);
		String actualfirstName = driver.findElement(By.xpath("//div[@id='fnameInput']/input")).getAttribute("value");
		softAssertion.assertEquals(actualfirstName, firstName);
		String actualLastName = driver.findElement(By.xpath("//div[@id='lnameInput']/input")).getAttribute("value");
		softAssertion.assertEquals(actualLastName, lastName);
		String actualEmail = driver.findElement(By.xpath("//div[@id='emailInput']/input")).getAttribute("value");
		softAssertion.assertEquals(actualEmail, email);
		String actualCurrentCompany = driver.findElement(By.xpath("//div[@id='curCompanyInput']/input"))
				.getAttribute("value");
		softAssertion.assertEquals(actualCurrentCompany, currentCompany);
		String ActualMobileNumber = driver.findElement(By.xpath("//div[@id='mobInput']/input")).getAttribute("value");
		softAssertion.assertEquals(ActualMobileNumber, mobileNumber);
		String actualDateOfBirth = driver.findElement(By.xpath("//div[@id='DOBInput']/div/input"))
				.getAttribute("value");
		softAssertion.assertEquals(actualDateOfBirth, dateOfBirth);
		String actualPositionYouAreApplyingFor = driver.findElement(By.xpath("//div[@id='positionInput']/input"))
				.getAttribute("value");
		softAssertion.assertEquals(actualPositionYouAreApplyingFor, positionYouAreApplyingFor);
		String actualPortfolioWebsite = driver.findElement(By.xpath("//div[@id='portfolioInput']/input"))
				.getAttribute("value");
		softAssertion.assertEquals(actualPortfolioWebsite, portfolioWebsite);
		String actualSalaryrequirements = driver.findElement(By.xpath("//div[@id='salaryInput']/input"))
				.getAttribute("value");
		softAssertion.assertEquals(actualSalaryrequirements, salaryrequirements);
		String actualWhenCanYouStart = driver.findElement(By.xpath("//div[@id='whenStartInput']/input"))
				.getAttribute("value");
		softAssertion.assertEquals(actualWhenCanYouStart, whenCanYouStart);
		String actualAddress = driver.findElement(By.xpath("//textarea[@id='address']")).getAttribute("value");
		softAssertion.assertEquals(actualAddress, address);
		softAssertion.assertAll();
		driver.quit();
	}

}
