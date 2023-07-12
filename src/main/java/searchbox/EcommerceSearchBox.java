package searchbox; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceSearchBox { // class//

	public static void main(String[] args) throws InterruptedException { // Main//

		WebDriver odriver = new ChromeDriver();

		odriver.navigate().to("https://www.amazon.in/");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();

		Thread.sleep(3000);

		By search = By.xpath("//input[@type='text']");

		By sub = By.xpath("(//input[@type='submit'])[1]");
		//By mob = By.xpath("(//div[text()='mobiles'])[2]");

		WebElement s = odriver.findElement(search);

		WebElement subm = odriver.findElement(sub);
		//WebElement m = odriver.findElement(mob);

		s.sendKeys("Television");
		subm.click();
		//m.click();
		
		odriver.close();

	}

}
