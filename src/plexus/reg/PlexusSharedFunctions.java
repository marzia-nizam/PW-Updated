package plexus.reg;





import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;





public class PlexusSharedFunctions {
	public static WebDriver driver=null;
    public static String PromotionName=null;
    public static String Name = "TEST November24";
	public static String start_date = "01/02/18";
	public static String ActualText= null;
	@BeforeClass(alwaysRun=true)
	public static void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E://ECLIPSE//workplace//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D://ECLIPSE//eclipse workplace//geckodriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
	    driver = new ChromeDriver( options );
		//driver= new FirefoxDriver();
		//driver.get("https://external.plexuspromotions.com.au");
	    driver.get("http://staging.plexuspromotions.com.au/");
	  //  driver.get("http://dev.plexuspromotions.com.au/");
	}
	
	

	@SuppressWarnings("deprecation")
	public static void Login()
	{
		driver.findElement(By.name("username")).sendKeys("marzia.b.nizam@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password123456");
		driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div[2]/form/footer/button")).click();
		ImplicitWait(30);
		//driver.findElement(By.linkText("Skip")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();

		//PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[1]/div/div[2]/a");
		ImplicitWait(60);
		verifyTextPresent("Promotions Wizard");
		
		System.out.println("Logged in successfully");
		
	}
	
	 public static void CheckPromotionForm(String PromotionName)
	  {
		 
		  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div/ul[1]/li[1]/a/span[1]");
		  PlexusSharedFunctions.verifyTextPresent("LET'S GET STARTED");
		  driver.findElement(By.name("title")).sendKeys(PromotionName);
		  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div/div/section/form/footer/button[2]");
	 }
	 public static void ScrollUp()
	    {
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("scroll(250,0);");
	    }
	 public static void CheckPromoterInformation() throws InterruptedException
	  {
		// driver.findElement(By.linkText("Melissa Pty Ltd")).click();
		// PlexusSharedFunctions.ClickablebyXpath(".//*[@id='promoter-form']/footer/button[2]");
		  PlexusSharedFunctions.verifyTextPresent("Add Promoter");
		  Thread.sleep(2000);
		  PlexusSharedFunctions.CheckEmpty("companyName","Promoter Pvt Limited");
		  PlexusSharedFunctions.CheckEmpty("streetLine1","Level 1");
		  PlexusSharedFunctions.CheckEmpty("streetLine2","23 Main St");
		  PlexusSharedFunctions.CheckEmpty("suburb","Smithfield");
		  PlexusSharedFunctions.CheckEmpty("postcode","1111");
		  Select oSelect = new Select(driver.findElement(By.name("country")));
	      oSelect.selectByVisibleText("Australia");
	      Select oSelect1 = new Select(driver.findElement(By.name("state")));
	      oSelect1.selectByVisibleText("Victoria");
		  PlexusSharedFunctions.CheckEmpty("phoneNumber","(03) 9908 3784");
		  PlexusSharedFunctions.CheckEmpty("businessNumber","123 456 789 10");
		  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='promoter-form']/footer/button[2]");
		
		
	}
	public static void ImplicitWait(int sec)
	{
		 driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
	}



	
	public static void CheckEmpty(String attributename, String texts) {
		WebElement inputBox = driver.findElement(By.name(attributename));
		String textInsideInputBox = inputBox.getAttribute("value");

		// Check whether input field is blank
		if(textInsideInputBox.isEmpty())
		{
		   System.out.println("Input field is empty");
		   inputBox.sendKeys(texts);
		}
		
	}



	public static void ClickablebyXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	public static void ScrollDownintoView(String xpath)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath(xpath)));
	}
	
	public static void verifyTextPresent(String value)
	{
		 WebElement element = driver.findElement(By.cssSelector("body"));
		    boolean feedBack = driver.findElement(By.cssSelector("body")).getText().contains(value);
		    boolean feedbackVisible = element.isDisplayed();
		    if(feedBack==true){
		        System.out.println(value+ " is present");
		        if(feedbackVisible==true){
		            System.out.println(value+ " is visible");
		        }
		        else{
		            System.out.println(value+ " is not visible");
		        }
		        

		    }
		    else  {
		        System.out.println(value+ " is not present");

		    } 
	}
	
	public static boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
	
	
     public static void CheckifElementsSelected(String xpath)
     {
    	 boolean element=!driver.findElement(By.xpath(xpath)).isSelected();
    	 if(element==true) 
    	 {
    	   System.out.println("The element is selected");
    	 }
    	 else
    	 {
    		 System.out.println("The element is not selected");
    	 }
     }


	public static void CreatePrefilledFormCheck(String xpath) throws InterruptedException  {
		
		//driver.findElement(By.className("dashboard__right-caret")).click();
		
		//WebElement element= driver.findElement(By.xpath("//span[contains(text(),'Create from Prefilled Promotion')]"));

		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", element);
		//driver.findElement(By.id("dashboard__template-dropdown")).click();
		//driver.findElement(By.id("dashboard__template-dropdown")).click();
	
		//ClickablebyXpath("//span[contains(text(),'Reuse past promotion')]//preceding::span[@class='dashboard__right-caret'][1]");
		Thread.sleep(3000);
		ClickablebyXpath("//span[contains(text(),'Reuse past promotion')]//preceding::span[@class='dashboard__right-caret'][1]");
		System.out.println("The element has been clicked");
		driver.findElement(By.xpath(xpath)).click();
	}
	
	  
	public static void CheckifDropdownisSelected(String name,String ExpectedOption )
    {
		WebElement selectElement = driver.findElement(By.name(name));
		Select selectedValue = new Select(selectElement);
		String selectedText = selectedValue.getFirstSelectedOption().getText();
		System.out.println("The option selected is "+ selectedText);
	
		Assert.assertEquals(ExpectedOption, selectedText, "Expected Value not found");
		System.out.println(ExpectedOption.equals(selectedText));
		
    }
	
	public static void CheckInputinTextArea(String xpath,String DesiredText )
    {
		WebElement selectElement = driver.findElement(By.xpath(xpath));
		String Text=selectElement.getAttribute("value");
		System.out.println(Text);
		Assert.assertEquals(Text, DesiredText, "Expected Text not found");
		 System.out.println(Text.equals(DesiredText));
		
  }
	
	public static void CheckInputProvided(String xpath,String DesiredText )
    {
		WebElement selectElement = driver.findElement(By.xpath(xpath));
		String Text=selectElement.getText();
		System.out.println(Text);
		Assert.assertEquals(Text, DesiredText, "Expected Text not found");
		 System.out.println(Text.equals(DesiredText));
		
  }
	
	public static void DragandDrop(WebElement SourceElement,WebElement TargetElement)
	{
		ImplicitWait(30);
		Actions actions=new Actions(driver);
		
		actions.dragAndDrop(SourceElement,TargetElement).perform();
		
	}
	
	public static void simulateDragAndDrop(WebElement elementToDrag, WebElement target) throws Exception {
	     //WebDriver driver = getDriver();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("function createEvent(typeOfEvent) {\n" +
	                     "    var event = document.createEvent(\"CustomEvent\");\n" +
	                     "    event.initCustomEvent(typeOfEvent, true, true, null);\n" +
	                     "    event.dataTransfer = {\n" +
	                     "        data: {},\n" +
	                     "        setData: function (key, value) {\n" +
	                     "            this.data[key] = value;\n" +
	                     "        },\n" +
	                     "        getData: function (key) {\n" +
	                     "            return this.data[key];\n" +
	                     "        }\n" +
	                     "    };\n" +
	                     "    return event;\n" +
	                     "}\n" +
	                     "\n" +
	                     "function dispatchEvent(element, event, transferData) {\n" +
	                     "    if (transferData !== undefined) {\n" +
	                     "        event.dataTransfer = transferData;\n" +
	                     "    }\n" +
	                     "    if (element.dispatchEvent) {\n" +
	                     "        element.dispatchEvent(event);\n" +
	                     "    } else if (element.fireEvent) {\n" +
	                     "        element.fireEvent(\"on\" + event.type, event);\n" +
	                     "    }\n" +
	                     "}\n" +
	                     "\n" +
	                     "function simulateHTML5DragAndDrop(element, target) {\n" +
	                     "    var dragStartEvent = createEvent('dragstart');\n" +
	                     "    dispatchEvent(element, dragStartEvent);\n" +
	                     "    var dropEvent = createEvent('drop');\n" +
	                     "    dispatchEvent(target, dropEvent, dragStartEvent.dataTransfer);\n" +
	                     "    var dragEndEvent = createEvent('dragend');\n" +
	                     "    dispatchEvent(element, dragEndEvent, dropEvent.dataTransfer);\n" +
	                     "}\n" +
	                     "\n" +
	                     "var elementToDrag = arguments[0];\n" +
	                     "var target = arguments[1];\n" +
	                     "simulateHTML5DragAndDrop(elementToDrag, target);",
	             elementToDrag, target);
	 }
	

	/*@AfterClass(alwaysRun=true)
	public void tearDown(){
		driver.close();
		
	}*/


}
