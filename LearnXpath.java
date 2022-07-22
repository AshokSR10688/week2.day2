package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("demosalesmanager");
driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@Class = 'decorativeSubmit']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ashok");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S R");
WebElement market = driver.findElement(By.xpath("(//select[contains(@id,'createLead')])[2]"));
Select drop2=new Select(market);
drop2.selectByIndex(4);
String title1 = driver.getTitle();
System.out.println(title1);
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
String title2 = driver.getTitle();
System.out.println(title2);
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
//driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
if (title1.equals(title2)) {
	System.out.println("Both are equal");
}
else {
	System.out.println("Both are different");
}
	}

}
