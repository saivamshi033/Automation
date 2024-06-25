package practice;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class createOrg {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("http://localhost:8888/");
		//UN
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	//pwd
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	//click on login button
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	//maximize the Organization module
	driver.manage().window().maximize();
	//click on organization module
	driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	//click on org lookup image
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	//give org name
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Amazon");
	//save it
	driver.findElement(By.xpath("//input[@name='button']")).click();
	//verify whether it is created or not 
	
}
}
