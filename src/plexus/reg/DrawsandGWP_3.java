package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




public class DrawsandGWP_3 extends PlexusSharedFunctions {
  @Test
  public void DrawsandGWP3() throws InterruptedException {
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest1.3");
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[5]/div/div[1]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[5]/div/div[1]/div/div/div/label/div/div[2]");
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
	     oSelect.selectByVisibleText("per person");
		 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/footer/button");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.linkText("Last")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
  }
  
  public void HowtoEnter()
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[1]/div[1]/div[2]/div/div/div/div/label/div[1]/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("purchaseTransactionType")));
	  oSelect.selectByVisibleText("One transaction");
	  Select oSelect1 = new Select(driver.findElement(By.name("purchaseLocations")));
	  oSelect1.selectByVisibleText("Specific stores or a specific area (please specify)");
	  driver.findElement(By.name("purchaseLocationsSpecific")).sendKeys("7 eleven store");
	  driver.findElement(By.name("spendAmount")).sendKeys("50");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[6]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[6]/div/div/div/label/div[2]/span");
	  driver.findElement(By.name("smAddress__streetLine1")).sendKeys("Street Line");
	  driver.findElement(By.name("smAddress__suburb")).sendKeys("Melbourne");
	  driver.findElement(By.name("smAddress__postcode")).sendKeys("3000");
	  Select oSelect2 = new Select(driver.findElement(By.name("smAddress__country")));
	  oSelect2.selectByVisibleText("Australia");
	  Select oSelect3 = new Select(driver.findElement(By.name("smAddress__state")));
	  oSelect3.selectByVisibleText("Queensland");
	  Select oSelect4 = new Select(driver.findElement(By.name("smMustFillForm")));
	  oSelect4.selectByVisibleText("Yes, claim form for an offer");
	  Select oSelect5 = new Select(driver.findElement(By.name("smFormLocation")));
	  oSelect5.selectByVisibleText("In-store");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[3]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[4]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[5]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[6]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[6]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div[2]/div[1]/div[8]/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[4]/div/div[1]/div/div/div/label/div/div[2]");
      driver.findElement(By.name("smOtherInfo")).sendKeys("receipt number");
      Select oSelect6 = new Select(driver.findElement(By.name("smMailEnclosures")));
	  oSelect6.selectByVisibleText("Yes, proof of purchase");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div/section/div[1]/div[2]", "Purchase Product");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section/div[1]/div[2]", "Send mail");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div/section/div[1]/div[3]", "Spend $50");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section/div[1]/div[3]", "Send claim form to Street Line, Melbourne QLD 3000, Australia");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[3]/span");
	 // driver.findElement(By.linkText("Last")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[3]/div[1]/div[4]/div/div/div/label/div[2]/span");
	  Select oSelect7 = new Select(driver.findElement(By.name("gwpType")));
	  oSelect7.selectByVisibleText("Already covered by entry mechanic");
	  Select oSelect8 = new Select(driver.findElement(By.name("gwpGiftsLimited")));
	  oSelect8.selectByVisibleText("Number of gifts is limited and promotion runs while stocks last");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
  } 
  
  public void HowtoAddPrize() throws InterruptedException
  {
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-1']/div/div[2]/button");
	  PlexusSharedFunctions.verifyTextPresent("Add Prize");
	//  driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div[1]/div[12]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[1]/div/div/span[1]/input")).sendKeys("1000");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
      Select oSelect = new Select(driver.findElement(By.name("cbAmountType")));
	  oSelect.selectByVisibleText("Set amount (please specify amount inclusive of GST)");
	  driver.findElement(By.name("cbAmountNumber")).sendKeys("10");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div[3]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/fieldset/section/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  Select oSelect1 = new Select(driver.findElement(By.name("cbType")));
	  oSelect1.selectByVisibleText("Cheque");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/header/div[1]/h2", "Offer");
	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[2]", "$10 cashback");
	  PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 
  }
  
  public void NotificationandDelivery() 
  {
	
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div[1]/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='notifications']/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='delivery-methods']/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
     PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
      
}
  
  public void PermitsandPrivacy() throws InterruptedException 
  {
	 PlexusSharedFunctions.verifyTextPresent("Permits and Privacy");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "ACT, NSW and SA");
	 Select oSelect = new Select(driver.findElement(By.name("nswBlanketPermit__type")));
      oSelect.selectByVisibleText("No, single permit only");
      Select oSelect2 = new Select(driver.findElement(By.name("actBlanketPermit__type")));
      oSelect2.selectByVisibleText("No, single permit only");
      driver.findElement(By.name("saDateRequired")).sendKeys("04/06/18");
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='permits']/p/span[2]");
      driver.findElement(By.xpath(".//*[@id='permits']/span/span[1]/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]")).click();
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='permits']/span/span[3]/div[1]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
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
	  driver.findElement(By.name("goodsOrServices")).sendKeys("Shampoo");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='permits']/span/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[3]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	  driver.findElement(By.xpath(".//*[@id='privacy-declarations']/span/div/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	  driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[4]/div[1]/div[1]/div/div/div/div/label/div/div[2]")).click();
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
