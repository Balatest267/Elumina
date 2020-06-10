package orangehrm.objects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import orangehrm.base.reusablity;

public class PIM_Employee_obj extends reusablity {
	
	
	public static By choose_PIM = By.xpath("//*[@id='menu_pim_viewPimModule']/a");
	public static By choose_Emp_list = By.xpath("//*[@id='menu_pim_viewEmployeeList']/span[2]");
	public static By search_emp = By.id("employee_name_quick_filter_employee_list_value");
	
	    public void Employee_details() throws IOException, InterruptedException {
		reusablity s = new reusablity();
		PIM_Employee_obj.ClickElement(choose_PIM);
		System.out.println("PIM has been choosed Successfully");
		s.takeSnapShot();
		PIM_Employee_obj.ClickElement(choose_Emp_list);
		System.out.println("Employee List has been choosed Successfully");
		s.takeSnapShot();
		Thread.sleep(5000);
		PIM_Employee_obj.SendElement(search_emp, "Brody Alan");
		Thread.sleep(5000);
		WebElement a_log= driver.findElement(By.xpath("//*[@id='employee_name_quick_filter_employee_list_dropdown']/div[3]"));
		Actions al=new Actions(driver);
		al.moveToElement(a_log).click().perform();
		Thread.sleep(10000);
		System.out.println("Employee has been searched Successfully");
		s.takeSnapShot();
	}
}
