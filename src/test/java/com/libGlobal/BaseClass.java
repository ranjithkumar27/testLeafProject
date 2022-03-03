package com.libGlobal;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	Navigation navigate;
	Actions action;
	Alert alt;
	Select select;

	/**
	 * @Description - WebDriver-I and its Methods
	 */

	static WebDriver driver;

	/**
	 * @Description Method is used to launch the web page in different browsers
	 * @param browserName
	 * @return
	 */

	public WebDriver launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Ie")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("Invalid browser name");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;

	}

	/**
	 * @Description this method is used to load the URL in the browser -method
	 *              get("URL");
	 * @param url
	 */

	public String loadUrl(String url) {

		driver.get(url);

		return url;
	}

	/**
	 * @Description - this method is used to get the title of the current page
	 *              -method getTitle();
	 * @return
	 */

	public String title() {

		String title = driver.getTitle();

		return title;
	}

	/**
	 * @Description - this method is used to get the current URL of the page -method
	 *              getCurrentUrl();
	 * @return
	 */

	public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	/**
	 * @Description - this method is used to close the current opened page -method
	 *              close();
	 */
	public void close() {
		driver.close();

	}

	/**
	 * @Description - this method is used to close the entire browser - method
	 *              quit();
	 */
	public void quit() {
		driver.quit();

	}

	/**
	 * @Description - this method is used to get the parent window ID - method
	 *              getWindowHandle();
	 * @return
	 */

	public String windowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	/**
	 * @Description - this method is used to get the all window ID's - method
	 *              getWindowHandles();
	 * @return
	 */
	public Set<String> windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	/**
	 * @Description - this method is used to get the source of the last loaded page
	 *              -method getPageSource();
	 * @return
	 */

	public String pageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	/**
	 * @Description - this method is used to switch the driver into frame or window
	 *              - method switchTo();
	 * @return
	 */
	public TargetLocator switchTo() {

		TargetLocator switchTo = driver.switchTo();

		return switchTo;
	}

	/**
	 * @Description - this method is used to load the URL and also it will store the
	 *              browser history and by using this we can go forward,back and
	 *              refresh in the web page -method navigate();
	 * @return
	 */
	public Navigation navigate() {
		Navigation navigate = driver.navigate();
		return navigate;
	}

	/**
	 * @Description - WebElement - I and its methods
	 */

	/**
	 * @Description - this method is used to pass the values in the respective
	 *              fields - method sendKeys();
	 * @param element
	 * @param input
	 */
	public void input(WebElement element, String input) {

		element.sendKeys(input);

	}

	/**
	 * @Description - this method is used to click the respective fields - methods
	 *              click();
	 * @param element
	 */
	public void click(WebElement element) {
		element.click();

	}

	/**
	 * @Description - this method is used to clear the data's in the respective
	 *              fields -method clear();
	 * @param element
	 */

	public void clear(WebElement element) {
		element.clear();

	}

	/**
	 * @Description - this method is used to get the text in the respective field
	 *              -method getText();
	 * @param element
	 * @return
	 */
	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	/**
	 * Description - this method is used to get the attribute value in the
	 * respective field- method getAttribute();
	 * 
	 * @param element
	 * @param attValue
	 * @return
	 */
	public String getAttribute(WebElement element, String attValue) {
		String attribute = element.getAttribute(attValue);
		return attribute;
	}

	/**
	 * Description - this method is used to check whether that respective element is
	 * displayed in the web page or not- method isDisplayed();
	 * 
	 * @param element
	 * @return
	 */
	public boolean displayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;
	}

	/**
	 * @Description - this method is used to check whether that respective field is
	 *              enabled in the web page or not- method isEnabled();
	 * @param element
	 * @return
	 */
	public boolean enabled(WebElement element) {

		boolean enabled = element.isEnabled();
		return enabled;
	}

	/**
	 * @Description - this method is used to check whether that respective element
	 *              is selected in the web page or not- method isSelected();
	 * @param element
	 * @return
	 */
	public boolean selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}

	/**
	 * @Description - this method is used to submit the form field in the web page -
	 *              method submit();
	 * @param element
	 */

	public void submit(WebElement element) {
		element.submit();

	}

	/**
	 * @Description - this method is used to get the CSS property in the web page -
	 *              method getCssValue();
	 * @param element
	 * @param cssDate
	 * @return
	 */

	public String cssValue(WebElement element, String cssDate) {

		String cssValue = element.getCssValue(cssDate);
		return cssValue;

	}

	/**
	 * @Description - this method is used to get the height and width of the
	 *              respective element in the web page - method getSize();
	 * @param element
	 * @return
	 */
	public Dimension size(WebElement element) {
		Dimension size = element.getSize();
		return size;
	}

	/**
	 * @Description - this method is used to get the location of the top left-hand
	 *              corner in the web page - method getLocation();
	 * @param element
	 * @return
	 */
	public Point location(WebElement element) {
		Point location = element.getLocation();
		return location;

	}

	/**
	 * @Description - this method is used to get the tag name of the respective
	 *              element in the web page - method getTagName();
	 * @param element
	 * @return
	 */
	public String getTagName(WebElement element) {

		String tagName = element.getTagName();
		return tagName;
	}

	/**
	 * @Description - Navigation - I and its methods
	 */

	/**
	 * @Description - This method is used to go back to the previous page -method
	 *              back();
	 */
	public void back() {
		navigate.back();

	}

	/**
	 * @Description - This method is used to go forward in the web page -method
	 *              forward();
	 */
	public void forward() {
		navigate.forward();

	}

	/**
	 * @Description - This method is used to refresh the page -method refresh();
	 */

	public void refresh() {
		navigate.refresh();

	}

	/**
	 * @Description - This method is used to load the URL in the browser -method
	 *              to();
	 * @param url
	 */
	public void navigateTo(String url) {
		navigate.to(url);

	}

	/**
	 * @Description - Actions-C and its methods
	 */

	/**
	 * @Description - This method is used to do mouse over action in the web page
	 *              -method moveToElement();
	 * @param target
	 */
	public void mouseHover(WebElement target) {

		action.moveToElement(target).perform();
	}

	/**
	 * @Description - This method is used to do drag and drop in the web page -
	 *              method dragAndDrop();
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebElement source, WebElement target) {

		action.dragAndDrop(source, target).perform();

	}

	/**
	 * @Description - This method is used to do right click on the respective
	 *              element in the web page - method contextClick();
	 * @param target
	 */

	public void rightClick(WebElement target) {
		action.contextClick(target).perform();

	}

	/**
	 * @Description -This method is used to do double click on the respective
	 *              element in the web page -method doubleClick();
	 * @param target
	 */

	public void doubleClick(WebElement target) {
		action.doubleClick(target).perform();

	}

	/**
	 * @Description - This method is used to click and hold the element in the web
	 *              page - method clickAndHold();
	 * @param target
	 */

	public void clickAndHold(WebElement target) {
		action.clickAndHold(target).perform();

	}

	/**
	 * @Description - Alert -I and its methods
	 */

	/**
	 * @Description - This method is used to accept the alert in the web page -
	 *              method accept();
	 */

	public void accept() {
		driver.switchTo().alert();
		alt.accept();

	}

	/**
	 * @Description - This method is used to dismiss the alert in the web page -
	 *              method dismiss();
	 */

	public void dismiss() {
		driver.switchTo().alert();
		alt.dismiss();

	}

	/**
	 * @Description - This method is used to send the input in the alert on the web
	 *              page - method sendKeys();
	 * @param alertinput
	 */

	public void alertInput(String alertinput) {
		driver.switchTo().alert();
		alt.sendKeys(alertinput);

	}

	/**
	 * @Description - This method is used to get the text of the alert on the web
	 *              page - method getText();
	 * @return
	 */

	public String alertGetText() {
		driver.switchTo().alert();
		String altText = alt.getText();
		return altText;

	}

	/**
	 * @Description - Select - C and its methods
	 */

	/**
	 * @Description - This method is used to select the option in the drop drop by
	 *              using index - method selectByIndex();
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {

		select = new Select(element);

		select.selectByIndex(index);
	}

	/**
	 * @Description - This method is used to select the option in the drop drop by
	 *              using value - method selectByValue();
	 * @param element
	 * @param value
	 */

	public void selectByValue(WebElement element, String value) {

		select = new Select(element);

		select.selectByValue(value);

	}

	/**
	 * @Description - This method is used to select the option in the drop drop by
	 *              using String visible text - method selectByVisibleText();
	 * @param element
	 * @param value
	 */

	public void selectByVisibleText(WebElement element, String value) {

		select = new Select(element);

		select.selectByVisibleText(value);
	}

	/**
	 * @Description - This method is used to de-select the option in the drop drop
	 *              by using index - method selectByIndex();
	 * @param element
	 * @param index
	 */
	public void deSelectByIndex(WebElement element, int index) {

		select = new Select(element);

		select.deselectByIndex(index);
	}

	/**
	 * @Description - This method is used to de-select the option in the drop drop
	 *              by using value - method selectByValue();
	 * @param element
	 * @param value
	 */

	public void deSelectByValue(WebElement element, String value) {

		select = new Select(element);

		select.deselectByValue(value);

	}

	/**
	 * @Description - This method is used to de-select the option in the drop drop
	 *              by using String visible text - method selectByVisibleText();
	 * @param element
	 * @param value
	 */

	public void deSelectByVisibleText(WebElement element, String value) {

		select = new Select(element);

		select.deselectByVisibleText(value);
	}

	/**
	 * @Description - This method is used to de-select all the options in the drop
	 *              down - method selectByVisibleText();
	 * @param element
	 * @param value
	 */

	public void deSelectAll(WebElement element) {
		select = new Select(element);
		select.deselectAll();

	}

	/**
	 * @Description - This method is used to check whether the drop down is
	 *              multi-selectable or not -method isMultiple();
	 * @param element
	 * @return
	 */
	public boolean multiple(WebElement element) {

		select = new Select(element);

		boolean isMultiple = select.isMultiple();

		return isMultiple;
	}

	/**
	 * @Description - This method is used to get all the options in the drop down -
	 *              method getOptions();
	 * @param element
	 * @return
	 */

	public List<WebElement> getOptions(WebElement element) {
		select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;

	}

	/**
	 * @Description - This method is used to get the all selected options in the web
	 *              page - method getAllSelectedOptions();
	 * @param element
	 * @return
	 */

	public List<WebElement> getAllSelectedOptions(WebElement element) {
		select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	/**
	 * @Description - This method is used to get the first selected option in the
	 *              web page -method getFirstSelectedOption();
	 * @param element
	 * @return
	 */

	public WebElement firstSelectedOption(WebElement element) {
		select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;

	}

	/**
	 * @Description - WindowHandling reusable methods
	 */

	/**
	 * @Description - This method is used to switch to window by using string Id
	 *              -method window(String id);
	 * @param id
	 */

	public void windowSwitchByStringId(String id) {

		driver.switchTo().window(id);

	}

	/**
	 * @Description - This method is used to switch to window by using string URL
	 *              -method window(String URL);
	 * @param url
	 */

	public void windowSwitchByStringUrl(String URL) {

		driver.switchTo().window(URL);

	}

	/**
	 * @Description - This method is used to switch to window by using string Title
	 *              -method window(String Title);
	 * @param title
	 */

	public void windowSwitchByStringTitle(String title) {

		driver.switchTo().window(title);

	}

	/**
	 * @Description - Frame and its method
	 */

	/**
	 * @Description - This method is used to switch the frame by using string ID
	 *              -method frame(String id)
	 * @param id
	 */
	public void frameSwitchById(String id) {

		driver.switchTo().frame(id);
	}

	/**
	 * @Description - This method is used to switch the frame by using string Name
	 *              -method frame(String name)
	 * @param name
	 */
	public void frameSwitchByName(String name) {

		driver.switchTo().frame(name);

	}

	/**
	 * @Description - This method is used to switch the frame by using WebElement
	 *              reference -method frame(element)
	 * @param element
	 */
	public void frameSwitchByWebElement(WebElement element) {

		driver.switchTo().frame(element);

	}

	/**
	 * @Description - This method is used to switch the frame by using int index
	 *              -method frame(int index)
	 * @param index
	 */
	public void frameSwitchByIndex(int index) {

		driver.switchTo().frame(index);

	}

	/**
	 * @Description - JavaScript executor and its methods
	 */

	public void sendKeysInJs(WebElement element, String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, element);
		// code for script reference name to send the value is
		// ("arguments[0].setAttribute('value','give what value you need to
		// give')",webelement reference)
	}

	public void getAttributeInJs(WebElement element, String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, element);
		// code for script reference name to get the value
		// is("arguments[0].getAttribute('value')",webelement reference)

	}

	public void clickInJs(WebElement element, String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(script, element);

		// code for script reference name to click the btn is
		// ("arguments[0].click()",webelement reference);

	}

	public void scrollUp(WebDriver element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(flase)", element);
	}

	public void scrollDown(WebDriver element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(true)", element);

	}

	/**
	 * @throws IOException
	 * @Description - TakesScreenshot
	 */

	public void takesScreenshotInFile(String path) throws IOException {

		TakesScreenshot ss = (TakesScreenshot) driver;
		File screenshotAsTemFile = ss.getScreenshotAs(OutputType.FILE);
		File ScreenShotDestination = new File(path);
		FileUtils.copyFile(screenshotAsTemFile, ScreenShotDestination);

	}
}