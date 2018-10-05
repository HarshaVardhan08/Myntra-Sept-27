
	package pom;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Loginp {
		//static WebDriver driver=new ChromeDriver();

	@FindBy(xpath="//input[@type='email']")
	private WebElement emailtb;

	@FindBy(xpath="//input[@type='password']")
	private WebElement pswdtb;

	@FindBy(xpath="//button[.='Log in']")
	private WebElement loginbtn;

	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement lbdm;

	@FindBy(xpath="//a[.='Sign up']")
	private WebElement signup;

	@FindBy(xpath="(//div[.=' Logout '])[2]")
	private WebElement logoutbtn;

	public Loginp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	public void email(String usn)
	{
		emailtb.sendKeys(usn);;
	}

	public void Password(String pwd)
	{
		pswdtb.sendKeys(pwd);
	}

	public void loginbutton()
	{
		loginbtn.click();
	}
	public void lgdm(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(lbdm).perform(); 
	}
	public void logoutbutton()
	{
		logoutbtn.click();
	}
	public void signupbtn()
	{
		signup.click();
	}

	}


