package plexus.reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DrawsandGWP_5 extends PlexusSharedFunctions {
  @Test
  public void DrawsandGWP5() throws InterruptedException {
	  PlexusSharedFunctions.Login();
	  PlexusSharedFunctions.ImplicitWait(30);
	  PlexusSharedFunctions.CheckPromotionForm(Name+"RegTest1.5");
	  PlexusSharedFunctions.CheckPromoterInformation();
	  AdvertisingMethods();
	  EntrantGroups();
	  WhoCanEnter();
	  HowtoEnter();
	  HowtoAddPrize();
	  NotificationandDelivery();
	  PermitsandPrivacy();
  }
  
  public void AdvertisingMethods() throws InterruptedException
  {
	  
	  PlexusSharedFunctions.verifyTextPresent("ADVERTISING METHODS");
	  Thread.sleep(4000);
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[2]/div/div[1]/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("socialMedia__site__0")));
      oSelect.selectByVisibleText("Facebook");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[2]/div/div[2]/button");
	  Select oSelect1 = new Select(driver.findElement(By.name("socialMedia__site__1")));
      oSelect1.selectByVisibleText("Instagram");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='methods']/div/div[1]/div[3]/div/div[1]/div/div/div/label/div/div[2]");
	  
	  
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
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[3]/div/div[1]/div/div/div/label/div[1]/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/section/div/div[1]/div[3]/div/span/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("employeeRolesPermitted")));
      oSelect.selectByVisibleText("Other (please specify)");
      driver.findElement(By.name("employeeRolesPermittedOther")).sendKeys("employees of L'Oreal Professionnel salons");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/div/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.linkText("Australia (all states)")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/main/span/div[3]/div[1]/div[4]/div/div[1]/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("other")).sendKeys("Salons that are authorised distributors of L'Oreal Professionnel products");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entrant-group-form']/footer/button[2]");
	
  }
  
  public void WhoCanEnter()
  {
	 
	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  driver.findElement(By.name("name")).clear();
	  driver.findElement(By.name("name")).sendKeys("Stylish Entry");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[2]/div[1]/div[1]/div/span[1]/select");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/footer/button");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//  driver.findElement(By.linkText("Last")).click();
	 
  }
  
  public void HowtoEnter() throws InterruptedException
  {
	  

	  PlexusSharedFunctions.verifyTextPresent("How to Enter");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[9]/div/div/div/label/div[2]/span");
	  driver.findElement(By.name("visitLocation")).sendKeys("the L'Oreal Professionnel training centre in Melbourne");
	  driver.findElement(By.name("visitAction")).sendKeys("Purchase shampoo");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[3]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  Select oSelect = new Select(driver.findElement(By.name("visitID")));
      oSelect.selectByVisibleText("Show proof of purchase to promoter's representatives (please specify)");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[11]/div/div/div/label/div[2]/span");
	  Select oSelect1 = new Select(driver.findElement(By.name("createType")));
      oSelect1.selectByVisibleText("Video");
      driver.findElement(By.name("createSubject")).sendKeys("demonstrating use of L'Oreal Professionnel products and techniques from the training");
	  driver.findElement(By.name("createLengthMax")).sendKeys("5");
	  Select oSelect2 = new Select(driver.findElement(By.name("createFormat")));
      oSelect2.selectByVisibleText("MP4");
      Select oSelect3 = new Select(driver.findElement(By.name("createFileSizeMax")));
      oSelect3.selectByVisibleText("4 MB");
      PlexusSharedFunctions.ClickablebyXpath("//*[@id='entry-step-form']/main/div[3]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[1]");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[3]/div/div[12]/div/div/div/label/div[2]/span");
      driver.findElement(By.name("otherEntryDescription")).sendKeys("get a reference from 5 customers");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
      Thread.sleep(4000);
      PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div[2]/button");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div[2]/button");
      driver.findElement(By.name("name")).clear();
      driver.findElement(By.name("name")).sendKeys("Salon Entry");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[2]/div[1]/div[1]/div/span[1]/select");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/label/span[1]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/main/div[4]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-method-form']/footer/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/div[2]/div[1]/div[2]/div/div/div/label/div[2]/span");
	  Select oSelect4 = new Select(driver.findElement(By.name("platform")));
      oSelect4.selectByVisibleText("Facebook");
	  driver.findElement(By.name("socialUrl")).sendKeys("www.facebook.com/");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[4]/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("tags__tag__0")).sendKeys("#lorealtrainingstars");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/main/section/div[5]/div[1]/div[7]/div/div[1]/div/div/div/label/div/div[2]");
	  driver.findElement(By.name("actionOther")).sendKeys("Share the photo created by their employee");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='entry-step-form']/footer/button[2]");
  	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='entry-method-header-1']", "Stylish Entry");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div/section/div[1]/div[2]", "Visit somewhere");
  	// ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div/section/div[1]/div[3]");
  	 //PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[1]/div[1]/div/section/div[1]/div[3]", "Go to the Promoter Pvt Limited's standthe L'Oreal Professionnel training centre in Melbourne and Purchase shampoo");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section/div[1]/div[2]", "Create a video, photo, or essay");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[2]/div[1]/div/section/div[1]/div[3]", "Video of demonstrating use of L'Oreal Professionnel products and techniques from the training");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[3]/div[1]/div/section/div[1]/div[2]", "Other");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[1]/div/div[2]/section[3]/div[1]/div/section/div[1]/div[3]", "Get a reference from 5 customers");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='entry-method-header-2']", "Salon Entry");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[2]/div/div[2]/section/div[1]/div/section/div[1]/div[2]", "Connect on Social Media");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='root']/div/div[2]/div[2]/div/div/section[2]/div/div[2]/section/div[1]/div/section/div[1]/div[3]", "on Facebook");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//  driver.findElement(By.linkText("Last")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//button[contains(text(),'Last')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[4]/div[1]/div[2]/div/div/div/label/div[2]/span");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[8]/div[1]/div[1]/div/span[1]/select");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[8]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/label/span[1]");
	  Select oSelect5 = new Select(driver.findElement(By.name("judges")));
      oSelect5.selectByVisibleText("Other (please specify)");
      driver.findElement(By.name("otherJudge")).sendKeys("Professional Stars");
      Select oSelect6 = new Select(driver.findElement(By.name("criteria")));
      oSelect6.selectByVisibleText("Literary Merit");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
	  
  } 
  
  public void HowtoAddPrize() throws InterruptedException
  {
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-1']/div/div[2]/button");
	  PlexusSharedFunctions.verifyTextPresent("Add Prize");
	 // driver.findElement(By.linkText("Skip")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[6]/div/div/div/label/div[2]/span");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[1]/div/div/span[1]/input")).sendKeys("10");
	  driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[16]/span[2]/div/div/span[1]/div/input")).sendKeys("30");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/fieldset/section/div/div/span[1]/select");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[16]/fieldset/section/div/div/span[1]/select/option[3]");
	//  Select oSelect = new Select(driver.findElement(By.name("alcoholNTResolve")));
    //  oSelect.selectByVisibleText("If a winner from NT wins this prize, give the winner the cash equivalent of the value of the prize (cheque).");
      driver.findElement(By.name("alcoholName")).sendKeys("Hennessey");
      Select oSelect1 = new Select(driver.findElement(By.name("alcoholContainerType")));
      oSelect1.selectByVisibleText("Bottle");
      driver.findElement(By.name("alcoholContainerVolume")).sendKeys("300");
      driver.findElement(By.name("alcoholContent")).sendKeys("15");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
	  Thread.sleep(4000);
	  PlexusSharedFunctions.ScrollDownintoView(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/button");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div/div/div[3]/button");
	  
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[5]/div[1]/div[2]/div/div/div/label/div[2]/span");
	  driver.findElement(By.name("title")).clear();
	  driver.findElement(By.name("title")).sendKeys("Final Judging");
	  Thread.sleep(3000);
	  PlexusSharedFunctions.ClickablebyXpath("//*[@id='winning-method-form']/main/div[9]/div[1]/div[1]/div/span[1]/select");
	  PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/main/div[9]/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/label/span[1]");
	  Select oSelect2 = new Select(driver.findElement(By.name("judges")));
      oSelect2.selectByVisibleText("Representatives of the Promoter");
      Select oSelect3 = new Select(driver.findElement(By.name("criteria")));
      oSelect3.selectByVisibleText("Literary Merit");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-form']/footer/button");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='winning-method-2']/div/div[2]/button");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[15]/div[1]/div[3]/div/div/div/label/div[2]/span");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[1]/div/div/span[1]/input")).sendKeys("5");
      driver.findElement(By.xpath(".//*[@id='prize-item-form']/main/div[17]/span[2]/div/div/span[1]/div/input")).sendKeys("100");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/main/div[17]/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
      Select oSelect4 = new Select(driver.findElement(By.name("paymentMethod")));
      oSelect4.selectByVisibleText("Cash");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='prize-item-form']/footer/button[2]");
  	  PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/header/div[1]/h2", "Judging");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-1']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[2]", "1 bottle of Hennessey");

  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-2']/header/div[1]/h2", "Final Judging");
  	 PlexusSharedFunctions.CheckInputProvided(".//*[@id='winning-method-2']/div/div[2]/div[3]/section[2]/div[1]/section/div/div[2]", "$100 cash");
      PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
  
  }
  
  public void NotificationandDelivery() 
  {
	
	 PlexusSharedFunctions.verifyTextPresent("Notification and Delivery");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/main/div/div[1]/div[1]/div/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div[1]/div[1]/div[2]/div/div[1]/div/div/div/label/div/div[2]");
	 PlexusSharedFunctions.ClickablebyXpath("//*[@id='notifications']/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='notifications']/div[1]/div[1]/div[3]/div/div[1]/div/div/div/label/div/div[2]");
     driver.findElement(By.name("otherNotification")).sendKeys("Phone");
     driver.findElement(By.name("daysTilNotification")).clear();
     driver.findElement(By.name("daysTilNotification")).sendKeys("5");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[1]/div/div[1]/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/div/div[1]/div[2]/div/div[1]/div/div/div/label/div/div[2]");
     driver.findElement(By.name("pubUrl")).sendKeys("www.salonstars.com.au");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='publications']/span/div[2]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='delivery-methods']/div[1]/div[1]/div[2]/div/div/div/div/label/div/div[2]");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[2]/div/div[1]/div/div/section/form/footer/button");
     PlexusSharedFunctions.ClickablebyXpath(".//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[3]/span");
      
}
  public void PermitsandPrivacy() throws InterruptedException 
  {
	 PlexusSharedFunctions.verifyTextPresent("Permits and Privacy");
	 PlexusSharedFunctions.verifyTextPresent("Your promotion does not require any permits.");
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
