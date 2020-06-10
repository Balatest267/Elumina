package orangehrm.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import orangehrm.base.reusablity;

public class sys_admin_obj extends reusablity {
	
	
	public static By login_diff_btn = By.xpath("//*[@id='loginAsButtonGroup']/button");
	public static By choose_sys_Admin = By.xpath("//*[@id='loginAsButtonGroup']/ul/li[1]/a");
	
	
	public void sys_admin() throws InterruptedException {
		
		sys_admin_obj.ClickElement(login_diff_btn);
		Thread.sleep(2000);
		sys_admin_obj.ClickElement(choose_sys_Admin);
	   
	}	

}
