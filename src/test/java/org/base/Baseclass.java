package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static Select s;

	public static void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRAKASH\\eclipse-workspace\\MavenClass\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void chromeBrowserNew() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchurl(String url) {
		driver.get(url);
	}

	public static void maxwindow() {

		driver.manage().window().maximize();

	}

	public static void pagetitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void pageurl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

	public static void end() {
		driver.close();

	}

	public static void terminate() {
		driver.quit();
	}

	public static void filltxtbox(WebElement element, String txt) {
		element.sendKeys(txt);
	}

	public static void btnclick(WebElement element) {
		element.click();
	}

	public static void clr(WebElement element) {
		element.clear();
	}

	public static void threadslp(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void txtvalue(WebElement e, String val) {
		String attribute = e.getAttribute(val);
		System.out.println(attribute);
	}

	public static void gettingtxt(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void getdate() {
		Date d = new Date();
		System.out.println(d);
	}

	public static void mouseover(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dandD(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void clickdouble(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void rightclick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void clickdown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void selectall() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}

	public static void clickenter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void downscroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void upscroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void txtreturning(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object execute = js.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(execute);
	}

	public static void givingtxt(WebElement element, String val) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object execute = js.executeScript("return arguments[0].setAttribute('value'," + val + ")", element);
		System.out.println(execute);
	}

	public static void jsclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void takeSS(String picname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\PRAKASH\\eclipse-workspace\\Cucumberr\\Screenshots\\" + picname + ".png");
		FileUtils.copyFile(src, des);
	}

	public static void simpleAl() {
		al = driver.switchTo().alert();
		al.accept();
	}

	public static void confirmAl() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void promptAl(String val) {
		al = driver.switchTo().alert();
		al.sendKeys(val);
		al.accept();
	}

	public static void togetAlertTxt() {
		al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
	}

	public static void chooseByIndx(WebElement element, int i) {
		s = new Select(element);
		s.selectByIndex(i);
	}

	public static void chooseBytxt(WebElement element, String txt) {
		s = new Select(element);
		s.selectByVisibleText(txt);
	}

	public static void chooseByVal(WebElement element, String val) {
		s = new Select(element);
		s.selectByValue(val);
	}

	public static void MultiDropDown(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void Dropdownopt(WebElement element) {
		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement w : options) {
			System.out.println(w.getText());

		}
	}

	public static void DropdownselectedOpt(WebElement element) {
		s = new Select(element);
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement w : all) {
			System.out.println(w.getText());
		}
	}

	public static void DropdownFirstOpt(WebElement element) {
		s = new Select(element);
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
	}

	public static void DDdeselectByIndx(WebElement element, int i) {
		s = new Select(element);
		s.deselectByIndex(i);
	}

	public static void DDdeselectByTxt(WebElement element, String txt) {
		s = new Select(element);
		s.deselectByVisibleText(txt);
	}

	public static void DDdeselectByValue(WebElement element, String val) {
		s = new Select(element);
		s.deselectByValue(val);
	}

	public static void DDdeselectall(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	public static void HoldingTime(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static String readExcel(int rowno, int cellno, String filename, String sheetname) throws IOException {
		File f = new File("C:\\Users\\PRAKASH\\eclipse-workspace\\Cucumberr\\Excel\\" + filename + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet(sheetname);
		Row r = sh.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		String name = "";
		if (type == 1) {
			name = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat form = new SimpleDateFormat("dd/mm/yyyy");
			name = form.format(da);

		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			name = String.valueOf(l);
		}
		return name;
	}

	public static void toWriteInExcel(int rowno, int cellno, String value, String filename, String sheetname)
			throws IOException {
		File f = new File("C:\\Users\\PRAKASH\\eclipse-workspace\\Cucumberr\\Excel\\" + filename + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet(sheetname);
		Row r = sh.createRow(rowno);
		Cell c = r.createCell(cellno);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
		System.out.println("done...");

	}

	public static void toUpdateInExcel(int rowno, int cellno, String value, String filename, String sheetname)
			throws IOException {
		File f = new File("C:\\Users\\PRAKASH\\eclipse-workspace\\Cucumberr\\Excel\\" + filename + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet(sheetname);
		Row r = sh.getRow(rowno);
		Cell c = r.getCell(cellno);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
		System.out.println("done...");

	}

	public static void switchwindow() {
		String win1 = driver.getWindowHandle();
		Set<String> win2 = driver.getWindowHandles();

		for (String win : win2) {
			if (win1 != win) {
				driver.switchTo().window(win);
			}
		}
	}

	public static void multiSwitchwindow(int i) {

		Set<String> win1 = driver.getWindowHandles();

		List<String> li = new ArrayList<String>();
		li.addAll(win1);
		driver.switchTo().window(li.get(i));
	}

}
