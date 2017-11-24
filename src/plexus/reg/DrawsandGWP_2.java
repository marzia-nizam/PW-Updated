package plexus.reg;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;









public class DrawsandGWP_2 extends PlexusSharedFunctions {
  @Test
  public void DrawsandGWP2() throws InterruptedException, AWTException {
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest1.2");
	  PlexusSharedFunctions.CheckPromoterInformation();
      AdvertisingMethods();
      EntrantGroups();
      WhoCanEnter();
      HowtoEnter();
      HowtoAddPrize();
      NotificationandDelivery();
      PermitsandPrivacy();
  }
  
 
 
  public void AdvertisingMethods()
  {
	  
	  PlexusSharedFunctions.verifyTextPresent("ADVERTISING METHODS");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[2]/div/div[1]/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("socialMedia__site__0")));
      oSelect.selectByVisibleText("Facebook");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[2]/div/div[2]/button");
	  Select oSelect1 = new Select(driver.findElement(By.name("socialMedia__site__1")));
      oSelect1.selectByVisibleText("Twitter");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[2]/div/div[2]/button");
	  
	  Select oSelect2 = new Select(driver.findElement(By.name("socialMedia__site__2")));

	  oSelect2.selectByVisibleText("Instagram");
	  driver.findElement(By.name("period__startDate")).sendKeys("01/01/17");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='period']/div/div[1]/span[1]");
	  PlexusSharedFunctions.ImplicitWait(10);
	     
	  	boolean element=driver.findElement(By.xpath("//span[contains(text(),'Start date must be after today')]")).isDisplayed();
	  		
	  		if(element==true)
	  		{
	  			 driver.findElement(By.name("period__startDate")).clear();
	  			driver.findElement(By.name("period__startDate")).sendKeys(start_date);
	  			driver.findElement(By.xpath("//span[contains(text(),'When will you advertise your promotion?')]")).click();
	  		}
	  		else
	  		{
	  			System.out.println("The element is not visible");
	  		}
	  		
	 
	  driver.findElement(By.name("period__endDate")).clear();
	  driver.findElement(By.name("period__endDate")).sendKeys("01/04/18");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='extra-services']/div/div[1]/div[3]/div/div[1]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
  
  }
  
  public void EntrantGroups()
  {

	  PlexusSharedFunctions.verifyTextPresent("Entrant Groups");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.linkText("AU 18+"));
	  driver.findElement(By.xpath(".//*[@id='entrant-group-form']/main/span/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]")).click();
	  driver.findElement(By.xpath(".//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
  
  }
  
  public void WhoCanEnter()
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[4]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("entryLimits__number__0")).sendKeys("1");
	  Select oSelect = new Select(driver.findElement(By.name("entryLimits__type__0")));
	  oSelect.selectByVisibleText("per person");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/footer/button");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//  driver.findElement(By.linkText("Last")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
  
  }
  
  public void HowtoEnter() throws AWTException, InterruptedException
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[2]/div/div/div/label/div[2]/span");
     
      Select oSelect = new Select(driver.findElement(By.name("platform")));
      oSelect.selectByVisibleText("Facebook");
      driver.findElement(By.name("socialUrl")).clear();
      driver.findElement(By.name("socialUrl")).sendKeys("www.facebook.com/"+PromotionName+"promotion");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[2]/div/div/div/label/div[2]/span");
      Select oSelect1 = new Select(driver.findElement(By.name("platform")));
      oSelect1.selectByVisibleText("Twitter");
      driver.findElement(By.name("socialUrl")).clear();
      driver.findElement(By.name("socialUrl")).sendKeys("www.twitter.com/"+PromotionName+"promotion");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[7]/div/div[1]/div/div/div/label/div/div[2]");
      driver.findElement(By.name("actionOther")).clear();
      driver.findElement(By.name("actionOther")).sendKeys("tweet the promotional link");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='entry-step-form']/main/div[3]/div[1]/div[2]/div/div/div/label/div[2]/span");
      Select oSelect2 = new Select(driver.findElement(By.name("platform")));
      oSelect2.selectByVisibleText("Instagram");
      driver.findElement(By.name("socialUrl")).clear();
      driver.findElement(By.name("socialUrl")).sendKeys("www.instagram.com/"+PromotionName+"promotion");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[7]/div/div[1]/div/div/div/label/div/div[2]");
      driver.findElement(By.name("actionOther")).clear();
      driver.findElement(By.name("actionOther")).sendKeys("regram the promotional picture from @brand");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[3]/div[1]/div[7]/div/div/div/label/div[2]/span");
      driver.findElement(By.name("sEmailAddress")).sendKeys("tasnuvadisha@gmail.com");
      driver.findElement(By.name("sEmailSubject")).sendKeys(PromotionName+" promotion");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[3]/div/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[3]/div/div[2]/div[1]/div[1]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[3]/div/div[8]/div/div/div/label/div[2]/span");
      driver.findElement(By.name("smsPhoneNumber")).sendKeys("0491 570 156");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[2]/div[1]/div[3]/div/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[2]/div[1]/div[3]/div/div[2]/div[1]/div[1]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
     // WebElement Step1 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div/section/div[2]/span"));
    //  WebElement Step2 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section/div[2]/span"));
    //  Point toLocation = Step1.getLocation();
   //   Point fromLocation = Step2.getLocation();
   //   System.out.println(fromLocation.toString());
   //   System.out.println(toLocation.toString());
      WebElement Step1 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section"));
      WebElement Step2 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div/section"));
      try{
          simulateDragAndDrop(Step1, Step2);
         }catch(Exception e){
          e.printStackTrace();
         }
      
      WebElement Step3 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section"));
      WebElement Step4 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div[2]/section"));
      try{
          simulateDragAndDrop(Step3, Step4);
         }catch(Exception e){
          e.printStackTrace();
         }
      WebElement Step5 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[3]/div[1]/div/section"));
      WebElement Step6 = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section"));
      
      try{
          simulateDragAndDrop(Step5, Step6);
         }catch(Exception e){
          e.printStackTrace();
         }
    
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[3]/span");
    //  driver.findElement(By.linkText("Skip")).click();
      driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[3]/div[1]/div[3]/div/div/div/label/div[2]/span");
      Select oSelect3 = new Select(driver.findElement(By.name("gwpType")));
      oSelect3.selectByVisibleText("Already covered by entry mechanic");
      Select oSelect4 = new Select(driver.findElement(By.name("gwpGiftsLimited")));
      oSelect4.selectByVisibleText("Unlimited gifts available during promotional period");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
      
 /**************Methods Used to try the drag and drop***********/     
      
      
	/*  Actions act=new Actions(driver);
	  act.dragAndDrop(Step1, Step2).build().perform();
	  
	  Actions builder = new Actions(driver);
	PlexusSharedFunctions.ImplicitWait(30);
	

	      Action dragAndDrop = builder.clickAndHold(Step1).moveToElement(Step2).release(Step2).build();
	      
	      try{
	  		Thread.sleep(3500);
	  	}catch(Exception e){
	  		
	  	}
	      dragAndDrop.perform();
	      
	      try{
		  		Thread.sleep(3500);
		  	}catch(Exception e){
		  		
		  	}*/
	      
	      /////////////////////////////// Drag and Drop uing Robot class //////////////////////////////////
	      
	
