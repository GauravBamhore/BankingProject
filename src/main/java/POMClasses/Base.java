package POMClasses;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	protected static WebDriver driver;
	
	public void chromeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bamho\\eclipse-workspace\\InvestmentBankingProjectVER.1\\Driver\\chromedriver.exe");
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
	    option.addArguments("--start-maximized");
		driver = new ChromeDriver(option);
		driver.get(Utility.fetchDFMypropertyFile("URL"));
	}
	public void fireFoxBrowser() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bamho\\eclipse-workspace\\InvestmentBankingProjectVER.1\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(Utility.fetchDFMypropertyFile("URL"));
		
	}
	
	

	

}
