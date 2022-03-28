import com.codeborne.selenide.selector.ByText;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isChrome;
import static io.cucumber.*;

public class agendaTestes {

    @Test
    public void devoApagarContatoExistenteNaAgenda(){
        isChrome();
        open("http://localhost:8080/");
        $(byXpath("//tbody/tr[2]/td[3]")).click();
    }

    @Test
    public void devoIncluirContatoNaAgenda(){
        isChrome();
        open("http://localhost:8080/");
        //Quando eu adicionar um contato
        $(byText("Adicionar")).click();
        $("input[placeholder=Nome]").setValue("Matheus");
        $("input[placeholder=Telefone]").setValue("61983089387");
        //Então deverá retornar o contato incluído
        $(byXpath("//button[@class='btn btn-primary']")).click();
        $(byXpath("//table[@class='table']/tbody/tr[2]/td[1]")).shouldHave(text("Matheus"));

    }

    @Test
    public void naoDevoIncluirContatoExistenteNaAgenda(){
        isChrome();
        open("http://localhost:8080/");
        //Quando eu incluir contato já existente na agenda
        $(byText("Adicionar")).click();
        $("input[placeholder=Nome]").setValue("Matheus");
        $("input[placeholder=Telefone]").setValue("61983089387");
        $(byXpath("//button[@class='btn btn-primary']")).click();
        //Então deverá retornar mensagem de exceção
        $(byXpath("//div[@class='modal-body']")).shouldHave(text("Pessoa já existe."));
        $(byText("Cancelar")).click();

    }
    @Test
    public void naoDevoIncluirNumeroNoCampoNome(){
        isChrome();
        open("http://localhost:8080/");
        //Quando eu incluir numero no campo Nome
        $(byText("Adicionar")).click();
        $("input[placeholder=Nome]").setValue("61983089387");
        $("input[placeholder=Telefone]").setValue("NumeroNoNome");
        $(byXpath("//button[@class='btn btn-primary']")).click();
        //Então deverá retornar mensagem de Exceção
        $(byXpath("//div[@class='modal-body']")).shouldHave(text("O campo Nome não aceita número."));
        $(byText("Cancelar")).click();

    }
    @Test
    public void naoDevoIncluirLetrasNoCampoTelefone(){
        isChrome();
        open("http://localhost:8080/");
        //Quando eu incluir letras no campo Telefone
        $(byText("Adicionar")).click();
        $("input[placeholder=Nome]").setValue("LetrasNoTelefone");
        $("input[placeholder=Telefone]").setValue("Matheus");
        $(byXpath("//button[@class='btn btn-primary']")).click();
        //Então deverá retornar mensagem de exceção
        $(byXpath("//div[@class='modal-body']")).shouldHave(text("O campo Telefone não aceita letra."));
        $(byText("Cancelar")).click();

    }
}
