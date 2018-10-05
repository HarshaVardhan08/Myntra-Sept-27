package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_constants;
import generic.Data;
import pom.Edit;
import pom.HomePage;
import pom.LoginPage;
import pom.LogoutPage;
import pom.Page;
import pom.WelcomePage;

public class Testcase4 implements Auto_constants {
	static {
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WelcomePage w=new WelcomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.logbtn(driver);
		w.login();
		  String us = Data.abc(excelpath, "Sheet1", 1, 2);
		  String pwd=Data.abc(excelpath,"Sheet1", 2,2 );
		  String product=Data.abc(excelpath, "Sheet1", 1, 0);
		  String oldpass=Data.abc(excelpath, "Sheet1", 5, 2);
		  String pass=Data.abc(excelpath, "Sheet1", 6, 2);
		  String conpwd=Data.abc(excelpath, "Sheet1", 7, 2);
		  LoginPage l=new LoginPage(driver);
		  l.email(us);
		  l.pass(pwd);
		  l.login();
		  Page p=new Page(driver);
		 p.log(driver);
		 p.edit();
		  Edit e=new Edit(driver);
		  e.edit();
		  e.old(oldpass);
		  e.newpass(pass);
		  e.conpass(conpwd);
		  e.cngpassbtn();
		  //e.log(driver);
		  //e.logout();
		 // driver.close();

		  
		  
	
	}

}
