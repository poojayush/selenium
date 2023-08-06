package test.util.org;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class test {
	static WebDriver driver = new ChromeDriver();
	
	public void zoominandout() throws AWTException, InterruptedException {
		
		Robot robot = new Robot();
		System.out.println("About to zoom in");
		for (int i = 0; i < 3; i++) {			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(5000);
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}
	public void HorizontalScroll(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	       js2.executeScript("window.scrollBy(0,-350)", "");
	}
	public void drpdown() {

        //Creating instance of Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://demoqa.com/select-menu");

        //Maximizing window
        driver.manage().window().maximize();

        //Selecting the multi-select element by locating its id
        Select select = new Select(driver.findElement(By.id("cars")));

        //Get the list of all the options
        System.out.println("The dropdown options are -");

        List<WebElement> options = select.getOptions();

        for(WebElement option: options)
            System.out.println(option.getText());

        //Using isMultiple() method to verify if the element is multi-select, if yes go onto next steps else eit
        if(select.isMultiple()){

            //Selecting option as 'Opel'-- ByIndex
            System.out.println("Select option Opel by Index");
            select.selectByIndex(2);

            //Selecting the option as 'Saab'-- ByValue
            System.out.println("Select option saab by Value");
            select.selectByValue("saab");

            // Selecting the option by text
            System.out.println("Select option Audi by Text");
            select.selectByVisibleText("Audi");

            //Get the list of selected options
            System.out.println("The selected values in the dropdown options are -");

            List<WebElement> selectedOptions = select.getAllSelectedOptions();

            for(WebElement selectedOption: selectedOptions)
                System.out.println(selectedOption.getText());


            // Deselect the value "Audi" by Index
            System.out.println("DeSelect option Audi by Index");
            select.deselectByIndex(3);

            //Deselect the value "Opel" by visible text
            System.out.println("Select option Opel by Text");
            select.deselectByVisibleText("Opel");

            //Validate that both the values are deselected
            System.out.println("The selected values after deselect in the dropdown options are -");
            List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

            for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect)
                System.out.println(selectedOptionAfterDeselect.getText());

            //Step#8- Deselect all values
            select.deselectAll();
        }
	}
	
	
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
		//t.rahulshetty();
		t.drpdown();
		
		
	}

}
