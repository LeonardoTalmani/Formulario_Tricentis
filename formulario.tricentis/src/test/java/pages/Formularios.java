package pages;

import java.io.IOException;

public class Formularios {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	public void preencherDadosDoVeiculo() {
		
		metodo.clicar(elemento.make);
		metodo.clicar(elemento.opcaoAudi);
		metodo.escrever(elemento.enginePerformance, "2000");
		metodo.escrever(elemento.dateOfManufacture, "12/12/2012");
		metodo.clicar(elemento.numberOfSeats);
		metodo.clicar(elemento.nineSeats);
		metodo.clicar(elemento.fuelType);
		metodo.clicar(elemento.diesel);
		metodo.escrever(elemento.listPrice, "10000");
		metodo.escrever(elemento.annualMileage, "5000");
		metodo.clicar(elemento.nextButton);
	}

	public void preencherDadosDoSeguro() {
		
		metodo.escrever(elemento.firstName, "Teste");
		metodo.escrever(elemento.lastName, "Teste");
		metodo.escrever(elemento.dateOfBirth, "12/12/2000");
		//metodo.clicar(elemento.genderMale);
		metodo.escrever(elemento.streetAddress, "Teste");
		metodo.clicar(elemento.country);
		metodo.clicar(elemento.brasil);
		metodo.escrever(elemento.zipCode, "1111");
		metodo.escrever(elemento.city, "Teste");
		metodo.clicar(elemento.occupation);
		metodo.clicar(elemento.selfEmployed);
		metodo.clicar(elemento.hobbies);
		metodo.clicar(elemento.nextButton2);

	}

	public void preencherDadosDoProduto() {
		
		metodo.escrever(elemento.startDate, "12/12/2023");
		metodo.clicar(elemento.insuranceSum);
		metodo.clicar(elemento.opcao35);
		metodo.clicar(elemento.meritiRating);
		metodo.clicar(elemento.superBonus);
		metodo.clicar(elemento.damageInsurance);
		metodo.clicar(elemento.fullCoverage);
		metodo.clicar(elemento.optionalProducts);
		metodo.clicar(elemento.courtesyCar);
		metodo.clicar(elemento.yesCourtesy);
		metodo.clicar(elemento.nextButton3);

	}

	public void preencherDadosDoPreco() throws InterruptedException {
		elemento.priceOption("Ultimate");
		Thread.sleep(1500);
		metodo.clicar(elemento.nextButton4);

	}

	public void enviarCotacao() {
		
		metodo.escrever(elemento.email, "teste@teste.com.br");
		metodo.escrever(elemento.phone, "12345678");
		metodo.escrever(elemento.username, "teste");
		metodo.escrever(elemento.password, "Leo123");
		metodo.escrever(elemento.confPassword, "Leo123");
		metodo.clicar(elemento.sendCote);

	}
	
	public void cotacaoEnviada() throws IOException, InterruptedException {
		
		Thread.sleep(12000);
		metodo.validarTexto("Sending e-mail success!", elemento.msgSucess);
		metodo.screenShot("CT1- Cotação enviada com sucesso");
		metodo.clicar(elemento.btnOk);
		metodo.fecharNavegador();
		
	}

}
