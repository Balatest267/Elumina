package orangehrm.objects;

import org.openqa.selenium.By;
import orangehrm.base.reusablity;

public class FirstLevelSupervisor_obj extends reusablity{

	public static By login_diff_btn = By.xpath("//*[@id='loginAsButtonGroup']/button");
	public static By choose_1stLevelSupervisor = By.xpath("//*[@id='loginAsButtonGroup']/ul/li[4]/a");
	
	public void FirstLevelSupervisor_obj() throws InterruptedException {
		FirstLevelSupervisor_obj.ClickElement(login_diff_btn);
		Thread.sleep(3000);
		FirstLevelSupervisor_obj.ClickElement(choose_1stLevelSupervisor);
		
	}

	public void logout_admin_user() {
		// TODO Auto-generated method stub
		
	}
		
}

