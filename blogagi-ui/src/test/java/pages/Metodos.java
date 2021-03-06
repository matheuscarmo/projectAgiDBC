package pages;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	String textoChaveEsperado = "pix";
	String textoNaoEncontradoEsperado = "Nenhum resultado";
	
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
	
	public void validarPesquisaChave(String texto, By elemento) {
		
		String textoChave = driver.findElement(elemento).getText();
		assertEquals(textoChaveEsperado, textoChave);
	}
	
	public void validarPesquisaNaoEncontrada(String texto, By elemento) {
		
		String textoNaoEncontrado = driver.findElement(elemento).getText();
		assertEquals(textoNaoEncontradoEsperado, textoNaoEncontrado);
	}
	
	public void fecharNavegador() {
		driver.quit();
		
	}
}
