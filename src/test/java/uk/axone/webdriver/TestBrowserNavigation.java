package uk.axone.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Karthik.Gandhinathan
 */
public class TestBrowserNavigation {

    @Test
    public void testBrowserNavigationMethods(){
        System.setProperty("webdriver.chrome.driver", "C:\\vijayone\\Job Related\\Axone Training\\downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver cd = new ChromeDriver();
        //convenient way - to load a new webpage
        //cd.get("http://uitest.automationtester.uk/index.html");
        //longer way - to hold the browser's history
        cd.navigate().to("http://uitest.automationtester.uk");
        //code to click and navigate somewhere in the website
        cd.navigate().back();
        cd.navigate().forward();
        cd.navigate().refresh();



    }
}
