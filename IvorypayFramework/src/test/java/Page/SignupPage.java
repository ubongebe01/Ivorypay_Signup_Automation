package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	WebDriver driver = null;
	
	By signup_link = By.linkText("Sign up");
	By first_name = By.id("register_firstName");
	By last_name = By.id("register_lastName");
	By emailinput = By.id("register_email");
	By business_name = By.id("register_businessName");
	By phn_num = By.xpath("//*[@id=\"register\"]/div[5]/div/div[2]/div/div/span/span/input");
	By password = By.id("register_password");
	By confirm_pw = By.id("register_confirmPassword");
	//By signup = By.xpath("//*[@id=\"register\"]/button");
	
	
	public SignupPage (WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clicksignuplink() {
	
	driver.findElement(signup_link).click();
	
	}
	
	public void sendfirstname(String fname) {
		
		driver.findElement(first_name).sendKeys(fname);
	}
	
	public void sendlastname(String lname) {
		
		driver.findElement(last_name).sendKeys(lname);
	}
	
	public void sendemail(String email) {
		
		driver.findElement(emailinput).sendKeys(email);
	}
	
	public void sendbusinessname(String bizname) {
		
		driver.findElement(business_name).sendKeys(bizname);
	}
	
	public void sendphoneno(String phoneno) {
		
		driver.findElement(phn_num).sendKeys(phoneno);
	}
	
	public void sendconfirm(String confirm) {
		
		driver.findElement(password).sendKeys(confirm);
	}
	
	public void sendconfirmpw(String confirmpw) {
		
		driver.findElement(confirm_pw).sendKeys(confirmpw);
	}
	
	//public void clicksignup() {
		
		//driver.findElement(signup).click();
		
	//}
}
