package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_logo1 {
@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']")
private WebElement cart;
public Cart_logo1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
public void cart()
{
	cart.click();
}
}
