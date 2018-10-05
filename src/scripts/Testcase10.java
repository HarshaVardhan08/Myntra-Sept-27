package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Loginp;
//import pom.Loginpage;
import pom.Menst;
import pom.Productsearch;
import generic.Auto_constants;
import generic.Excel;

public class Testcase10 implements Auto_constants{
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
		Loginp L=new Loginp(driver);
		L.email(us);
		L.Password(pd);
		L.loginbutton();
		Thread.sleep(2000);
		Productsearch ps=new Productsearch(driver);
		ps.search();
		ps.searchhbtn();
		Menst prd=new Menst(driver);
		prd.prodavail();
		//L.lgdm(driver);
		//L.logoutbutton();
	}

}
