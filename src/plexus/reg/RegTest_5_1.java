package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegTest_5_1 extends PlexusSharedFunctions {
  @Test
  public void RegTest5() throws InterruptedException {
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest5.5");
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
	  driver.findElement(By.linkText("AU 18+")).click();
	    
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
  }
  
  public void WhoCanEnter()
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
		

		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/footer/button");
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// driver.findElement(By.linkText("Last")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
  }
  
  public void HowtoEnter() throws InterruptedException
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[10]/div/div/div/label/div[2]/span");
	  Select oSelect = new Select(driver.findElement(By.name("scratchType")));
	  oSelect.selectByVisibleText("Game card");
	  Select oSelect1 = new Select(driver.findElement(By.name("scratchGameLocation")));
	  oSelect1.selectByVisibleText("From participating venues at the time of purchase");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section/div[1]/div/section/div[1]/div[2]", "Scratch and win");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section/div[1]/div/section/div[1]/div[3]", "Scratch game card");
	  PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 // driver.findElement(By.linkText("Skip")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.verifyTextPresent("Add Winning Method");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[3]/div[1]/div[5]/div/div/div/label/div[2]/span");
      Thread.sleep(20000);
      ScrollDownintoView(".//*[@id='winning-method-form']/main/section/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      Select oSelect2 = new Select(driver.findElement(By.name("iwWinDisplayType")));
	  oSelect2.selectByVisibleText("The winner will be notified as appropriate for the entry mechanic");
	  Select oSelect3 = new Select(driver.findElement(By.name("iwRedeemType")));
	  oSelect3.selectByVisibleText("Follow instructions provided");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	  
	  
  }
  
  public void HowtoAddPrize() throws InterruptedException
  {
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-1']/div/div[2]/button");
	 Thread.sleep(2000);
	// driver.findElement(By.linkText("Skip")).click();\
	 driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[1]/div/div/div/label/div[2]/span");
     driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("10");
     driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("100");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
     driver.findElement(By.name("description")).sendKeys("fan");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[1]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div/div[3]/div/div/div/label/div[2]/span");
     driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[1]/div/div/span[1]/input")).sendKeys("2");
     driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div/div/span[1]/div/input")).sendKeys("100");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
     Select oSelect = new Select(driver.findElement(By.name("paymentMethod")));
	  oSelect.selectByVisibleText("Cash");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/header/div[1]/h2", "Instant Win");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[2]","fan" );
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/div/div[2]/div[4]/section[2]/div[1]/section/div/div[2]", "$100 cash");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 
	 
  }
  
  public void NotificationandDelivery() 
  {
	
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");

     driver.findElement(By.name("iwUnclaimedEntryMethod")).sendKeys("Example");
     driver.findElement(By.name("unclaimedDrawVenue__streetLine1")).sendKeys("221BBakerStreet");
     driver.findElement(By.name("unclaimedDrawVenue__suburb")).sendKeys("Melbourne");
     driver.findElement(By.name("unclaimedDrawVenue__postcode")).sendKeys("3000");
     Select oSelect = new Select(driver.findElement(By.name("unclaimedDrawVenue__country")));
	  oSelect.selectByVisibleText("Australia");
	  Select oSelect1 = new Select(driver.findElement(By.name("unclaimedDrawVenue__state")));
	  oSelect1.selectByVisibleText("Queensland");
	  driver.findElement(By.name("unclaimedDrawDate")).sendKeys("02/02/19");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='delivery-methods']/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");

     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
     PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
      
}
  
  public void PermitsandPrivacy() throws InterruptedException 
  {
	 PlexusSharedFunctions.verifyTextPresent("Permits and Privacy");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "NSW and SA");
	 Select oSelect1 = new Select(driver.findElement(By.name("nswBlanketPermit__type")));
	 oSelect1.selectByVisibleText("No, single permit only");
	 driver.findElement(By.name("saDateRequired")).sendKeys("31/12/18");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='permits']/p/span[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='permits']/span/span[1]/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 Select oSelect2 = new Select(driver.findElement(By.name("contactPerson__title")));
	 oSelect2.selectByVisibleText("Ms");
	 driver.findElement(By.name("goodsOrServices")).sendKeys("Chocolate");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='permits']/span/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 driver.findElement(By.name("iwGameCardCount")).sendKeys("16");
	 driver.findElement(By.name("iwPrinter")).sendKeys("HP");
	 driver.findElement(By.name("iwPrinterAddress__streetLine1")).sendKeys("300MelonStreet");
     
     driver.findElement(By.name("iwPrinterAddress__suburb")).sendKeys("Melbourne");
     driver.findElement(By.name("iwPrinterAddress__postcode")).sendKeys("3000");
     Select oSelect = new Select(driver.findElement(By.name("iwPrinterAddress__country")));
	  oSelect.selectByVisibleText("Australia");
	  Select oSelect3 = new Select(driver.findElement(By.name("iwPrinterAddress__state")));
	  oSelect3.selectByVisibleText("Queensland");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='permits']/span/span[4]/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[3]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/span/div/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[4]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath("//*[@id='privacy-declarations']/div[1]/div/span[1]/div/input")).sendKeys("www.usertesting.com/privacy");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button[1]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 Thread.sleep(4000);
	 PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath("html/body/div[3]/div/div[2]/div/div/span/div[2]/button[1]");
	  Thread.sleep(2000);
     System.out.println("The Promotion has been created sucessfully");
      
	  
}
}
