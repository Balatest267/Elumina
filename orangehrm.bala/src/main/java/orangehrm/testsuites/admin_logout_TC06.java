package orangehrm.testsuites;

import java.io.IOException;
import org.testng.annotations.Test;

import orangehrm.base.reusablity;
import orangehrm.objects.admin_login_obj;
import orangehrm.objects.admin_logout_obj;

public class admin_logout_TC06 extends reusablity {
	
	@Test
	public void logout_admin_user() throws IOException, InterruptedException {
	admin_login_obj f = new admin_login_obj();
	f.openbrowser();
	f.login_admin();
	admin_logout_obj e = new admin_logout_obj();
	e.logout();
	

}
}