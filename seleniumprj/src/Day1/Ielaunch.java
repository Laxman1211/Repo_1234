package Day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ielaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","D:\\Laxman\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("http://google.com");

	}

}
