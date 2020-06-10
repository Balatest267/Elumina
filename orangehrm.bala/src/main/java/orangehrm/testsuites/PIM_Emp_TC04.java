package orangehrm.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import orangehrm.base.reusablity;
import orangehrm.objects.PIM_Employee_obj;
import orangehrm.objects.admin_login_obj;
import orangehrm.objects.admin_logout_obj;

public class PIM_Emp_TC04 extends reusablity{
	
	@Test
	public void Emp_PIM() throws IOException, InterruptedException {
	
	PIM_Employee_obj d = new PIM_Employee_obj();
	d.openbrowser();
	Thread.sleep(5000);
	admin_login_obj d1 = new admin_login_obj();
	d1.login_admin();
	d.Employee_details();
	admin_logout_obj h = new admin_logout_obj();
	h.logout();
	driver.close();
	
	

}
}