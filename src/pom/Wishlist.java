package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
	@FindBy(xpath="//div[@class='itemcard-removeIcon']")
	private WebElement close;
	@FindBy(linkText="MOVE TO BAG")
	private WebElement bag;
	@FindBy(xpath="(//button[.='Onesize'])[1]")
	private WebElement button;
	public Wishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void close()
	{
		close.click();
	}
	public void bag()
	{
		bag.click();
	}
	public void btn()
	{
		button.click();
	}

}
