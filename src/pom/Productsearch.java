package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productsearch {
	@FindBy(xpath="//input[@class='desktop-searchBar']")
	private WebElement search;

	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	private WebElement searchbtn;

	public Productsearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	
	public void search()
	{
			search.sendKeys("menst");
	}
	public void searchhbtn()
	{
			searchbtn.click();
	}
	
}
