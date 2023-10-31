package Wiki.tn.testSuites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Wiki.tn.Pages.CableUSBPage;

public class CableUSBTestSuite {
	CableUSBPage cable;
	
	@Before
	public void init() {
		Config.confChrome();
		Config.driver = new ChromeDriver();
		Config.maximiseWindow();
		String url ="https://www.tunisianet.com.tn/379-disques-ssd";
		Config.driver.get(url);
		cable = new CableUSBPage(Config.driver);
		
		
	}
	@Test
	public void shopOnCableusb() {
		cable.clickOnProductByName("Disque Dur Interne SSD TeamGroup GX2 / 128 Go");
		
	}
	



}
