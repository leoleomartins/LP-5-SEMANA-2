package padroesdecriacao.factorymethod.model;

public class ServicoTransferencia implements Servico{
    @Override
    public String executar() {
        return "Transferencia Feita";
    }

    @Override
    public String cancelar() {
        return "Transferencia cancelada";
    }
}
