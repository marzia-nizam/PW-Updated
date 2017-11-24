package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DrawsandGWP_4 extends PlexusSharedFunctions {
  @Test
  public void DrawsandGWP4() throws InterruptedException {
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest1.4");
	  PlexusSharedFunctions.CheckPromoterInformation();
	  AdvertisingMethods();
	  EntrantGroups();
	  WhoCanEnter();
	  HowtoEnter();
	  HowtoAddPrize();
	  NotificationandDelivery() ;
	  PermitsandPrivacy();
	 
  }
  
  public void AdvertisingMethods()
  {
	  
	  PlexusSharedFunctions.verifyTextPresent("ADVERTISING METHODS");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[5]/div/div[1]/div/div/div/label/div/div[2]");
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[4]/div/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("other")).sendKeys("members of the legal profession");
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
  
  public void HowtoEnter() throws InterruptedException
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  Thread.sleep(4000);
	  PlexusSharedFunctions.ClickablebyXpath("//*[@id='entry-step-form']/main/div[2]/div[1]/div[4]/div/div/div/label/div[2]/span");
	  driver.findElement(By.name("eventName")).sendKeys("Bird Show");
	  driver.findElement(By.name("eventLocation__streetLine1")).sendKeys("St. Paul Road");
	  driver.findElement(By.name("eventLocation__suburb")).sendKeys("Melbourne");
	  driver.findElement(By.name("eventLocation__postcode")).sendKeys("3000");
	  Select oSelect = new Select(driver.findElement(By.name("eventLocation__country")));
	  oSelect.selectByVisibleText("Australia");
	  Select oSelect1 = new Select(driver.findElement(By.name("eventLocation__state")));
	  oSelect1.selectByVisibleText("South Australia");
	  Select oSelect2 = new Select(driver.findElement(By.name("eventEntryTicket")));
	  oSelect2.selectByVisibleText("Yes, they must buy a ticket");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[10]/div/div/div/label/div[2]/span");
	  Select oSelect3 = new Select(driver.findElement(By.name("scratchType")));
	  oSelect3.selectByVisibleText("Game card");
	  Select oSelect4 = new Select(driver.findElement(By.name("scratchGameLocation")));
	  oSelect4.selectByVisibleText("From participating venues at the time of purchase");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[3]/div[1]/div[5]/div/div/div/label/div[2]/span");
	  Select oSelect5 = new Select(driver.findElement(By.name("pFormType")));
	  oSelect5.selectByVisibleText("Entry form for a competition");
	  Select oSelect6 = new Select(driver.findElement(By.name("pFormLocation")));
	  oSelect6.selectByVisibleText("On back of game card");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[3]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[4]/div/div/div/label/div/div[2]");
	  Select oSelect7 = new Select(driver.findElement(By.name("pFormAction")));
	  oSelect7.selectByVisibleText("Other (please specify)");
	  driver.findElement(By.name("pFormActionOther")).sendKeys("drop the game card in the entry box.");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[6]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");

	  PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	//  driver.findElement(By.linkText("Last")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
	  Thread.sleep(4000);
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[3]/div[1]/div[4]/div/div/div/label/div[2]/span");
	  Select oSelect8 = new Select(driver.findElement(By.name("gwpType")));
	  oSelect8.selectByVisibleText("Automatically sent to claimant");
	  Select oSelect9 = new Select(driver.findElement(By.name("gwpGiftsLimited")));
	  oSelect9.selectByVisibleText("Unlimited gifts available during promotional period");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	  
  }
  
  public void HowtoAddPrize() throws InterruptedException
  {
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-1']/div/div[2]/button");
	  PlexusSharedFunctions.verifyTextPresent("Add Prize");
	//  driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[9]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span/div/div/span[1]/div/input")).sendKeys("100");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("serviceDescription")).sendKeys("free energy efficiency assesment");
	  driver.findElement(By.name("serviceProvider")).sendKeys("Lorge");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[4]/div[2]/div[1]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("serviceStartEvent")).sendKeys("05/05/18");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[4]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  

	  Thread.sleep(4000);
	  PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[4]/div[1]/div[5]/div/div/div/label/div[2]/span");
	  
	 
	 
	  Thread.sleep(2000);
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[7]/div[1]/div[1]/div/span[1]/select");
	  ScrollDownintoView(".//*[@id='winning-method-form']/main/div[7]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[7]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
	
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/section/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
  	  Select oSelect1 = new Select(driver.findElement(By.name("iwWinDisplayType")));
	  oSelect1.selectByVisibleText("The winner will be notified as appropriate for the entry mechanic");
	  Select oSelect2 = new Select(driver.findElement(By.name("iwRedeemType")));
	  oSelect2.selectByVisibleText("Follow instructions provided");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-2']/div/div[2]/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[7]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[1]/div/div/span[1]/input")).sendKeys("3");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div/div/span[1]/div/input")).sendKeys("1500");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/span/span[1]/span[1]");
	  PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[17]/span[2]/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("vehicleMake")).sendKeys("Toyota");
	  driver.findElement(By.name("vehicleModel")).sendKeys("Elitos");
	  driver.findElement(By.name("vehicleYear")).sendKeys("2005");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div[5]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  Select oSelect3 = new Select(driver.findElement(By.name("vehicleCondition")));
	  oSelect3.selectByVisibleText("New");
	  Select oSelect4 = new Select(driver.findElement(By.name("vehicleColorType")));
	  oSelect4.selectByVisibleText("Winner's choice of colour subject to availability and excluding metallic");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[13]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("1");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("1500");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/span/span[1]/span[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  Select oSelect5 = new Select(driver.findElement(By.name("reType")));
	  oSelect5.selectByVisibleText("Apartment");
	  driver.findElement(By.name("reAddress__streetLine1")).sendKeys("300MelonStreet");
	  driver.findElement(By.name("reAddress__suburb")).sendKeys("Melbourne");
	  driver.findElement(By.name("reAddress__postcode")).sendKeys("3000");
	  Select oSelect = new Select(driver.findElement(By.name("reAddress__country")));
	  oSelect.selectByVisibleText("Australia");
	  Select oSelect6 = new Select(driver.findElement(By.name("reAddress__state")));
	  oSelect6.selectByVisibleText("Queensland");
	  Select oSelect7 = new Select(driver.findElement(By.name("reOwnership")));
	  oSelect7.selectByVisibleText("Ownership");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/fieldset/section/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[1]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[5]/div/div/div/label/div[2]/span");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[1]/div/div/span[1]/input")).sendKeys("2");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div/div/span[1]/div/input")).sendKeys("200");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
      Select oSelect8 = new Select(driver.findElement(By.name("travelMethod")));
	  oSelect8.selectByVisibleText("Flight");
	  driver.findElement(By.name("numberOfAdults")).sendKeys("1");
	  driver.findElement(By.name("numberOfChildren")).sendKeys("3");
	  Select oSelect9 = new Select(driver.findElement(By.name("flightClass")));
	  oSelect9.selectByVisibleText("Economy class");
	  Select oSelect10 = new Select(driver.findElement(By.name("returnType")));
	  oSelect10.selectByVisibleText("One way");
	  driver.findElement(By.name("travelSource")).sendKeys("Winner's nearest city");
	  driver.findElement(By.name("travelDestination")).sendKeys("winner's farthest city");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  Select oSelect11 = new Select(driver.findElement(By.name("dateIsWinnersChoice")));
	  oSelect11.selectByVisibleText("No, travel must be taken on specific dates");
	  driver.findElement(By.name("inDate")).sendKeys("06/06/18");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[5]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[1]/div/div/span[1]/input")).sendKeys("2");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div/div/span[1]/div/input")).sendKeys("200");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
      Select oSelect12 = new Select(driver.findElement(By.name("travelMethod")));
	  oSelect12.selectByVisibleText("Accommodation");
	  driver.findElement(By.name("numberOfAdults")).sendKeys("2");
	  driver.findElement(By.name("numberOfChildren")).sendKeys("2");
	  driver.findElement(By.name("accomLocation")).sendKeys("Melbourne");
	  driver.findElement(By.name("accomNights")).sendKeys("2");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/span[2]/div[3]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("accomName")).sendKeys("Long Beach Hotel");
	  Select oSelect13 = new Select(driver.findElement(By.name("dateIsWinnersChoice")));
	  oSelect13.selectByVisibleText("No, travel must be taken on specific dates");
	  driver.findElement(By.name("inDate")).sendKeys("06/06/18");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[5]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[1]/div/div/span[1]/input")).sendKeys("2");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div/div/span[1]/div/input")).sendKeys("200");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
      Select oSelect14 = new Select(driver.findElement(By.name("travelMethod")));
	  oSelect14.selectByVisibleText("Car Hire");
	  driver.findElement(By.name("carHireVehicle")).sendKeys("Jeep");
	  driver.findElement(By.name("carHireDays")).sendKeys("2");
	  Select oSelect15 = new Select(driver.findElement(By.name("dateIsWinnersChoice")));
	  oSelect15.selectByVisibleText("No, travel must be taken on specific dates");
	  driver.findElement(By.name("inDate")).sendKeys("06/06/18");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  WebElement Step1 = driver.findElement(By.xpath(".//*[@id='winning-method-2']/div/div[2]/div[6]/section[2]/div[1]/section"));
      WebElement Step2 = driver.findElement(By.xpath(".//*[@id='winning-method-2']/div/div[2]/div[5]/section[2]/div[1]/section"));
      try{
          simulateDragAndDrop(Step1, Step2);
         }catch(Exception e){
          e.printStackTrace();
         }
      
      WebElement Step3 = driver.findElement(By.xpath(".//*[@id='winning-method-2']/div/div[2]/div[6]/section[2]/div[1]/section"));
      WebElement Step4 = driver.findElement(By.xpath(".//*[@id='winning-method-2']/div/div[2]/div[5]/section[2]/div[1]/div/section"));
      try{
          simulateDragAndDrop(Step3, Step4);
         }catch(Exception e){
          e.printStackTrace();
         }
      
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");  
    

  }
  
  public void NotificationandDelivery() 
  {
	
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div[1]/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
     driver.findElement(By.xpath(".//*[@id='publications']/div[2]/div[1]/div/span[1]/input")).sendKeys("02/05/18");
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
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
      
}
  
  public void PermitsandPrivacy() throws InterruptedException 
  {
	 PlexusSharedFunctions.verifyTextPresent("Permits and Privacy");
	 PlexusSharedFunctions.verifyTextPresent("SA");
	 driver.findElement(By.name("saDateRequired")).sendKeys("31/12/18");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='permits']/p/span[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='permits']/span/span[1]/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 Select oSelect2 = new Select(driver.findElement(By.name("contactPerson__title")));
	 oSelect2.selectByVisibleText("Ms");
	 driver.findElement(By.name("goodsOrServices")).sendKeys("Chocolate");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='permits']/span/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 driver.findElement(By.name("iwGameCardCount")).sendKeys("16");
	 driver.findElement(By.name("iwPrinter")).sendKeys("HP");
	 driver.findElement(By.name("iwPrinterAddress__streetLine1")).sendKeys("300MelonStreet");
     
     driver.findElement(By.name("iwPrinterAddress__suburb")).sendKeys("Melbourne");
     driver.findElement(By.name("iwPrinterAddress__postcode")).sendKeys("3000");
     Select oSelect = new Select(driver.findElement(By.name("iwPrinterAddress__country")));
	  oSelect.selectByVisibleText("Australia");
	  Select oSelect3 = new Select(driver.findElement(By.name("iwPrinterAddress__state")));
	  oSelect3.selectByVisibleText("Queensland");
	  PlexusSharedFunctions.ClickablebyXpath("//*[@id='permits']/span/span[4]/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[3]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/span/div/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[4]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath("//*[@id='privacy-declarations']/div[1]/div/span[1]/div/input")).sendKeys("www.usertesting.com/privacy");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button[1]");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 Thread.sleep(4000);
	 PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath("html/body/div[3]/div/div[2]/div/div/span/div[2]/button[1]");
	  Thread.sleep(2000);
     System.out.println("The Promotion has been created sucessfully");
      
	  
}
  
  
  
}


