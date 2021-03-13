package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCatagoryPage {
	
	
	WebDriver driver;

	public AddCatagoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "data")
	WebElement FILL_CATAGORY_FIELD;
	@FindBy(how = How.NAME, using = "submit")
	WebElement ADD_FIELD;

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement FILL_ADD_CATAGORY_FIELD;
	@FindBy(how = How.NAME, using = "submit")
	WebElement ADD_CATAGORY_FIELD;

	@FindBy(how = How.NAME, using = "due_month")
	WebElement DROP_DOWN_MONTH_BOX;
	
	@FindBy(how = How.NAME, using = "due_day")
	WebElement DROP_DOWN_DAY_BOX;
	

	public void fillCatagoryName(String Name) {
		FILL_CATAGORY_FIELD.sendKeys(Name);
	}

	public void addname() {
		ADD_FIELD.click();
	}

	public void addCatagoryname(String catagory) {
		FILL_ADD_CATAGORY_FIELD.sendKeys(catagory);
	}

	public void clickOnCatagoryField() {
		ADD_CATAGORY_FIELD.click();
	}

	public void clickDropDownMonth() {
		DROP_DOWN_MONTH_BOX.click();
		Select sel = new Select(DROP_DOWN_MONTH_BOX);
		sel.selectByVisibleText("Mar");

	}

	public void clickDropDownDay() {
		DROP_DOWN_DAY_BOX.click();
		Select sel = new Select(DROP_DOWN_DAY_BOX);
		sel.selectByVisibleText("17");
	}
	 

}


