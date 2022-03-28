package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void abrirNavegador(String appUrl, String descricaoPasso) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		
	}
	public void btnPesquisar(By elemento) {
		
		driver.findElement(elemento).click();;
	}
	
	public void pesquisar(String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void sendPesquisar (By elemento) {
		
		driver.findElement(elemento).click();;
	}
	
	public void submit(By elemento) {
		
		driver.findElement(elemento).submit();
	}
	
	public void fecharNavegador() {
		driver.quit();
		
	}
}
