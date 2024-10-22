package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {
	
	public Register_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		 @FindBy(linkText="Create new account")
         WebElement Create_Account;
         
       public void ClickOnCreate() {
    	   Create_Account.click();
			
		}
}
