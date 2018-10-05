package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit {
	@FindBy(xpath="//div[.='Change password']")
	private WebElement chngpwd;
	
	@FindBy(xpath="//input[@id='cur-password']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@id='rp-password']")
	private WebElement nwpwd;
	
	@FindBy(xpath="//input[@id='confirm-password']")
	private WebElement cnfmpwd;
	
	@FindBy(xpath="//button[.='Change Password']")
	private WebElement cngpwd;
	
	public Edit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void edit()
	{
		chngpwd.click();		
	}
	public void old(String a)
	{
		pwd.sendKeys(a);
	}
	public void newpass(String b)
	{
		nwpwd.sendKeys(b);
	}
	public void conpass(String c)
	{
		cnfmpwd.sendKeys(c);
	}
	public void cngpassbtn()
	{
		cngpwd.click();
	}
}
