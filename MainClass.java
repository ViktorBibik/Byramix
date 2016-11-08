package bayramix.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Victor on 04.11.2016.
 */
public class MainClass {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test // Marking this method as part of the test
    public void gotoBayramixPage() {

        driver.get("http://www.bayramix.com.ua/");

        Menubar menubar = new Menubar(driver);
        ContactInformationAboutCompany contactInformationAboutCompany = new ContactInformationAboutCompany(driver);

        //clicl on page link - menubar/company contacts
        menubar.companyContacts.click();

        //find this elements on th page - Contacts
        System.out.println(" - Компания: " );
        System.out.println(contactInformationAboutCompany.companyName.getText());
        System.out.println(" - Адресс: ");
        System.out.println(contactInformationAboutCompany.companyAdress.getText());
        System.out.println(" - Контакты: ");
        System.out.println(contactInformationAboutCompany.companyContacts.getText());
    }
    @Test
    public void getCookie() throws InterruptedException {

        getCookiesFireFoxBrowser.main();
    }

    @AfterClass
    public void closePage(){
        driver.quit();
    }
}
