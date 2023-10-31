package Wiki.tn.testSuites;

import Helper.Config;
import Wiki.tn.Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTestSuite {


    @Test
    public void shopOnCableUSBFromHomePage() throws InterruptedException {
        String url = "https://www.tunisianet.com.tn/";
        Config.confChrome();
        Config.driver = new ChromeDriver();
        Config.driver.get(url);
        Config.maximiseWindow();

        HomePage home = new HomePage(Config.driver) ;
        Thread.sleep(3000);
        home.moseHoverOnMenu("Stockage","Disque SSD");




    }



}
