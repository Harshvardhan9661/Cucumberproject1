package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public static WebDriver driver;
	
	public static void intializeBrowser(String browsername) {
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();}
		else if(browsername.equals("edge")) {
			driver=new EdgeDriver();}
		else if(browsername.equals("edge")) {
			driver=new FirefoxDriver();}		
	}
	public static WebDriver getdriver() {
		return driver;
	}

}
