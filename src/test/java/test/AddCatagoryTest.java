package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.AddCatagoryPage;
import util.BrowserFactory;

public class AddCatagoryTest {


	WebDriver driver;

	@BeforeMethod
	public void startBrowser() {

		driver = BrowserFactory.startBrowser();
	}

	@Test
	public void addCatagory() throws InterruptedException {

		AddCatagoryPage addCatagoryPage = PageFactory.initElements(driver, AddCatagoryPage.class);
		addCatagoryPage.fillCatagoryName("SR");
		addCatagoryPage.addname();

		addCatagoryPage.addCatagoryname("Sifat");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		System.out.println(wait);
		addCatagoryPage.clickOnCatagoryField();
		Thread.sleep(3000);
		addCatagoryPage.clickDropDownMonth();
		addCatagoryPage.clickDropDownDay();
		
//		Select clickOnCatagoryField = new Select(driver.findElement(By.name("submit")));
//		
//		List<String> optionsList = new ArrayList<String>();
//		// a Set naturally removes duplicates!
//		Set<String> optionsSet = Collections.emptySet();
//		for (WebElement option : clickOnCatagoryField.getOptions()) {
//		    // fill both from the same source
//		    optionsList.add(option.getText());
//		    optionsSet.add(option.getText());
//		}
//		
//		Assert.assertEquals(optionsList.size(), optionsSet.size(), "duplicate catagory name!");
//		
//		
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
	
	

