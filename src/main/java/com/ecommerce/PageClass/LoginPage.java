package com.ecommerce.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.Base.BaseClass;

<<<<<<< HEAD

=======
>>>>>>> 24b67434702b4b7d1108b71c9a57623064c3f974
public class LoginPage extends BaseClass{
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//input[@id='user-name']")
private WebElement username;
@FindBy(xpath="//input[@id='password']")
private WebElement password;
@FindBy(xpath="//input[@id='login-button']")
private WebElement loginButton;


public void enterUserName(String user){
<<<<<<< HEAD
	username.sendKeys(user);
}
public void enterPassword(String pass) {
	password.sendKeys(pass);
=======
	username.sendKeys("standard_user");
}
public void enterPassword(String pass) {
	password.sendKeys("secret_sauce");
>>>>>>> 24b67434702b4b7d1108b71c9a57623064c3f974
}
public void clickLoginButton() {
	loginButton.click();
}
public void loginUser(String user, String pass) {
	enterUserName(user);
	enterPassword(pass);
	clickLoginButton();
}
<<<<<<< HEAD
}
=======
}
>>>>>>> 24b67434702b4b7d1108b71c9a57623064c3f974
