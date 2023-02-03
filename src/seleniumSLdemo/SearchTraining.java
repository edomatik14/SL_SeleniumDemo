/*
	 * USERCASE:
	 * Selenium program developed to solve the following test case:
	 * 1. As a user, i want to go to Simplilearn web page and search for "Selenium".
	 * 2. From Simplilearn web page, i want to look up for Selenium 3.0 Training course, and click on it.
	 * 3. In Simplilearn web page i want to get the page title, and then close the browser.
*/

package seleniumSLdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTraining {
	
	// Creates the driver in order to be used in each class. Crea el driver que se usara en cada clase. 
	WebDriver driver;
	
	// Launching the browser. Inicia el navegador.
	public void LaunchBrowser() {
		// Defines the type of driver we are using and it's path, this changes depending your preferred browser.
		// Define el tipo de driver a usar y su ubicacion, esto cambia de acuerdo al navegador usado.
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\eddao\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		// Create and assign the driver. It changes according to the used browser.
		// Crea y asigna el driver. Varia de acuerdo al navegador usado.
		driver = new ChromeDriver();
		// Launch the indicated URL WebSite. Lanza la URL del sitio web indicado. 
		driver.get("https://www.simplilearn.com/");
	}
	
	// Searching Selenium training an clicking on it. Buscando El curso indicado
	public void search() {
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("header_srch")).sendKeys("Selenium"); // Localiza la barra de busqueda por id y le introduce el valor a buscar.
		driver.findElement(By.xpath("//span[@class='search_icon input-search-icon']")).click(); // Localiza el boton de buscar por la clase, y hace click en el boton.
		driver.findElement(By.xpath("//h2[text()='Selenium 3.0 Training']")).click(); // Localiza el elemento a buscar por texto, y hace click en el elemento.
		System.out.println("The page title is: " + driver.getTitle()); // Recupera el titulo de la pagina y lo muestra por consola
		
	}
	
	// Close the browser. Cierra el Navegador.
	public void closeBrowser() {
		driver.quit(); // Closes the Browser.
	}
	

	public static void main(String[] args) {
		SearchTraining obj = new SearchTraining();
		
		obj.LaunchBrowser();
		obj.search();
		obj.closeBrowser();
		
	}

}
