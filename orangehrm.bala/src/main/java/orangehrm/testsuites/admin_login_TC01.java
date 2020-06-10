package orangehrm.testsuites;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import orangehrm.base.reusablity;
import orangehrm.objects.admin_login_obj;
import orangehrm.objects.admin_logout_obj;

public class admin_login_TC01 extends reusablity{
	
	// Extend the reusable class here
	// Create a Object for the class where your objects are stored 
	// Call them using the reference id
	//Finally run only this class using TESTNG
	
	@Test
	public void login_01 () throws IOException, InterruptedException {
		
		
		admin_login_obj a = new admin_login_obj();
		a.openbrowser(); // Comes from reusable class
		a.takeSnapShot();
		a.login_admin(); // Comes from Object class
		a.takeSnapShot();	
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		admin_logout_obj h = new admin_logout_obj();
		h.logout();
		driver.close();
		System.out.println("The admin user logged In Successfully");
			
	}
	

}
