package padroesdecriacao.factorymethod.model;

public class ServicoVenda implements Servico{
    @Override
    public String executar() {
        return "Venda Feita";
    }

    @Override
    public String cancelar() {
        return "Venda Desfeita";
    }
}
