package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;







public class DrawsandGWP_1 extends PlexusSharedFunctions {
  @Test
  public void DrawsandGWP1() throws InterruptedException {
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest1.1");
	  PlexusSharedFunctions.CheckPromoterInformation();
	  AdvertisingMethods();
	  EntrantGroups();
	  WhoCanEnter();
	  HowtoEnter();
	  HowtoAddPrize();
	  NotificationandDelivery();
	  PermitsandPrivacy() ;
	  
  }
  
  public void AdvertisingMethods()
  {
	  
	  PlexusSharedFunctions.verifyTextPresent("ADVERTISING METHODS");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[2]/div/div[1]/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("socialMedia__site__0")));
      oSelect.selectByVisibleText("Facebook");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[3]/div/div[1]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[4]/div/div[1]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[5]/div/div[1]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[6]/div/div[1]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[7]/div/div[1]/div/div/div/label/div/div[2]");
      driver.findElement(By.name("other")).sendKeys("NGO");
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
	  PlexusSharedFunctions.verifyTextPresent("Entrant Groups");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 // driver.findElement(By.linkText("AU 18+")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	 // driver.findElement(By.linkText("NZ 18+")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
	
  }
  
  public void WhoCanEnter()
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[2]/div[1]/div[1]/div/span[1]/select");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/label/span[1]");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[4]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
		 driver.findElement(By.name("entryLimits__number__0")).sendKeys("1");
		 Select oSelect = new Select(driver.findElement(By.name("entryLimits__type__0")));
	     oSelect.selectByVisibleText("per purchase");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/footer/button");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.linkText("Last")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
  
  }
  
  public void HowtoEnter()
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[1]/div[1]/div[1]/div/div/div/div/label/div[1]/div[2]");
	  Select oSelect2 = new Select(driver.findElement(By.name("purchaseRequirement")));
	  oSelect2.selectByVisibleText("Buy a certain number of these products or services");
	  driver.findElement(By.name("products__name__0")).sendKeys("Samsung Galaxy Phone");
	  Select oSelect = new Select(driver.findElement(By.name("purchaseTransactionType")));
	  oSelect.selectByVisibleText("One transaction");
	  Select oSelect1 = new Select(driver.findElement(By.name("purchaseLocations")));
	  oSelect1.selectByVisibleText("Any stores displaying promotional material (including online)");
	  Select oSelect3 = new Select(driver.findElement(By.name("purchaseAlcohol")));
	  oSelect3.selectByVisibleText("No, it does not involve the purchase of alcohol");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[3]/div/div/div/label/div[2]/span");
	  Select oSelect4 = new Select(driver.findElement(By.name("goPath")));
	  oSelect4.selectByVisibleText("At a specific URL");
	  driver.findElement(By.name("goUrl")).sendKeys("www.promo.com");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  Select oSelect5 = new Select(driver.findElement(By.name("goGameType")));
	  oSelect5.selectByVisibleText("Spin the wheel");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[1]/div/div[2]/div[1]/div[3]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[1]/div/div[2]/div[1]/div[5]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[1]/div/div[2]/div[1]/div[8]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div/section/div[1]/div[2]", "Purchase Product");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section/div[1]/div[2]", "Go Online");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div/section/div[1]/div[3]", "Samsung Galaxy Phone");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section/div[1]/div[3]", "Play the online game");
	  PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	//  driver.findElement(By.linkText("Last")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[3]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  driver.findElement(By.name("title")).clear();
	  driver.findElement(By.name("title")).sendKeys("Repeated Draw");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[8]/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[8]/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("drawDate")).clear();
      driver.findElement(By.name("drawDate")).sendKeys("05/01/18");
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='winning-method-form']/main/div[8]/div[4]/span[1]");
      PlexusSharedFunctions.ImplicitWait(10);
     
  	boolean element=driver.findElement(By.xpath("//span[contains(text(),'The draw date has to be on or after the earliest entry date ("+start_date+" 09:00 am).')]")).isDisplayed();
  		
  		if(element==true)
  		{
  			 driver.findElement(By.name("drawDate")).clear();
  			driver.findElement(By.name("drawDate")).sendKeys("14/04/18");
  			 PlexusSharedFunctions.ClickablebyXpath("//*[@id='winning-method-form']/main/div[8]/div[4]/span[1]");
  			
  		}
  		else
  		{
  			System.out.println("The element is not visible");
  		}
  		Select oSelect6 = new Select(driver.findElement(By.name("drawFrequency")));
  	  oSelect6.selectByVisibleText("Daily");
  	  driver.findElement(By.name("drawNumberRepetitions")).sendKeys("10");
  	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[8]/div[7]/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
  	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
  }
  
  public void HowtoAddPrize() throws InterruptedException
  {

	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-1']/div/div[2]/button");
	  PlexusSharedFunctions.verifyTextPresent("Add Prize");
	  //driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[36]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[37]/span[1]/div[1]/div/span[1]/input")).sendKeys("10");

	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[37]/span[1]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	  driver.findElement(By.linkText("Clear")).click();
	  driver.findElement(By.linkText("Auto assign")).click();
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[37]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("20");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[37]/span[2]/div[2]/div/span[1]/div/input")).sendKeys("20");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[37]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("description")).sendKeys("Bluetooth");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='add-another-prize']");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[36]/div[1]/div[2]/div/div/div/label/div[2]/span");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[37]/span[1]/div[1]/div/span[1]/input")).sendKeys("10");
      driver.findElement(By.linkText("Clear")).click();
	  driver.findElement(By.linkText("Auto assign")).click();
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[37]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("30");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[37]/span[2]/div[2]/div/span[1]/div/input")).sendKeys("30");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[37]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[37]/fieldset/section/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[37]/fieldset/section/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[37]/fieldset/section/div[5]/div[2]/div[1]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("voucherValidPeriod__startEvent")).sendKeys("28/05/18");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[37]/fieldset/section/div[5]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  Thread.sleep(4000);
	  PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div/button");
	 
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[4]/div[1]/div[3]/div/div/div/label/div[2]/span");
	  Thread.sleep(3000);
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[7]/div[1]/div[1]/div/span[1]/select");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[7]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
	  Select oSelect = new Select(driver.findElement(By.name("gwpType")));
  	  oSelect.selectByVisibleText("Already covered by entry mechanic");
  	  Select oSelect1 = new Select(driver.findElement(By.name("gwpGiftsLimited")));
	  oSelect1.selectByVisibleText("Unlimited gifts available during promotional period");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-2']/div/div[2]/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div[1]/div[4]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span/div[1]/div/span[1]/div/input")).sendKeys("50");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span/div[2]/div/span[1]/div/input")).sendKeys("50");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("tickNumberAdult")).sendKeys("3");
	  driver.findElement(By.name("tickNumberChild")).sendKeys("2");
	  driver.findElement(By.name("tickEvent")).sendKeys("car show");
	  driver.findElement(By.name("tickVenue")).sendKeys("Lovely Tower");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div[5]/div[2]/div[1]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("tickTimePeriod__startEvent")).sendKeys("01/05/18");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div[5]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  Thread.sleep(4000);
	  PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[5]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  driver.findElement(By.name("title")).clear();
	  driver.findElement(By.name("title")).sendKeys("Grand Prize Draw");
	  Thread.sleep(3000);
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[9]/div[1]/div[1]/div/span[1]/select");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[9]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[10]/div[2]/span/span[1]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[10]/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
     driver.findElement(By.name("drawDate")).sendKeys("05/01/18");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='draw-date']");
     PlexusSharedFunctions.ImplicitWait(10);
    
 	boolean element=driver.findElement(By.xpath("//span[contains(text(),'The draw date has to be on or after the earliest entry date ("+start_date+" 09:00 am).')]")).isDisplayed();
 		
 		if(element==true)
 		{
 			 driver.findElement(By.name("drawDate")).clear();
 			driver.findElement(By.name("drawDate")).sendKeys("14/04/18");
 			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='draw-date']");
 			
 		}
 		else
 		{
 			System.out.println("The element is not visible");
 		}
 		PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
        PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-3']/div/div[2]/button");
        PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div[1]/div[10]/div/div/div/label/div[2]/span");
        driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[1]/div/div/span[1]/input")).sendKeys("5");
        driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("50");
        driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div[2]/div/span[1]/div/input")).sendKeys("50");
        PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
        driver.findElement(By.name("jewelType")).sendKeys("chain");
        PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
        PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div[3]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
        Select oSelect2 = new Select(driver.findElement(By.name("jewelValuation")));
  	  oSelect2.selectByVisibleText("No, there is a recommended retail price for this jewellery");
  	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
  	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/header/div[1]/h2", "Repeated Draw");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[2]", "Bluetooth");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/div/div[2]/div[4]/section[2]/div[1]/section/div/div[2]", "$30 voucher");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-2']/header/div[1]/h2", "Gift with Purchase");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-2']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[2]", "3 adult tickets and 2 child tickets to car show at Lovely Tower within 12 months from the 01/05/18");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-3']/header/div[1]/h2", "Grand Prize Draw");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-3']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[2]", "chain");
  	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
}
  
  public void NotificationandDelivery() 
  {
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div[1]/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div[1]/div[1]/div[2]/div/div[1]/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[2]/div/div[1]/div/div/div/label/div/div[2]");
	 driver.findElement(By.name("daysTilPublication")).clear();
	  driver.findElement(By.name("daysTilPublication")).sendKeys("7");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='unclaimed-prizes']/span/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
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
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[3]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/span/div/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[4]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath("//*[@id='privacy-declarations']/div[1]/div/span[1]/div/input")).sendKeys("www.usertesting.com/privacy");
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
