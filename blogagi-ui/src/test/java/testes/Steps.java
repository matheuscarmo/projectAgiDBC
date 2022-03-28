package testes;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb elementosWeb = new ElementosWeb();
	
	@Given("que o usuario tem acesso ao blog {string}")
	public void que_o_usuario_tem_acesso_ao_blog(String appUrl) {
		metodos.abrirNavegador(appUrl, "acessando site");
	}

	@When("for realizar pesquisa com dados invalidos")
	public void for_realizar_pesquisa_com_dados_inválidos() {
		metodos.btnPesquisar(elementosWeb.getBtnPesquisar());
		metodos.pesquisar("*", elementosWeb.getPesquisar());
		metodos.submit(elementosWeb.getPesquisar());

	}

	@Then("nao devera retornar os artigos")
	public void nao_devera_retornar_os_artigos() {
		metodos.fecharNavegador();

	}

	@When("for realizar pesquisa com palavras chaves")
	public void for_realizar_pesquisa_com_palavras_chaves() {
		metodos.btnPesquisar(elementosWeb.getBtnPesquisar());
		metodos.pesquisar("pix", elementosWeb.getPesquisar());
		metodos.submit(elementosWeb.getPesquisar());
	}

	@Then("devera retornar os artigos relacionaddo a pesquisa das palavras chave")
	public void devera_retornar_os_artigos_relacionaddo_a_pesquisa_das_palavras_chave() {
		metodos.fecharNavegador();
	}
}
