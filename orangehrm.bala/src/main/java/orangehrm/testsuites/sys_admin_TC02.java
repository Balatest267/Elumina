package orangehrm.testsuites;

import java.io.IOException;
import org.testng.annotations.Test;
import orangehrm.base.reusablity;
import orangehrm.objects.admin_logout_obj;
import orangehrm.objects.sys_admin_obj;

public class sys_admin_TC02 extends reusablity {
	
	@Test
	public void sys_admin_check() throws IOException, InterruptedException {
	sys_admin_obj b = new sys_admin_obj();
	b.openbrowser();
	b.sys_admin();
	b.takeSnapShot();
	admin_logout_obj h = new admin_logout_obj();
	h.logout();
	driver.close();
	System.out.println("System Admin logged in Successfully");

}
}