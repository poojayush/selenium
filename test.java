package test.util.org;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {
	static WebDriver driver = new ChromeDriver();
	
	public void rahulshetty() throws InterruptedException  {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input")).click();
		 driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("abcd");
		 driver.findElement(By.id("dropdown-class-example")).click();
		 driver.findElement(By.cssSelector("#dropdown-class-example > option:nth-child(2)")).click();
		 driver.findElement(By.cssSelector("#dropdown-class-example > option:nth-child(3)")).click();
		 driver.findElement(By.cssSelector("#dropdown-class-example > option:nth-child(4)")).click();
		 driver.findElement(By.id("checkBoxOption1")).click();
		 System.out.println("true"+driver.findElement(By.id("checkBoxOption1")).isSelected());
		 driver.findElement(By.id("checkBoxOption1")).click();
		 System.out.println("false"+driver.findElement(By.id("checkBoxOption1")).isSelected());
		 driver.findElement(By.className("blinkingText")).click();
			/*
			 * String url
			 * =driver.getCurrentUrl();driver.switchTo().newWindow(WindowType.TAB);
			 * driver.navigate().to(url);System.out.println(driver.getCurrentUrl());
			 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			 */
		 /************************************************************************/
		// Click on the button that opens the new window
		//driver.findElement(By.id("openwindow")).click();
		/*
		 * String currentWindowHandle = driver.getWindowHandle();
		 * 
		 * // Get the handles of all open windows Set<String> windowHandles =
		 * driver.getWindowHandles();
		 */
		// Remove the handle of the current window from the set of handles
	//	windowHandles.remove(currentWindowHandle);

		// Switch to the new window
		/*
		 * driver.switchTo().window(windowHandles.iterator().next());
		 * System.out.println(driver.getTitle());
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * driver.findElement(By.id("opentab")).sendKeys(Keys.CONTROL
		 * +"t");System.out.println(driver.getTitle());
		 */
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("pooja");
		 driver.findElement(By.id("alertbtn")).click();
		 Thread.sleep(5000);
		//Code to accept the alert pop up
		 Alert alert = driver.switchTo().alert(); System.out.println(driver.switchTo().alert().getText());
		 alert.accept();
		
		 System.out.println("alert accepted");
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("poojaconfirm");
		 driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();Thread.sleep(3000);
		 System.out.println(driver.switchTo().alert().getText());
		 alert.dismiss(); System.out.println("alert dissmiss");
		 
		 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("poojaconfirm");
		 driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();Thread.sleep(3000);
		 System.out.println(driver.switchTo().alert().getText());
		 alert.accept(); System.out.println("alert accepted by ok");
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"show-textbox\"]")).click();Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).sendKeys("hidetext");Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();Thread.sleep(3000);
		 
		 
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);Thread.sleep(3000);
		 WebElement baseTable = driver.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]"));

         String rowtext = tableRow.getText();
       rowtext.equalsIgnoreCase("Max Financial Servic");
		 System.out.println("first row of table : "+rowtext);
		 

	    
		
		 
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		/*
		 * driver.get(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * Thread.sleep(3000); WebElement
		 * username=driver.findElement(By.name("username")); username.sendKeys("Admin");
		 * WebElement password=driver.findElement(By.name("password"));
		 * password.sendKeys("admin123");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 * System.out.println(driver.getTitle());
		 */
		
		test t = new test();
		t.rahulshetty();
		
		
		
	}

}
