package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menst {
	@FindBy(xpath="//div[@class='LazyLoad is-visible']")
	private WebElement prod;

	
	public Menst(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	
	public void prodavail()
	{
		if(prod!=null)
		{
			System.out.println("product match");
		}
		else
		{
			System.out.println("no match found");
			
		}
	}
	
}
