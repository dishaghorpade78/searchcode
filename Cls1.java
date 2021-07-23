package BrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cls1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Applications/SeleniumWorkspace/TestNgProject/chromedriver");
		ChromeDriver c1 = new ChromeDriver();
	//	System.out.println("New Chrome");
		c1.get("https://www.google.com/");
		WebElement txt1=c1.findElement(By.xpath("//input[@name='q']"));
		txt1.clear();
		txt1.sendKeys("RTS LABS");
		Thread.sleep(2000);
		c1.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		c1.findElementByXPath("//a[@href=\"https://rtslabs.com/\"]").click();
		c1.findElementByLinkText("RTS Labs").click();
		
	}

}
