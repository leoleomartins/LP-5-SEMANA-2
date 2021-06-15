package padroesdecriacao.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Acao Prototype")
class AcaoTest {

    @Test
    @DisplayName("Clona Objeto com Sucesso")
    void clonaObjetoComSucesso() throws CloneNotSupportedException {
        Acao acao = new Acao(1L, "PETR4", new Empresa(1L, "Petrobras", "1234"), 21.87);
        Acao acaoClone = acao.clone();
        acaoClone.setValor(22.34);
        acaoClone.getEmpresa().setNome("Petrorio");

       assertEquals("Acao{id=1, codigo='PETR4', empresa='Empresa{id=1, nome='Petrobras', cnpj='1234'}', valor=21.87}",
               acao.toString());
       assertEquals("Acao{id=1, codigo='PETR4', empresa='Empresa{id=1, nome='Petrorio', cnpj='1234'}', valor=22.34}",
               acaoClone.toString());

    }

}
