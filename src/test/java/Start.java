import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void stars() {
        // ability to load driver after version upgrade
        // System.setProperty("webdriver.chrome.driver", "address of driver");
        wd = new ChromeDriver();
        //  wd.get("https://www.google.com/");//open browser without history
        wd.navigate().to("https://www.google.com/"); //open browser with history
        // wd.navigate().back();
        //wd.navigate().forward();
        //wd.navigate().refresh();

        //wd.close();//only one tab and if tab only one & close browser
        wd.quit();//close all tabs
    }
}
