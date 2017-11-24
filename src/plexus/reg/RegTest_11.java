package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegTest_11 extends PlexusSharedFunctions {
  @Test
  public void RegTest11() throws InterruptedException {
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest11");
	  PlexusSharedFunctions.CheckPromoterInformation();
	  AdvertisingMethods();
	  EntrantGroups();
	  WhoCanEnter();
	  HowtoEnter();
	  HowtoAddPrize();
	  NotificationandDelivery() ;
	  PermitsandPrivacy() ;
  }
  
  public void AdvertisingMethods()
  {
	  
	  PlexusSharedFunctions.verifyTextPresent("ADVERTISING METHODS");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[4]/div/div[1]/div/div/div/label/div/div[2]");
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/footer/button");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//  driver.findElement(By.linkText("Last")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
  
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
      PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 // driver.findElement(By.linkText("Last")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[3]/div[1]/div[3]/div/div/div/label/div[2]/span");
	  Select oSelect4 = new Select(driver.findElement(By.name("gwpType")));
  	  oSelect4.selectByVisibleText("Already covered by entry mechanic");
  	  Select oSelect5 = new Select(driver.findElement(By.name("gwpGiftsLimited")));
	  oSelect5.selectByVisibleText("Number of gifts is limited and promotion runs while stocks last");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[3]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("gwpProcessingFee")).sendKeys("100");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	  
   }
  
  
  public void HowtoAddPrize() throws InterruptedException
  {
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-1']/div/div[2]/button");
	  PlexusSharedFunctions.verifyTextPresent("Add Prize");
	 // driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[8]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  PlexusSharedFunctions.verifyTextPresent("How many winners will win one of these gifts?");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[9]/span[1]/div/div/span[1]/input")).sendKeys("2");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[9]/span[2]/div/div/span[1]/div/input")).sendKeys("100");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[9]/span[3]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      driver.findElement(By.name("description")).sendKeys("Sticker");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
      PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/button");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/button");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[4]/div[1]/div[3]/div/div/div/label/div[2]/span");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[7]/div[1]/div[1]/div/span[1]/select");
      Thread.sleep(3000);
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[7]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[6]/label/span[1]");
      Select oSelect = new Select(driver.findElement(By.name("gwpType")));
      oSelect.selectByVisibleText("Already covered by entry mechanic");
      Select oSelect1 = new Select(driver.findElement(By.name("gwpGiftsLimited")));
      oSelect1.selectByVisibleText("Unlimited gifts available during promotional period");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-2']/div/div[2]/button");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[8]/div[1]/div[1]/div/div/div/label/div[2]/span");
      PlexusSharedFunctions.verifyTextPresent("How many winners will win one of these gifts?");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[9]/span/div/div/span[1]/div/input")).sendKeys("100");

      driver.findElement(By.name("description")).sendKeys("Gasoline");

      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	  
	 
  }
  
  public void NotificationandDelivery() 
  {
	
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div[1]/div[1]/div/div/div[1]/div/div/div/label/div/div[2]");
	 driver.findElement(By.name("otherNotification")).sendKeys("by mailing");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='notifications']/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	 driver.findElement(By.name("pubUrl")).sendKeys("www.test.com");

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
	 PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath("html/body/div[3]/div/div[2]/div/div/span/div[2]/button[1]");
	  Thread.sleep(2000);
     System.out.println("The Promotion has been created sucessfully");
      
	  
} 
  
  
  
  
  
  
  
}
