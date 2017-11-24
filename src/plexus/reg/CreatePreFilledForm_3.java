package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatePreFilledForm_3 extends PlexusSharedFunctions {
  @Test
  public void CreatePreFilledForm() throws InterruptedException {
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CreatePrefilledFormCheck(".//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div/ul[1]/li[2]/div/ul/li[3]/a/span[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div/div[2]/div/div/div/section/form/footer/button[2]");
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
	  PlexusSharedFunctions.CheckifElementsSelected(".//*[@id='methods']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	  System.out.println("The website is selected");
	  
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div/div[2]/div/div[1]/div/div/section/form/footer/button");
  
  }
  
  public void EntrantGroups()
  {

	  PlexusSharedFunctions.verifyTextPresent("Entrant Groups");
	  PlexusSharedFunctions.CheckifElementsSelected(".//*[@id='entrant-group-form']/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.CheckifElementsSelected(".//*[@id='entrant-group-form']/main/span/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.CheckifElementsSelected(".//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.CheckifElementsSelected(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.CheckifDropdownisSelected("minAge", "18");
	  PlexusSharedFunctions.CheckifDropdownisSelected("maxAge", "Any");
	
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
  }
  
  public void WhoCanEnter() throws InterruptedException
  {
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  PlexusSharedFunctions.verifyTextPresent("Australian residents who are 18 years and over.");
	  Thread.sleep(3000);
	  PlexusSharedFunctions.ClickablebyXpath("//*[@id='entry-method-form']/main/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  Thread.sleep(2000);
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/footer/button");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 // driver.findElement(By.linkText("Last")).click();
  
  }
  
  public void HowtoEnter() throws InterruptedException
  {
	 
	 
	  PlexusSharedFunctions.verifyTextPresent("Where should the entrant go online?");
	  Thread.sleep(20000);
	  Select oSelect4 = new Select(driver.findElement(By.name("goPath")));
	  
	  oSelect4.selectByVisibleText("At a specific URL");
	  driver.findElement(By.name("goUrl")).sendKeys("jackdaniels.com");
	  PlexusSharedFunctions.CheckifElementsSelected("//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.CheckifElementsSelected("//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.CheckifElementsSelected("//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.CheckifElementsSelected("//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[3]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.CheckifElementsSelected("//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[5]/div/div/div/label/div/div[2]");

	  PlexusSharedFunctions.CheckifDropdownisSelected("goMultipleEntry", "Yes");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
	  Thread.sleep(20000);
      PlexusSharedFunctions.CheckInputinTextArea(".//*[@id='winning-method-form']/main/div[5]/div/span[1]/input", "Instant Win");
      driver.findElement(By.name("iwSAApprovalNumber")).sendKeys("123456");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      Select oSelect5 = new Select(driver.findElement(By.name("iwWinDisplayType")));
	  
	  oSelect5.selectByVisibleText("The winner will be notified as appropriate for the entry mechanic");
Select oSelect6 = new Select(driver.findElement(By.name("iwRedeemType")));
	  
	  oSelect6.selectByVisibleText("Present winning message to venue staff");
	  
Select oSelect7 = new Select(driver.findElement(By.name("iwRedeemVenueType")));
	  
	  oSelect7.selectByVisibleText("At a Participating Venue");
	  
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	  
   
  }
  
  public void HowtoAddPrize() throws InterruptedException
  {
	  Thread.sleep(20000);
	  PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[15]/div[1]/div[1]/div/div/div/label/div[2]/span");

	  driver.findElement(By.xpath("//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("2");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("100");
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
      driver.findElement(By.name("description")).sendKeys("Sticker");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
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
	 Select oSelect1 = new Select(driver.findElement(By.name("nswBlanketPermit__type")));
	 oSelect1.selectByVisibleText("No, single permit only");

	 driver.findElement(By.name("goodsOrServices")).sendKeys("Alchohol");
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[3]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/span/div/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[4]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath("//*[@id='privacy-declarations']/div[1]/div/span[1]/div/input")).sendKeys("www.usertesting.com/privacy");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button[1]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath("html/body/div[3]/div/div[2]/div/div/span/div[2]/button[1]");
	  Thread.sleep(2000);
     System.out.println("The Promotion has been created sucessfully");
      
	  
}
  
  
}
