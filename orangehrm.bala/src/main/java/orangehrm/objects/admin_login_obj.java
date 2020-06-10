package orangehrm.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import orangehrm.base.reusablity;

public class admin_login_obj extends reusablity {

	
	//Declare the Objects here using "By" method 
	//Use the same code.
	// Extends the reusablity class here
	
	public static By username = By.id("txtUsername");
	public static By password = By.id("txtPassword");
	public static By login_btn = By.id("btnLogin");
	
	// Now create a method in order to call the above declared objects into the actions ( Click, sendkeys, Clear )
	
	public void login_admin() throws InterruptedException {
		
		admin_login_obj.ClearElement(username);
		admin_login_obj.SendElement(username, "admin");
		admin_login_obj.ClearElement(password);
		admin_login_obj.SendElement(password, "admin123");
		admin_login_obj.ClickElement(login_btn);
			
	}

		public void logout_admin_user() {
		// TODO Auto-generated method stub
		
	}
}
