package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browsers {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("---------- erro ao clicar ---------- " + e.getMessage());
			System.err.println("---------- causa do erro ----------" + e.getCause());
		}
	}

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("---------- erro ao escrever ---------- " + e.getMessage());
			System.err.println("---------- causa do erro ----------" + e.getCause());
		}
	}
	
	public void validarTexto(String textoEsperado, By elemento) {

		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);

	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File desFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(scrFile, desFile);

	}
	
	public void fecharNavegador() {
		
		driver.quit();
		
	}

}