/*	try{
		// Setup robot
        Robot robot = new Robot();
        robot.setAutoDelay(500);

       // Fullscreen page so selenium coordinates work
        robot.keyPress(KeyEvent.VK_F11);
        robot.mouseMove(200, 200);
        robot.mousePress(InputEvent.BUTTON1_MASK);


        // Get size of elements
        Dimension fromSize = Step2.getSize();
        Dimension toSize = Step1.getSize();

        //Get centre distance
        int xCentreFrom = fromSize.width / 2;
        int yCentreFrom = fromSize.height / 2;
        int xCentreTo = toSize.width / 2;
        int yCentreTo = toSize.height / 2;

        Point toLocation = Step1.getLocation();
        Point fromLocation = Step2.getLocation();
        System.out.println(fromLocation.toString());

        //Make Mouse coordinate centre of element
        toLocation.x += 0 + xCentreTo;
        toLocation.y += 90 + yCentreTo;
        fromLocation.x += 0 + xCentreFrom;
        fromLocation.y += 90 + yCentreFrom;

        System.out.println(fromLocation.toString());

        //Move mouse to drag from location
        robot.mouseMove(fromLocation.x, fromLocation.y);
        //robot.mouseMove(175,250);

//        Thread.sleep(1000);
        //Click and drag
        robot.mousePress(InputEvent.BUTTON1_MASK);

        //robot.mousePress(InputEvent.
        //Drag events require more than one movement to register
        //Just appearing at destination doesn't work so move halfway first
        robot.mouseMove(((toLocation.x - fromLocation.x) / 2) + fromLocation.x, ((toLocation.y - fromLocation.y) / 2) + fromLocation.y);

        //Move to final position
        robot.mouseMove(toLocation.x, toLocation.y);
        //robot.mouseMove(175,200);

        //Drop
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}catch(Exception e){
		
	}*/
	
	/*WebElement Step3=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section/div[2]/span"));
	WebElement Step4=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[3]/div[1]/div/section/div[2]/span"));
	      
	try{
		// Setup robot
        Robot robot = new Robot();
        robot.setAutoDelay(500);

        //Fullscreen page so selenium coordinates work
      //  robot.keyPress(KeyEvent.VK_F11);
       // robot.mouseMove(200, 200);
       // robot.mousePress(InputEvent.BUTTON1_MASK);


        // Get size of elements
        Dimension fromSize = Step4.getSize();
        Dimension toSize = Step3.getSize();

        //Get centre distance
        int xCentreFrom = fromSize.width / 2;
        int yCentreFrom = fromSize.height / 2;
        int xCentreTo = toSize.width / 2;
        int yCentreTo = toSize.height / 2;

        Point toLocation = Step3.getLocation();
        Point fromLocation = Step4.getLocation();
        System.out.println(fromLocation.toString());

        //Make Mouse coordinate centre of element
        toLocation.x += 0 + xCentreTo;
        toLocation.y += 90 + yCentreTo;
        fromLocation.x += 0 + xCentreFrom;
        fromLocation.y += 90 + yCentreFrom;

        System.out.println(fromLocation.toString());

        //Move mouse to drag from location
        robot.mouseMove(fromLocation.x, fromLocation.y);
        //robot.mouseMove(175,250);

//        Thread.sleep(1000);
        //Click and drag
        robot.mousePress(InputEvent.BUTTON1_MASK);

        //robot.mousePress(InputEvent.
        //Drag events require more than one movement to register
        //Just appearing at destination doesn't work so move halfway first
        robot.mouseMove(((toLocation.x - fromLocation.x) / 2) + fromLocation.x, ((toLocation.y - fromLocation.y) / 2) + fromLocation.y);

        //Move to final position
        robot.mouseMove(toLocation.x, toLocation.y);

        //robot.mouseMove(175,200);

        //Drop
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}catch(Exception e){
		
	}*/     

      /**************Methods Used to try the drag and drop***********/    
      
  }
  
  public void HowtoAddPrize() throws InterruptedException
  {
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-1']/div/div[2]/button");
	 // driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.verifyTextPresent("Add Prize");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span/div/div/span[1]/div/input")).sendKeys("10");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("description")).sendKeys("Stickers");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='add-another-prize']");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[14]/div/div/div/label/div[2]/span");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span/div/div/span[1]/div/input")).sendKeys("10");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
      driver.findElement(By.name("otherPrizeDescription")).sendKeys("MP3");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  Thread.sleep(4000);
	  PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[4]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[8]/div[1]/div[1]/div/span[1]/select");
	  Thread.sleep(2000);
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[8]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[7]/label/span[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[9]/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-2']/div/div[2]/button");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[8]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("10");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("100");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("expType")));
      oSelect.selectByVisibleText("Dining");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[2]/div/span[1]/input")).sendKeys("3");
      Select oSelect1 = new Select(driver.findElement(By.name("expMeal")));
      oSelect1.selectByVisibleText("Winner's choice of meals");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[5]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[6]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      driver.findElement(By.name("expLocation")).sendKeys("BFC");
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[8]/div[2]/div[1]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      driver.findElement(By.linkText("Date of purchase")).click();
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[8]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='add-another-prize']");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[11]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("10");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("100");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[1]/div/span[1]/input")).sendKeys("10");
	  Select oSelect2 = new Select(driver.findElement(By.name("ffProgram")));
      oSelect2.selectByVisibleText("Qantas Frequent Flyer");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
  
  }
 
  public void NotificationandDelivery() 
  {
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='notifications']/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[2]/div/div[1]/div/div/div/label/div/div[2]");
	 driver.findElement(By.name("pubUrl")).sendKeys("www.google.com");
	 driver.findElement(By.name("daysTilPublication")).clear();
	  driver.findElement(By.name("daysTilPublication")).sendKeys("7");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
     driver.findElement(By.xpath(".//*[@id='delivery-methods']/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]")).click();
      Select oSelect = new Select(driver.findElement(By.name("deliveryMethods__type__0")));
      oSelect.selectByVisibleText("Delivered by email");
      driver.findElement(By.xpath(".//*[@id='delivery-methods']/div[2]/div[1]/div/div/div[3]/div[1]/div[1]/div/span[1]/select")).click();
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='delivery-methods']/div[2]/div[1]/div/div/div[3]/div[1]/div[2]/div/div/div[6]/div/div/div/div/div/label/span[1]");
      Select oSelect2 = new Select(driver.findElement(By.name("deliveryMethods__dateType__0")));
      oSelect2.selectByVisibleText("No");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='delivery-methods']/div[2]/div[3]/button");
      Select oSelect1 = new Select(driver.findElement(By.name("deliveryMethods__type__1")));
      oSelect1.selectByVisibleText("Delivered by mail");
      driver.findElement(By.xpath(".//*[@id='delivery-methods']/div[2]/div[1]/div[2]/div/div[3]/div[1]/div[1]/div/span[1]/select")).click();
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='delivery-methods']/div[2]/div[1]/div[2]/div/div[3]/div[1]/div[2]/div/div/div[3]/div/div/div/div/div/label/div/div[2]");
      Select oSelect3 = new Select(driver.findElement(By.name("deliveryMethods__dateType__1")));
      oSelect3.selectByVisibleText("No");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
      
      
      
 }
  
  public void PermitsandPrivacy() throws InterruptedException 
  {
	 PlexusSharedFunctions.verifyTextPresent("Permits and Privacy");
	 Select oSelect = new Select(driver.findElement(By.name("nswBlanketPermit__type")));
     oSelect.selectByVisibleText("No, single permit only");
     Select oSelect1 = new Select(driver.findElement(By.name("contactPerson__title")));
     oSelect1.selectByVisibleText("Ms");
     driver.findElement(By.name("contactPerson__firstName")).clear();
	 driver.findElement(By.name("contactPerson__firstName")).sendKeys("Tasnuva");
	 driver.findElement(By.name("contactPerson__lastName")).clear();
	 driver.findElement(By.name("contactPerson__lastName")).sendKeys("Disha");
	 driver.findElement(By.name("contactPerson__email")).clear();
	 driver.findElement(By.name("contactPerson__email")).sendKeys("tasnuvadisha@gmail.com");
	 driver.findElement(By.name("contactPerson__phone")).clear();
	 driver.findElement(By.name("contactPerson__phone")).sendKeys("0491 570 156");
	 driver.findElement(By.name("goodsOrServices")).sendKeys("ball pen");
	 driver.findElement(By.xpath("//*[@id='privacy-declarations']/div[1]/div/span[1]/div/input")).sendKeys("www.usertesting.com/privacy");
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[3]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/span/div/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[4]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button[1]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 Thread.sleep(4000);
	 PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath("html/body/div[3]/div/div[2]/div/div/span/div[2]/button[1]");
	  Thread.sleep(2000);
     System.out.println("The Promotion has been created sucessfully");
      
	  
}

 
}
