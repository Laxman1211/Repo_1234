package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("vasu");
		FirefoxDriver dr=new FirefoxDriver(fp);
		dr.get("http://google.com");
		dr.findElement(By.linkText("Gmail")).click();
		dr.close();
	}

}
