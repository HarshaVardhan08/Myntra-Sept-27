package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clock_opt {
	@FindBy(xpath="(//input[@type='checkbox'])")
	private WebElement cb1;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement cb2;
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement cb3;
	 
	@FindBy(xpath="(//input[@type='checkbox'])[4]")
	private WebElement cb4;
	@FindBy(xpath="(//input[@type='checkbox'])[5]")
	private WebElement cb5;
	@FindBy(xpath="(//input[@type='checkbox'])[6]")
	private WebElement cb6;
	@FindBy(xpath="(//input[@type='checkbox'])[7]")
	private WebElement cb7;
	@FindBy(xpath="(//input[@type='checkbox'])[9]")
	private WebElement cb9;
	@FindBy(xpath="//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_180,c_limit,fl_progressive/assets/images/4705137/2018/4/12/11523520013768-n-111523520013581-1.jpg']")
	private WebElement pd1;	
	@FindBy(xpath="//span[@class='product-actionsButton product-wishlist']")
	private WebElement saved;
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement lbdm;
	@FindBy(xpath="(//div[@class='desktop-infoSection'])[2]")
	private WebElement wlst;
	public Clock_opt(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void checkbx1()
	{
		cb1.click();
	}
	public void checkbx2()
	{
		cb2.click();
	}
	public void checkbx3()
	{
		cb3.click();
	}
	public void checkbx4()
	{
		cb4.click();
	}
	public void checkbx5()
	{
		cb5.click();
	}
	public void checkbx6()
	{
		cb6.click();
	}
	public void checkbx7()
	{
		cb7.click();
	}
	public void checkbx9()
	{
		cb9.click();
	}
	
	public void pic(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(pd1).perform(); 
	}
	public void save()
	{
		saved.click();
	}
	public void log(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(lbdm).perform(); 
	}
	public void wish()
	{
		wlst.click();
	}
}
