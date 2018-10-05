 package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom.Loginp;
//import POM.Loginp;
//import POM.Loginpage;
import generic.Auto_constants;
import generic.Excel;

public class Testcase1 implements Auto_constants  {
	static
	{
		System.setProperty(key,value);	
	}
	public static void main(String[] args) throws InterruptedException
	{
		String us=Excel.abc(excelpath, "sheet1", 1, 2);
		String pd=Excel.abc(excelpath, "sheet1", 2, 2);
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.myntra.com/login?");
		Loginp L=new
		Loginp(driver);
		L.email(us);
		L.Password(pd);
		L.loginbutton();
		Thread.sleep(2000);
		L.lgdm(driver);
		L.logoutbutton();
	}

}
