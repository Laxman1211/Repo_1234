package Day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel1 {

	public static void main(String[] args) {
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://gmail.com");
		dr.close();

	}

}
