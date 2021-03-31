package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilis.BaseClass;

public class Homepagepojo extends BaseClass {
	public Homepagepojo() {
		PageFactory.initElements(dri, this);
	}

	@FindBy(id="hotel-checkin-hp-hotel")
	private WebElement chkinbox;
	
	@FindBy(id="hotel-checkout-hp-hotel")
	private WebElement chkoutbox;
	
	@FindBy(xpath="//button[@data-day='31']")
	private WebElement date;
	
	@FindBy(xpath="//span[text()='Search']")
	private List<WebElement> serch;
	
	@FindBy(id="header-account-menu")
	private WebElement accMenu;
	
	@FindBy(id="account-signin")
	private WebElement sigin;
	
	@FindBy(id="gss-signin-email")
	private WebElement emil;
	
	@FindBy(id="gss-signin-password")
	private WebElement pass;
	
	@FindBy(id="gss-signin-submit")
	private WebElement submitbtn;
	
	

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getAccMenu() {
		return accMenu;
	}

	public WebElement getSigin() {
		return sigin;
	}

	public WebElement getEmil() {
		return emil;
	}

	public WebElement getPass() {
		return pass;
	}

	public List<WebElement> getSerch() {
		return serch;
	}

	public WebElement getChkinbox() {
		return chkinbox;
	}

	public WebElement getChkoutbox() {
		return chkoutbox;
	}

	public WebElement getDate() {
		return date;
	}

	
	
	
}
