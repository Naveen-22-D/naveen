package in.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Sample {
       public static void main(String[] args) {
    	   WebDriver driver=new ChromeDriver();
    	  driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
    	  driver.manage().window().maximize();
    	  WebElement txtname= driver.findElement(By.id("first_name"));
    	  txtname.sendKeys("NAVEEN");
    	  String attribute = txtname.getAttribute("value");
    	  System.out.println(attribute);
    	  WebElement txtlast=driver.findElement(By.id("last_name"));
    	  txtlast.sendKeys("Nvn");
    	  String attribute2 = txtlast.getAttribute(attribute);
    	  System.out.println(attribute2);
    	  WebElement txtaddress=driver.findElement(By.xpath("//textarea[@class='form-control address']"));
    	  txtaddress .sendKeys("THORAIPAKKAM OMR CHENNAI");
    	  String attribute3 = txtaddress.getAttribute("value");
    	  System.out.println(attribute3);
    	  WebElement txtemail=driver.findElement(By.id("email"));
    	  txtemail.sendKeys("naveen113@gmail.com");
    	  String attribute4 = txtemail.getAttribute("value");
    	  System.out.println(attribute4);
    	  WebElement txtphone=driver.findElement(By.id("phone"));
    	  txtphone.sendKeys("9955774433");
    	  String attribute5 = txtphone.getAttribute("value");
    	  System.out.println(attribute5);
    	  WebElement btnmale=driver.findElement(By.id("male"));
    	  btnmale.click();
    	  String attribute6 = btnmale.getAttribute("value");
    	  System.out.println(attribute6);
    	  WebElement btncricket=driver.findElement(By.id("checkbox-cricket"));
    	  btncricket.click();
    	  String attribute7 = btncricket.getAttribute("value");
    	  System.out.println(attribute7);
    	  WebElement btnmov=driver.findElement(By.id("movies"));
    	  btnmov.click();
    	  String attribute9 = btnmov.getAttribute("value");
    	  System.out.println(attribute9);
    	  WebElement txtpass=driver.findElement(By.id("password"));
    	  txtpass.sendKeys("kjbadasdd");
    	  String attribute14 = txtpass.getAttribute("value");
    	  System.out.println(attribute14);
    	  WebElement txtcon=driver.findElement(By.id("confirm-password"));
    	  txtcon.sendKeys("kjbadasdd");
    	  String attribute15 = txtcon.getAttribute("value");
    	  System.out.println(attribute15);
	}

}
