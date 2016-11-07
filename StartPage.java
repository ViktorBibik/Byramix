package bayramix.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Victor on 04.11.2016.
 * ДЗ #1
 * 1. Зайти на сайт байрамикс.
 * 2. Перейти в раздел контакты.
 * 3.Вывести данные про компанию в формате: Компания:.. Адрес: .. Контакты:
 */
public class StartPage {

    public class BasePage {
        public BasePage(WebDriver driver) {

            PageFactory.initElements(driver, this);
        }

        //header

        @FindBy(xpath = ".//*[@id='header']")
        public WebElement header;

        @FindBy(xpath = ".//*[@id='menubar']")
        public WebElement MenuBar;
    }
}
