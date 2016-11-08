package bayramix.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class getCookiesFireFoxBrowser {



    public static void main(String... args) throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("ar1starh@ukr.net");
        driver.findElement(By.id("pass")).sendKeys("deadmananor_1");
        driver.findElement(By.id("loginbutton")).click();

        File file= new File("browser.data");

        try{
            file.delete();
            file.createNewFile();
            FileWriter filewriter = new FileWriter(file);
            BufferedWriter bufwriter = new BufferedWriter(filewriter);

            for(Cookie ck : driver.manage().getCookies()){
                bufwriter.write(( ck.getName() + ";"
                                 +ck.getValue() + ";"
                                 +ck.getDomain() + ";"
                                 +ck.getPath() + ";"
                                 +ck.getExpiry() + ";"
                                 +ck.isSecure()));
                System.out.println(ck);
                bufwriter.newLine();
            }
            bufwriter.flush();
            bufwriter.close();
            filewriter.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
