package steps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Formularios;
import pages.HomePage;
import run.Executa;

public class Teste {
	
	Executa executa = new Executa();
	HomePage home = new HomePage();
	Formularios formulario = new Formularios();
	
	@Given("que entre no site da empresa tricentis para cotacao {string}")
	public void que_entre_no_site_da_empresa_tricentis_para_cotacao(String site) {
		executa.abrirNavegador(site);
	
	}

	@Given("que clico na opcao desejada")
	public void que_clico_na_opcao_desejada() {
		home.menu("automobile");
	    
	}

	@When("preencho os dados do veiculo")
	public void preencho_os_dados_do_veiculo() {
		formulario.preencherDadosDoVeiculo();
	    
	}

	@When("preencho os dados do seguro")
	public void preencho_os_dados_do_seguro() {
		formulario.preencherDadosDoSeguro();
	  
	}

	@When("preencho os dados do produto")
	public void preencho_os_dados_do_produto() {
		formulario.preencherDadosDoProduto();
	    
	}

	@When("preencho os dados do preco")
	public void preencho_os_dados_do_preco() throws InterruptedException {
		formulario.preencherDadosDoPreco();
	    
	}

	@When("envio cotacao")
	public void envio_cotacao() {
		formulario.enviarCotacao();
	    
	}

	@Then("cotacao enviada com sucesso")
	public void cotacao_enviada_com_sucesso() throws IOException, InterruptedException {
		formulario.cotacaoEnviada();
	    
	}

}
