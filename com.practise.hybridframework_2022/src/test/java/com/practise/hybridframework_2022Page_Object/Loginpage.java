package com.practise.hybridframework_2022Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	WebDriver driver;
	public Loginpage (WebDriver idriver) {
	this.driver=idriver;
	
	
	PageFactory.initElements(driver,this);
		}
	
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;

    public void setUsername(String uname) {
	username.sendKeys(uname);
    }
	public void setPassword(String pwd) {
		Password.sendKeys(pwd);
	}
		
	public void clickonloginbutton() {
		loginbtn.click();
		
	}
	
}