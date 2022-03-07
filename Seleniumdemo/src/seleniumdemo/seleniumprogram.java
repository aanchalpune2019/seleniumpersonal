package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumprogram {

	public static void main(String[] args) throws Exception {
		
		
		           // System Property for Chrome Driver   
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhic\\OneDrive\\Documents\\SeleniumSoftware\\chromedriver.exe");
		        	
		          
		             // Instantiate a ChromeDriver class.     
		        WebDriver driver=new ChromeDriver();  
		          
		           // Launch Website  
		        driver.navigate().to("http://www.javatpoint.com/");  
		          
		         //Maximize the browser  
		          driver.manage().window().maximize();  
		          
		         
		        
		        Thread.sleep(3000);
		        driver.close();
		  
		    }  
		 
		 

	}


