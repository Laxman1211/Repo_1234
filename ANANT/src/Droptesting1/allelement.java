package Droptesting1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class allelement {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER"));
		WebElement drop=driver.findElement(By.name("city"));
		List<WebElement> dropdown=drop.findElements(By.name("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{	dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
				System.out.println(dropdown.get(i).getText() + "is active");
			
			else
				System.out.println(dropdown.get(i).getText()+ "is inactive");
		
	}

	}

}
