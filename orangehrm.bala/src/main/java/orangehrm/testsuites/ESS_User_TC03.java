package orangehrm.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import orangehrm.base.reusablity;
import orangehrm.objects.ESS_User_obj;
import orangehrm.objects.admin_logout_obj;

public class ESS_User_TC03 extends reusablity {

	@Test
	public void ESS_User_Login() throws IOException, InterruptedException {
		ESS_User_obj c = new ESS_User_obj();
		c.openbrowser();
		Thread.sleep(5000);
		c.ESS_user();
		c.takeSnapShot();	
		admin_logout_obj h = new admin_logout_obj();
		h.logout();
		driver.close();
		System.out.println("The ESS User logged In successfully");
	}
}
