package padroesdecriacao.factorymethod.model;

public class ServicoCompra implements Servico{

    @Override
    public String executar() {
        return "Compra Feita";
    }

    @Override
    public String cancelar() {
        return "Compra Desfeita";
    }
}
