package selenium_webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class seleniumintro {

	public static void main(String[] args) {
		//invoking browser 
				//ChromeDriver is a class in this class has methods to access these methods 
				//we need to create object for this class
				//webDriver-interface and classes has to do methods specified in interface such get() close()
				//ChromeDriver can also do personal class methods
				//inorder to access for firefox and other browsers or only webDriver methods change
				
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver udemy\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
	}

}
