package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	//Elementos Web
	
	By btnPesquisar = By.id("search-open");
	By pesquisar = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/label/input");
	By sendPesquisar = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/input");
	By txtNaoEncontrado = By.xpath("//h1[contains(text(),'Nenhum resultado')]");
	By txtPalavraChave = By.xpath("//span[contains(text(),'pix')]");
	

	//Metodos publicos dos elementos

	public By getTxtNaoEncontrado() {
		return txtNaoEncontrado;
	}

	public void setTxtNaoEncontrado(By txtNaoEncontrado) {
		this.txtNaoEncontrado = txtNaoEncontrado;
	}

	public By getTxtPalavraChave() {
		return txtPalavraChave;
	}

	public void setTxtPalavraChave(By txtPalavraChave) {
		this.txtPalavraChave = txtPalavraChave;
	}

	public By getPesquisar() {
		return pesquisar;
	}

	public By getBtnPesquisar() {
		return btnPesquisar;
	}

	public void setBtnPesquisar(By btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}

	public By getSendPesquisar() {
		return sendPesquisar;
	}

	public void setSendPesquisar(By sendPesquisar) {
		this.sendPesquisar = sendPesquisar;
	}

	public void setPesquisar(By pesquisar) {
		this.pesquisar = pesquisar;
	}

}
