package webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMain {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//詳細検索ページ
		driver.get("http://db.netkeiba.com/?pid=horse_search_detail");

		//JavaScript
		JavascriptExecutor js = null;
		if (driver instanceof JavascriptExecutor) {
		    js = (JavascriptExecutor)driver;
		}
		String getID = (String) js.executeScript("return document.forms[1].word.value=\"サンデーサイレンス\"");

		System.out.println(getID);

		js.executeScript("return document.getElementById(\"check_sex_1\").checked = true");
		js.executeScript("return document.getElementById(\"check_sex_2\").checked = true");
		js.executeScript("return document.getElementById(\"check_sex_3\").checked = true");

		js.executeScript("return document.forms[1].buttons[0].click()");


		//driver.quit();
	}
}
