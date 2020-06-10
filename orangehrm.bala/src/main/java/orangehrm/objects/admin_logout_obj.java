package orangehrm.objects;

import java.io.IOException;
import org.openqa.selenium.By;
import orangehrm.base.reusablity;

public class admin_logout_obj extends reusablity {

	public static By choose_profile = By.id("user-dropdown");
	public static By click_logout = By.id("logoutLink");
	
	
	public void logout() throws IOException {
		reusablity r = new reusablity();
		admin_logout_obj.ClickElement(choose_profile);
		r.takeSnapShot();
		System.out.println("The user choosed profile sucessfully");
		admin_logout_obj.ClickElement(click_logout);
		r.takeSnapShot();
		System.out.println("The user logged out sucessfully");
		
	}
}
