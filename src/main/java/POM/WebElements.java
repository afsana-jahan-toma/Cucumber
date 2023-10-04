package POM;

//import com.sun.xml.internal.ws.resources.UtilMessages;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebElements {
    WebDriver driver;
    public WebElements(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    By view = By.xpath("//input[@type=\"checkbox\"]");
    By studentID = By.xpath("//input[@id=\"UserName\"]");

    By Pass = By.xpath("//input[@id=\"PasWord\"]");
    By looggin = By.xpath("//button[@id=\"logIn_button\"]");

    public void clickTheInterface() {

        driver.findElement(view).click();
    }
    public void studentInputEnterYourIDAndEnterYourPassword(String ID, String password) {

        driver.findElement(studentID).sendKeys(ID);
        driver.findElement(Pass).sendKeys(password);

    }
    public void clickTheLoginButton() {
        driver.findElement(looggin).click();
    }


    public void goToTheLoginPage() {
    }

}