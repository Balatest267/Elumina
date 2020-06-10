package orangehrm.base;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class reusablity {
	public static org.openqa.selenium.WebDriver driver;
	public static org.openqa.selenium.WebDriver wait = null;

	public org.openqa.selenium.WebDriver openbrowser() throws IOException, InterruptedException {
		
		  
		  System.setProperty("webdriver.chrome.driver","D:\\chrome& Firefox driver\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		 
		/*
		 * Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\chrome& Firefox driver\\geckodriver.exe"); driver = new FirefoxDriver();
		 */

		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		return driver;
	}

	// Click action
	public static boolean ClickElement(By Locator) {
		driver.findElement(Locator).click();
		return true;

	}

	// Clear action
	public static boolean ClearElement(By Locator) {
		driver.findElement(Locator).clear();
		return true;

	}

	// Send keys Action
	public static boolean SendElement(By Locator, String value) {
		driver.findElement(Locator).sendKeys(value);
		return true;

	}

	// Get text Action
	public static boolean GetText(By Locator) {
		driver.findElement(Locator).getText();
		return true;
	}
	
	public void takeSnapShot() throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(
				"C:\\Users\\balamurugan\\Downloads\\orangehrm.bala-20200609T115539Z-001\\orangehrm.bala\\orangehrm.bala\\src\\main\\java\\ScreenShots\\Screens.jpg");
		FileUtils.copyFile(SrcFile, DestFile);
	}
}
