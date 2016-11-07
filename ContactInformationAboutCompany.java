package bayramix.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



/**
 * Created by Victor on 07.11.2016.
 */
public class ContactInformationAboutCompany {

        public ContactInformationAboutCompany (WebDriver driver){

            PageFactory.initElements(driver, this);
        }

        // contacts

        @FindBy(xpath = "//div[@class='item']//h2[@class='subtitle']")
        public WebElement companyName;

        @FindBy(xpath = "//div[@class='address']//ul[@class='blank']")
        public WebElement companyAdress;

        @FindBy(xpath = "//div[@class='contact']//ul[@class='blank']")
        public WebElement companyContacts;
    }
