package bayramix.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Victor on 04.11.2016.
 */
public class Menubar{
    public Menubar(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    //menuBar

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1 active current']")
    public WebElement aboutCompany;

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1' and @href='/frontpage/bayramix.html']")
    public WebElement products;

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1' and @href='/price.html']]")
    public WebElement priceList;

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1' and @href='/kontakty.html']")
    public WebElement companyContacts;

    @FindBy(xpath = "//nav[@id='menu']//a[@class='level1' and @href='/forum']")
    public WebElement forum;
}
