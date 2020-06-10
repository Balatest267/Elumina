package orangehrm.testsuites;

import java.io.IOException;

import org.testng.annotations.Test;

import orangehrm.base.reusablity;
import orangehrm.objects.FirstLevelSupervisor_obj;
import orangehrm.objects.admin_logout_obj;

public class FirstLevelSupervisor_TC5 extends reusablity {

	@Test
	public void FirstLevelSupervisor() throws IOException, InterruptedException {
		FirstLevelSupervisor_obj d = new FirstLevelSupervisor_obj();
		d.openbrowser();
		Thread.sleep(3000);
		d.FirstLevelSupervisor_obj();
		admin_logout_obj h = new admin_logout_obj();
		h.logout();
		driver.close();
		System.out.println("The FirstLevelSupervisor logged In sucessfully");
	}
}
