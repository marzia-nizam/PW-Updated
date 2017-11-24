package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class RegTest_2 extends PlexusSharedFunctions {
  @Test
  public void RegTest2() throws InterruptedException {
	  
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest2");
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
	  
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[2]/div/div[1]/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("socialMedia__site__0")));
      oSelect.selectByVisibleText("Facebook");
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("minAge")));
	     oSelect.selectByVisibleText("1");
	   Select oSelect1 = new Select(driver.findElement(By.name("maxAge")));
	    oSelect1.selectByVisibleText("12");
	    
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[2]/div/div/div/label/div[2]/span");
      
      Select oSelect = new Select(driver.findElement(By.name("platform")));
	  oSelect.selectByVisibleText("Facebook");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='entry-step-form']/main/section/div[1]/span/div/span/p/span[1]", "You've specified that entrants must be less than 13 years old, but Facebook users must be over 13 years of age. Please change this step so that it doesn't use Facebook or");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='entry-step-form']/main/section/div[1]/span/div/span/p/span[2]","to go back and change Who Can Enter." );
	  
	  driver.findElement(By.linkText("click here")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/section[1]/div/div/fieldset/table/tbody/tr[1]/td[2]/p/a/span[1]");
	  Select oSelect1 = new Select(driver.findElement(By.name("minAge")));
	  oSelect1.selectByVisibleText("17");
	  Select oSelect2 = new Select(driver.findElement(By.name("maxAge")));
	  oSelect2.selectByVisibleText("17");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[2]/div/div/div/label/div[2]/span");
      Select oSelect3 = new Select(driver.findElement(By.name("platform")));
	  oSelect3.selectByVisibleText("Facebook");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section/div[1]/div/section/div[1]/div[2]", "Connect on Social Media");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section/div[1]/div/section/div[1]/div[3]","on Facebook" );
	  PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 // driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
	  PlexusSharedFunctions.verifyTextPresent("Add Winning Method");
	  Thread.sleep(2000);
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[3]/div[1]/div[1]/div/div/div/label/div[2]/span");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[8]/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
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
	// driver.findElement(By.linkText("Skip")).click();
	 driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[6]/div/div/div/label/div[2]/span");

	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='prize-item-form']/main/div[17]/p/span[1]", "As you are giving away an alcohol");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='prize-item-form']/main/div[17]/p/span[3]",", all individual entrant groups will be restricted to adults only (if they are not already)." );
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[1]/div/div/span[1]/input")).sendKeys("5");
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("12");
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div[2]/div/span[1]/div/input")).sendKeys("12");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.verifyTextPresent("Your major prize for this promotion in the Northern Territory includes alcohol. This is prohibited. Please choose one of the following options to address this issue.");
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div/div/span[1]/select")).click();
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[17]/fieldset/section/div/div/span[1]/select/option[3]");
	 driver.findElement(By.name("alcoholName")).sendKeys("Marlborough Dream savigoun blanc");
	 Select oSelect1 = new Select(driver.findElement(By.name("alcoholContainerType")));
	 oSelect1.selectByVisibleText("Bottle");
	 driver.findElement(By.name("alcoholContainerCount")).clear();
	 driver.findElement(By.name("alcoholContainerCount")).sendKeys("2");
	 driver.findElement(By.name("alcoholContainerVolume")).sendKeys("750");
	 driver.findElement(By.name("alcoholContent")).sendKeys("11");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/header/div[1]/h2", "Draw");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[2]","2 bottles of Marlborough Dream savigoun blanc" );
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 
	 
  }
  
  public void NotificationandDelivery() 
  {
	
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='notifications']/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/span/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='delivery-methods']/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
     PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
      
}
  
  public void PermitsandPrivacy() throws InterruptedException 
  {
	 PlexusSharedFunctions.verifyTextPresent("Permits and Privacy");
	 Select oSelect1 = new Select(driver.findElement(By.name("nswBlanketPermit__type")));
	 oSelect1.selectByVisibleText("No, single permit only");
	 //Select oSelect2 = new Select(driver.findElement(By.name("contactPerson__title")));
	// oSelect2.selectByVisibleText("Ms");
	 driver.findElement(By.name("goodsOrServices")).sendKeys("Alchohol");
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
