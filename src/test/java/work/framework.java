package work;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framework {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\work\\target\\drive");
		
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String s = "https://www.facebook.com/";
        //String url ="https://chercher.tech/practice/frames-example-selenium-webdriver";
        driver.navigate().to(s);
        driver.manage().window().maximize();
        
         WebElement F = driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
        WebElement F1 = driver.findElement(By.xpath("//button[@type='submit']"));
        
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','subeka@gmail.com')", F,F1);
        
        Object o= js.executeScript("return arguments[0].getAttribute('value')", F,F1);
        System.out.println(o);
        
        
        js.executeScript("arguments[0].setAttribute('style','background:skyblue;border:2px solid pink')", F,F1);
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        
//        driver.switchTo().frame("frame1");
//        driver.switchTo().frame("frame3");
//        driver.findElement(By.xpath("//input[@id=\"a\"]")).click();
//        
//        driver.switchTo().parentFrame();
//        WebElement L =driver.findElement(By.xpath("//b[@id=\"topic\"]"));
//        System.out.println(L.getText());
//        
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
        
	}

}
