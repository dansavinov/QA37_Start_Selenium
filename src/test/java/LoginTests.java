import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTests {
    WebDriver wd;

    @BeforeTest
    public void preCondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.google.com/");
    }

    @Test
    public void loginSuccess() {

    }

    @Test
    public void loginWrongEmail() {

    }

    @Test
    public void loginWrongPassword() {


    }

    @AfterClass
    public void postCondition() {
        wd.quit();
    }
}
