package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegTest_3 extends PlexusSharedFunctions {
  @Test
  public void RegTest3() throws InterruptedException {
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest3");
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
	  driver.findElement(By.linkText("NZ 18+")).click();
	    
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
  }
  
  public void WhoCanEnter()
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[4]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("entryLimits__number__0")).sendKeys("1");
	  Select oSelect = new Select(driver.findElement(By.name("entryLimits__type__0")));
	     oSelect.selectByVisibleText("per day");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/footer/button");
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//  driver.findElement(By.linkText("Last")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
  }
  
  public void HowtoEnter() throws InterruptedException
  {
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[1]/div[1]/div[1]/div/div/div/div/label/div[1]/div[2]");
	  Select oSelect2 = new Select(driver.findElement(By.name("purchaseRequirement")));
	  oSelect2.selectByVisibleText("Buy a certain number of these products or services");
	  driver.findElement(By.name("products__name__0")).sendKeys("Jack Daniel's drink");
	  Select oSelect = new Select(driver.findElement(By.name("purchaseTransactionType")));
	  oSelect.selectByVisibleText("One transaction");
	  Select oSelect1 = new Select(driver.findElement(By.name("purchaseLocations")));
	  oSelect1.selectByVisibleText("Any stores displaying promotional material (including online)");
	  Select oSelect3 = new Select(driver.findElement(By.name("purchaseAlcohol")));
	  oSelect3.selectByVisibleText("Yes, for on-premises consumption");
	  driver.findElement(By.name("purchaseStandardDrinkCount")).sendKeys("3");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[3]/div/div/div/label/div[2]/span");
	  Select oSelect4 = new Select(driver.findElement(By.name("goPath")));
	  oSelect4.selectByVisibleText("At a specific URL");
	  driver.findElement(By.name("goUrl")).sendKeys("jackdaniels.com");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[3]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[5]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[3]/div/div[1]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[3]/div/div[2]/div[1]/div[1]/div/div/div/label/div/div[2]");
	  Select oSelect5 = new Select(driver.findElement(By.name("goMultipleEntry")));
	  oSelect5.selectByVisibleText("Yes");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
	  PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	//  driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[3]/div[1]/div[5]/div/div/div/label/div[2]/span");
	  PlexusSharedFunctions.verifyTextPresent("Unfortunately, online instant win mechanics are not permitted in New Zealand. You will need to choose another winning method, e.g. a draw, or remove the Go Online or Connect on Social Media entry step.");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[3]/div/div[1]/div/div/div/label/div[2]/span");
	  Thread.sleep(2000);
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[8]/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  Select oSelect6 = new Select(driver.findElement(By.name("drawType")));
	  oSelect6.selectByVisibleText("Computerised random selection");
      driver.findElement(By.name("drawDate")).clear();
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
	  
  }
  
  public void HowtoAddPrize() throws InterruptedException
  {
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-1']/div/div[2]/button");
	  PlexusSharedFunctions.verifyTextPresent("Add Prize");
	//  driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[8]/div[1]/div[6]/div/div/div/label/div[2]/span");
	  PlexusSharedFunctions.verifyTextPresent("Alcohol prizes are not permitted in New Zealand for a draw or instant win promotion.");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[8]/div[1]/div[3]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[10]/span[1]/div/div/span[1]/input")).sendKeys("2");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[10]/span[2]/div/div/span[1]/div/input")).sendKeys("5000");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[10]/span[2]/div[1]/label/span[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[10]/span[2]/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[10]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("paymentMethod")));
	  oSelect.selectByVisibleText("Cash");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  Thread.sleep(4000);
	  PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[4]/div[1]/div[3]/div/div/div/label/div[2]/span");
	  Thread.sleep(3000);
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[7]/div[1]/div[1]/div/span[1]/select");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[7]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
	  Select oSelect1 = new Select(driver.findElement(By.name("gwpType")));
  	  oSelect1.selectByVisibleText("Already covered by entry mechanic");
  	  Select oSelect2 = new Select(driver.findElement(By.name("gwpGiftsLimited")));
	  oSelect2.selectByVisibleText("Unlimited gifts available during promotional period");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-2']/div/div[2]/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[8]/div[1]/div[6]/div/div/div/label/div[2]/span");
		 PlexusSharedFunctions.verifyTextPresent("As you are giving away alcohol prize, all individual entrant groups will be restricted to adults only (if they are not already).");
		 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[9]/span/div/div/span[1]/div/input")).sendKeys("30");

		
		 driver.findElement(By.name("alcoholName")).sendKeys("Marlborough Dream savigoun blanc");
		 Select oSelect3 = new Select(driver.findElement(By.name("alcoholContainerType")));
		 oSelect3.selectByVisibleText("Bottle");
		 driver.findElement(By.name("alcoholContainerCount")).clear();
		 driver.findElement(By.name("alcoholContainerCount")).sendKeys("2");
		 driver.findElement(By.name("alcoholContainerVolume")).sendKeys("750");
		// driver.findElement(By.name("alcoholContent")).sendKeys("11");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
		 Thread.sleep(4000);
		  PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div/button");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/button");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[5]/div[1]/div[2]/div/div/div/label/div[2]/span");
		 Thread.sleep(3000);
		 PlexusSharedFunctions.ClickablebyXpath("//*[@id='winning-method-form']/main/div[9]/div[1]/div[1]/div/span[1]/select");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[9]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
		 Select oSelect4 = new Select(driver.findElement(By.name("judges")));
	     oSelect4.selectByVisibleText("Representatives of the Promoter");
	     Select oSelect5 = new Select(driver.findElement(By.name("criteria")));
	     oSelect5.selectByVisibleText("Originality");
	     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-3']/div/div[2]/button");
	     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[8]/div[1]/div[6]/div/div/div/label/div[2]/span");
		 PlexusSharedFunctions.verifyTextPresent("As you are giving away alcohol prize, all individual entrant groups will be restricted to adults only (if they are not already).");
		 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[9]/span[1]/div/div/span[1]/input")).sendKeys("4");
		 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[9]/span[2]/div/div/span[1]/div/input")).sendKeys("20");

		
		 driver.findElement(By.name("alcoholName")).sendKeys("Marlborough Dream savigoun blanc");
		 Select oSelect6 = new Select(driver.findElement(By.name("alcoholContainerType")));
		 oSelect6.selectByVisibleText("Bottle");
		 driver.findElement(By.name("alcoholContainerCount")).clear();
		 driver.findElement(By.name("alcoholContainerCount")).sendKeys("2");
		 driver.findElement(By.name("alcoholContainerVolume")).sendKeys("750");
	
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[1]");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[8]/div[1]/div[6]/div/div/div/label/div[2]/span");
		 PlexusSharedFunctions.verifyTextPresent("As you are giving away alcohol prize, all individual entrant groups will be restricted to adults only (if they are not already).");
		 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[9]/span[1]/div/div/span[1]/input")).sendKeys("6");
		 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[9]/span[2]/div/div/span[1]/div/input")).sendKeys("12");
         driver.findElement(By.name("alcoholName")).sendKeys("bhresih");
		 Select oSelect7 = new Select(driver.findElement(By.name("alcoholContainerType")));
		 oSelect7.selectByVisibleText("Bottle");
			 driver.findElement(By.name("alcoholContainerCount")).clear();
			 driver.findElement(By.name("alcoholContainerCount")).sendKeys("1");
			 driver.findElement(By.name("alcoholContainerVolume")).sendKeys("56");
		
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
			 Thread.sleep(4000);
			  PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div/button");
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/button");
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[6]/div[1]/div[4]/div/div/div/label/div[2]/span");
			 Thread.sleep(3000);
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[9]/div[1]/div[1]/div/span[1]/select");
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[9]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
			 Select oSelect8 = new Select(driver.findElement(By.name("gwpType")));
			 oSelect8.selectByVisibleText("Already covered by entry mechanic");
			 Select oSelect9 = new Select(driver.findElement(By.name("gwpGiftsLimited")));
			 oSelect9.selectByVisibleText("Unlimited gifts available during promotional period");
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-4']/div/div[2]/button");
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[8]/div[1]/div[6]/div/div/div/label/div[2]/span");
			 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[9]/span/div/div/span[1]/div/input")).sendKeys("20");

				
			 driver.findElement(By.name("alcoholName")).sendKeys("Marlborough Dream savigoun blanc");
			 Select oSelect10 = new Select(driver.findElement(By.name("alcoholContainerType")));
			 oSelect10.selectByVisibleText("Bottle");
			 driver.findElement(By.name("alcoholContainerCount")).clear();
			 driver.findElement(By.name("alcoholContainerCount")).sendKeys("12");
			 driver.findElement(By.name("alcoholContainerVolume")).sendKeys("750");
			// driver.findElement(By.name("alcoholContent")).sendKeys("11");
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
			 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
			  
			 
  
  
  }
  
  public void NotificationandDelivery() 
  {
	
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div[1]/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='notifications']/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
      
}
  
  public void PermitsandPrivacy() throws InterruptedException 
  {
	 PlexusSharedFunctions.verifyTextPresent("Permits and Privacy");
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
