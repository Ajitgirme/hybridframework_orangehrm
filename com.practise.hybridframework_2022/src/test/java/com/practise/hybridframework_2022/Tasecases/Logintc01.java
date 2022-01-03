package com.practise.hybridframework_2022.Tasecases;

import org.testng.annotations.Test;

import com.practise.hybridframework_2022Page_Object.Loginpage;
import com.practise.hybridframework_2022Test_Base.TaseBase;

public class Logintc01 extends TaseBase{
	
	
	@Test
	public void loginorangehrm() throws InterruptedException {
		Loginpage lp = new Loginpage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickonloginbutton();
		
		Thread.sleep(5000);
	    String hp = driver.getTitle();
	    
	    System.out.println(hp);
		
}
	
	
	
}