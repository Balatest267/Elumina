package orangehrm.objects;

import org.openqa.selenium.By;
import orangehrm.base.reusablity;

public class ESS_User_obj extends reusablity{

	public static By login_diff_btn = By.xpath("//*[@id='loginAsButtonGroup']/button");
	public static By choose_ESS_user = By.xpath("//*[@id='loginAsButtonGroup']/ul/li[3]/a");
	
	
	public void ESS_user() throws InterruptedException {
		ESS_User_obj.ClickElement(login_diff_btn);
		Thread.sleep(3000);
		ESS_User_obj.ClickElement(choose_ESS_user);
		
	}
}