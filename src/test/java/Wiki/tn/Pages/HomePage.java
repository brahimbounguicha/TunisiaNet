package Wiki.tn.Pages;

import java.time.Duration;
import java.util.List;

import Helper.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement> menus;
	@FindBy(xpath = "/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[3]/div[2]/div/div[1]/ul/li/a")
	List<WebElement> submenus;
	public HomePage (WebDriver driver){

		PageFactory.initElements(driver, this);


	}
	public void moseHoverOnMenu(String menuTitle, String subMenu){
		try {


	for(WebElement menu :menus){



	if (menu.getText().contains(menuTitle)){

		Config.actions = new Actions(Config.driver);

	Config.actions.moveToElement(menu).perform();

		for (WebElement submenu : submenus)
			if (submenu.getText().contains(subMenu)) {

				submenu.click();
				//WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
				//wait.until(ExpectedConditions.urlContains(subMenu.toLowerCase()));
				//System.out.println(Config.driver.getCurrentUrl());

				break;
			}

	}

	}
		}catch (Exception e) {
				// TODO: handle exception
			}
	}




}
