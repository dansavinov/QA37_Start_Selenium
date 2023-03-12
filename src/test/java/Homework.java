import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Homework {

    WebDriver  wd;

    @BeforeClass
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        wd = new ChromeDriver(options);

        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {

        // by name
        WebElement element1 = wd.findElement(By.tagName("button"));
        WebElement element2 = wd.findElement(By.cssSelector("button"));
        WebElement xElement1 = wd.findElement(By.xpath("//button"));

        WebElement element3 = wd.findElement(By.tagName("body"));
        WebElement element4 = wd.findElement(By.cssSelector("body"));
        WebElement xElement2 = wd.findElement(By.xpath("//body"));
        WebElement element5 = wd.findElement(By.tagName("div"));
        WebElement element6 = wd.findElement(By.cssSelector("div"));
        WebElement xElement3 = wd.findElement(By.xpath("//div"));

        WebElement element7 = wd.findElement(By.tagName("h1"));
        WebElement element8 = wd.findElement(By.cssSelector("h1"));
        WebElement xElement4 = wd.findElement(By.xpath("//h1"));
        WebElement element9 = wd.findElement(By.tagName("a"));
        WebElement element10 = wd.findElement(By.cssSelector("a"));
        WebElement xElement5 = wd.findElement(By.xpath("//a"));
        WebElement element11 = wd.findElement(By.tagName("form"));
        WebElement element12 = wd.findElement(By.cssSelector("form"));
        WebElement xElement6 = wd.findElement(By.xpath("//form"));

        WebElement element13 = wd.findElement(By.tagName("input"));
        WebElement element14 = wd.findElement(By.cssSelector("input"));
        WebElement xElement7 = wd.findElement(By.xpath("//input"));

        // by class
        WebElement element15 = wd.findElement(By.className("container"));
        WebElement element16 = wd.findElement(By.cssSelector(".container"));
        WebElement xElement8  = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement element17 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element18 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement xElement9 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement element19 = wd.findElement(By.className("active"));
        WebElement element20 = wd.findElement(By.cssSelector(".active"));
        WebElement xElement10 = wd.findElement(By.xpath("//*[@class='active']"));

        // by id
        WebElement element21 = wd.findElement(By.id("root"));
        WebElement element22 = wd.findElement(By.cssSelector("#root"));
        WebElement xElement11 = wd.findElement(By.xpath("//*[@id='root']"));

        // by attribute
        WebElement element23 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement element24 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement element25 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement xElement12 = wd.findElement(By.xpath("//*[@placeholder='Email']"));

        // one of elements find by attribute ==> start & end & contains value
        WebElement element26 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement xElement13 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        //Start
        WebElement element27 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement element28 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));
        WebElement xElement14 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        // contains
        WebElement element29 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement xElement15 = wd.findElement(By.xpath("//input[contains(@placeholder,'ss')]"));
        WebElement xElement16 = wd.findElement(By.xpath("//a[3]"));







    }
}
