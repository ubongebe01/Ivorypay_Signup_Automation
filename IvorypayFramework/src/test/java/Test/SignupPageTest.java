package Test;



import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.SignupPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupPageTest {

	WebDriver driver = null;

	@BeforeTest
	public void SetUpTest() {
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

@Test
	
	public void signupTest() throws InterruptedException {
		
		
		
	 SignupPage signupPgObj = new SignupPage(driver);
		
	 	//navigate to the ivorypay homepage, click on the signup link and wait for some seconds for reg form to open
		driver.get("https://qa.d1ainun5cjrnni.amplifyapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		signupPgObj.clicksignuplink();
		Thread.sleep(6000);
		
		// fill the user registration form 
		
		signupPgObj.sendfirstname("Ubong");
		signupPgObj.sendlastname("Udoakaebe");
		signupPgObj.sendemail("ubong.test@gmail.com");
		signupPgObj.sendbusinessname("Beauty homes Ltd");
		Thread.sleep(3000);
		//WebElement country = driver.findElement(By.xpath("//*[@id='rc_select_0']"));
		//Select countrydropdown = new Select(country);
		//countrydropdown.selectByVisibleText("Kenya");
		driver.findElement(By.xpath("//*[@id=\'rc_select_0\']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/div/div/div[3]/div")).click();
		
		
		signupPgObj.sendphoneno("9041659709");
		
		Thread.sleep(6000);
		
		// scroll down the page
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//contd. filling form
		
		signupPgObj.sendconfirm("Password001@");
		signupPgObj.sendconfirmpw("Password001@");
		
		// click on the affirmation buttons
		WebElement bizButton = driver.findElement(By.xpath("//*[@id=\"register_businessType\"]/label[1]/span[1]/input"));
		bizButton.click();
		
		WebElement devButton = driver.findElement(By.xpath("//*[@id=\"register_isDeveloper\"]/label[2]/span[1]/input"));
		devButton.click();
		
		WebElement termsButton = driver.findElement(By.xpath("//*[@id=\"register\"]/div[11]/label/span[1]/input"));
		termsButton.click();
		
		Thread.sleep(3000);
		
		// click on signup to submit registration
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\'register\']/button/span")).click();

		
		//test assertion
		 
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("IvoryPay Dashboard");
		assertTrue(verifyTitle);
				
		Thread.sleep(3000);
}
		
		@AfterTest
		public void TearDownTest() {
			driver.close();
			System.out.println("Test Completed Successfully");
		
	}











}
