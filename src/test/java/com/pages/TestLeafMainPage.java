package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestLeafMainPage {

	/**
	 * @Description - HomePage title
	 */

	@FindBy(xpath = "//h1[@class='wp-heading']")
	private WebElement titleHomePageTxt;

	/**
	 * @Description - edit button
	 */

	@FindBy(xpath = "//img[@alt='Edit / Text Fields']")
	private WebElement editBtn;

	/**
	 * @Description - Button button
	 */

	@FindBy(xpath = "//img[@alt='Buttons']")
	private WebElement buttonBtn;

	/**
	 * @Description - HyperLink button
	 */

	@FindBy(xpath = "//img[@alt='Link']")
	private WebElement imageBtn;

	/**
	 * @Description - Drop down button
	 */

	@FindBy(xpath = "//img[@alt='ListBox']")
	private WebElement dropDownBtn;

	/**
	 * @Description - Radio button
	 */

	@FindBy(xpath = "//img[@alt='Radio Button']")

	private WebElement radioButtonBtn;

	/**
	 * @Description - Check box button
	 */

	@FindBy(xpath = "//img[@alt='Checkbox']")

	private WebElement checkBoxBtn;

	/**
	 * @Description - Table button
	 */

	@FindBy(xpath = "//img[@alt='Table']")
	private WebElement tableBtn;

	/**
	 * @Description - Alert button
	 */

	@FindBy(xpath = "//img[@alt='Alert']")
	private WebElement alertBtn;

	/**
	 * @Description - Frame button
	 */

	@FindBy(xpath = "//img[@alt='Frame']")
	private WebElement frameBtn;

	/**
	 * @Description - Window button
	 */

	@FindBy(xpath = "//img[@alt='Windows']")
	private WebElement windowBtn;

	/**
	 * @Description - calendar button
	 */

	@FindBy(xpath = "//img[@alt='Calendar']")
	private WebElement calendarBtn;

	/**
	 * @Description - Drag-able button
	 */

	@FindBy(xpath = "//img[@alt='Draggable']")
	private WebElement dragBtn;

	/**
	 * @Description - Drop-able button
	 */

	@FindBy(xpath = "//img[@alt='drop']")
	private WebElement dropBtn;

	/**
	 * @Description - Selectable button
	 */
	@FindBy(xpath = "//img[@alt='selectable']")
	private WebElement selectBtn;
	
	/**
	 * @Description - sortable button
	 */
	
	@FindBy(xpath="//img[@alt='sortable']")
	private WebElement sortableTxt;
	
	/**
	 * @Description - Auto complete button
	 */
	
	@FindBy(xpath="//img[@alt='Auto Complete']")
	private WebElement autoCompleteTxt;
	
	/**
	 * @Description - Download Files button
	 */
	
	@FindBy(xpath="//img[@alt='Download']")
	private WebElement downloadFilesBtn;
	
	/**
	 * @Description - Upload files button
	 */
	
	@FindBy(xpath="//img[@alt='contextClick']")
	private WebElement uploadFilesBtn;
	
	/**
	 * @Description - Tool Tip Button
	 */
	
	@FindBy(xpath="//h5[text()='Tool Tip']")
	private WebElement toolTipBtn;
	
	/**
	 * @Description - Wait to Disappear
	 */
	
	@FindBy(xpath="//img[@alt='disapper']")
	private WebElement waitDisappearBtn;
	
	/**
	 * @Description - wait to appear
	 */
	
	@FindBy(xpath="//img[@alt='appear']")
	private WebElement waitToAppear;
	
	/**
	 * @Description - wait for text to change 
	 */
	
	@FindBy(xpath="//h5[text()='Wait for Text Change']")
	private WebElement waitUntillChange;
	
	/**
	 * @Description -Wait for Alert 
	 */
	@FindBy(xpath="//h5[text()='Wait for Alert']")
	private WebElement waitAlertBtn;
	
	/**
	 * @Description - Mouse hover
	 */
	
	@FindBy(xpath="//img[@alt='mouseover']")
	private WebElement mouseHoverBtn;
	
	/**
	 * @Advance web table
	 */
	
	@FindBy(xpath="//img[@alt='sort']")
	
	private WebElement advanceWebTableBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
