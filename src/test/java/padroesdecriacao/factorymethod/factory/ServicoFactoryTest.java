package padroesdecriacao.factorymethod.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import padroesdecriacao.factorymethod.model.Servico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Servico Factory")
class ServicoFactoryTest {

    @Test
    @DisplayName("Servico Inexistente ou Invalido")
    void deveLancarExceptionParaServicoInexistenteOuInvalido(){
        assertThrows(IllegalArgumentException.class, ()-> ServicoFactory.obterServico("Inexistente"));
    }

    @Test
    @DisplayName("Executa Servico de Compra")
    void deveCriarServicoDeCompraValido(){
        Servico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra Feita",servico.executar());

    }



}
