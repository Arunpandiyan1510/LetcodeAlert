package alt.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class letalt {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunqa\\eclipse-workspace\\letAlert\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/test");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("testing"));
		
		WebElement altlnk = driver.findElement(By.xpath("//a[text()='Dialog']"));
		altlnk.click();
		
		WebElement altBtn = driver.findElement(By.id("accept"));
		altBtn.click();
		
		//Alert syntax
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		
		Thread.sleep(3000);
		WebElement altcnclBtn = driver.findElement(By.id("confirm"));
		altcnclBtn.click();
		
		String alert = a.getText();
		System.out.println("ALERT TEXT: " + alert);
		
		a.dismiss();
		
		WebElement prmbt = driver.findElement(By.id("prompt"));
		prmbt.click();
		
		a.sendKeys("Arun");
		
		a.accept();
		
		
		
		WebElement modern = driver.findElement(By.id("modern"));
		modern.click();
		
		Thread.sleep(3000);
		WebElement sweetAlert = driver.findElement(By.xpath("//button[@class='modal-close is-large']"));
		sweetAlert.click();
		
		
		
		
	}
	

}
