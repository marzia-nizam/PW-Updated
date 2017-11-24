package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegTest_5 extends PlexusSharedFunctions {
  @Test
  public void RegTest5() throws InterruptedException {
	  
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest5");
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[1]/div/div/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("minAge")));
      oSelect.selectByVisibleText("12");
      Select oSelect1 = new Select(driver.findElement(By.name("maxAge")));
      oSelect1.selectByVisibleText("14");
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[1]/div[1]/div[1]/div/div/div/div/label/div[1]/div[2]");
	  Select oSelect2 = new Select(driver.findElement(By.name("purchaseRequirement")));
	  oSelect2.selectByVisibleText("Buy a certain number of these products or services");
	  driver.findElement(By.name("products__name__0")).sendKeys("Alchohol");
	  Select oSelect = new Select(driver.findElement(By.name("purchaseTransactionType")));
	  oSelect.selectByVisibleText("One transaction");
	  Select oSelect1 = new Select(driver.findElement(By.name("purchaseLocations")));
	  oSelect1.selectByVisibleText("Any stores displaying promotional material (including online)");
	  Select oSelect3 = new Select(driver.findElement(By.name("purchaseAlcohol")));
	  oSelect3.selectByVisibleText("Yes, for on-premises consumption");
	  PlexusSharedFunctions.verifyTextPresent("Your promotion will be reviewed for compliance with the liquor promotion guidelines. As a general rule, the purchase of more than one standard drink per person is unlikely to meet the guidelines.");
	  PlexusSharedFunctions.verifyTextPresent("In addition your promotion must have an entry limit of 1 entry per day. We will set this for you.");
	  PlexusSharedFunctions.verifyTextPresent("As your promotion involves the purchase of alcohol, all individual entrant groups will be restricted to adults only if they are not already.");
	  driver.findElement(By.name("purchaseStandardDrinkCount")).sendKeys("3");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");

	  PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	  // driver.findElement(By.linkText("Skip")).click();
	  Thread.sleep(2000);
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
	  PlexusSharedFunctions.verifyTextPresent("Add Prize");
	  //driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[1]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("1");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("100");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
      driver.findElement(By.name("description")).sendKeys("test gift");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 
  }
  
  public void NotificationandDelivery() 
  {
	
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div/div[1]/div/div/div[1]/div/div/div/label/div/div[2]");
	 driver.findElement(By.name("otherNotification")).sendKeys("Call Winner");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='notifications']/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='delivery-methods']/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
     PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
      
}
  
  public void PermitsandPrivacy() throws InterruptedException 
  {
	
	 PlexusSharedFunctions.verifyTextPresent("Permits and Privacy");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "NSW");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'New South Wales')]//following::td[contains(text(),'$80.32')][1]", "$80.32");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("2999");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='prize-item-form']/main/div[16]/span[2]/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "NSW");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'New South Wales')]//following::td[contains(text(),'$80.32')][1]", "$80.32");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("3000");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");

	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "NSW");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'New South Wales')]//following::td[contains(text(),'$80.32')][1]", "$80.32");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("3001");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "ACT and NSW");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'Australian Capital Territory')]//following::td[contains(text(),'$199.00')]", "$199.00");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'New South Wales')]//following::td[contains(text(),'$80.32')]", "$80.32");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("3100");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "ACT and NSW");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'Australian Capital Territory')]//following::td[contains(text(),'$199.00')]", "$199.00");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'New South Wales')]//following::td[contains(text(),'$80.32')]", "$80.32");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("5000");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "ACT and NSW");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'Australian Capital Territory')]//following::td[contains(text(),'$199.00')]", "$199.00");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'New South Wales')]//following::td[contains(text(),'$80.32')]", "$80.32");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("5001");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "ACT, NSW and SA");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'Australian Capital Territory')]//following::td[contains(text(),'$289.00')]", "$289.00");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'New South Wales')]//following::td[contains(text(),'$80.32')]", "$80.32");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'South Australia')]//following::td[contains(text(),'$187.00')]", "$187.00");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 //driver.findElement(By.linkText("Edit")).click();
	 //PlexusSharedFunctions.ScrollDownintoView("//a[contains(text(),'Edit')]");
	 Thread.sleep(4000);
	// PlexusSharedFunctions.ScrollUp();
	 JavascriptExecutor  j = (JavascriptExecutor)driver;
	 j.executeScript("arguments[0].click()", driver.findElement(By.xpath("//a[contains(text(),'Edit')]")));
	 //driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("5100");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "ACT, NSW and SA");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'Australian Capital Territory')]//following::td[contains(text(),'$289.00')]", "$289.00");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'New South Wales')]//following::td[contains(text(),'$80.32')]", "$80.32");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'South Australia')]//following::td[contains(text(),'$187.00')]", "$187.00");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/section[1]/div/div/fieldset/table/tbody/tr[1]/td[2]/p/a/span[1]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[3]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[6]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 Thread.sleep(3000);
	 j.executeScript("arguments[0].click()", driver.findElement(By.linkText("Edit")));
	 //driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[13]/span[2]/div[1]/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[13]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("5000");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 driver.findElement(By.linkText("This field is required")).click();
	 driver.findElement(By.name("daysTilNotification")).sendKeys("7");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p", "Your promotion does not require any permits.");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[13]/span[2]/div[1]/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[13]/span[2]/div/div/span[1]/div/input")).sendKeys("5001");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.verifyTextPresent("You will need a permit in the Northern Territory.");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 Thread.sleep(3000);
	 j.executeScript("arguments[0].click()", driver.findElement(By.linkText("Edit")));
	// driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[13]/span[2]/div[1]/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[13]/span[2]/div/div/span[1]/div/input")).sendKeys("5100");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.verifyTextPresent("You will need a permit in the Northern Territory.");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/section[1]/div/div/fieldset/table/tbody/tr[1]/td[2]/p/a/span[1]");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 Thread.sleep(3000);
	 j.executeScript("arguments[0].click()", driver.findElement(By.linkText("Edit")));
	// driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[14]/span[2]/div[1]/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[14]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("5100");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[14]/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "ACT");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'Australian Capital Territory')]//following::td[contains(text(),'$289.00')]", "$289.00");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Previous')]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/section[1]/div/div/fieldset/table/tbody/tr[1]/td[2]/p/a/span[1]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div[2]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 Thread.sleep(3000);
	 j.executeScript("arguments[0].click()", driver.findElement(By.linkText("Edit")));
	// driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("10");
     driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div[1]/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("100");
      
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-1']/div/div[2]/div[3]/section[1]/div[1]/div/div/div[1]/div/span[1]/select");
	 Thread.sleep(4000);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.linkText("Select all states")));
	 driver.findElement(By.linkText("Select all states")).click();
	// Thread.sleep(4000);
	// jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath(".//*[@id='winning-method-1']/header/div[1]/h2")));
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div/h1");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 jse.executeScript("scroll(0, -450);");
	 driver.findElement(By.linkText("This field is required")).click();
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "NSW");
	 PlexusSharedFunctions.CheckInputProvided("//td[contains(text(),'New South Wales')]//following::td[contains(text(),'$80.32')]", "$80.32");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/span/div[1]/div/label/span[1]", "Would you like to apply for a blanket permit in NSW?");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/span");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/span");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("1000");
     driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div[1]/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("100");
      
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "ACT, NSW and SA");
	 PlexusSharedFunctions.verifyTextPresent("Would you like to apply for a blanket permit in NSW?");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/span");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/span");
	 Thread.sleep(4000);
	/* JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//*[@id='winning-method-1']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[3]/div[2]/div/div[1]/a")));
	 driver.findElement(By.xpath("//*[@id='winning-method-1']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[3]/div[2]/div/div[1]/a")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("40");
     driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div[1]/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("100");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/span/div[1]/div/label/span[1]", "Would you like to apply for a blanket permit in NSW?");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/span/div[2]/div/label/span[1]", "Would you like to apply for a blanket permit in ACT?");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/header/div");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/span");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/span");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("10");
     driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div[1]/div/span[1]/div/input")).clear();
	 driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div[1]/div/span[1]/div/input")).sendKeys("1000");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[1]", "You need permits in these states:");
	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='permits']/p/span[2]", "ACT, NSW and SA");
	 PlexusSharedFunctions.verifyTextPresent("Would you like to apply for a blanket permit in NSW?");
	 PlexusSharedFunctions.verifyTextPresent("Would you like to apply for a blanket permit in ACT?");
	/* Select oSelect1 = new Select(driver.findElement(By.name("nswBlanketPermit__type")));
	 oSelect1.selectByVisibleText("No, single permit only");
	 Select oSelect2 = new Select(driver.findElement(By.name("contactPerson__title")));
	 oSelect2.selectByVisibleText("Ms");
	// driver.findElement(By.name("goodsOrServices")).sendKeys("Alchohol");
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[3]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/span/div/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 driver.findElement(By.xpath(".//*[@id='privacy-declarations']/div[4]/div[1]/div[2]/div/div/div/div/label/span[1]")).click();
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button[1]");
	 PlexusSharedFunctions.ClickablebyXpath("//span[contains(text(),'Next step')]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/div[6]/button");
	 PlexusSharedFunctions.ClickablebyXpath("html/body/div[3]/div/div[2]/div/div/span/div[2]/button[1]");
	  Thread.sleep(2000);
     System.out.println("The Promotion has been created sucessfully");*/
      
	  
} 
  
  
  
  
}
