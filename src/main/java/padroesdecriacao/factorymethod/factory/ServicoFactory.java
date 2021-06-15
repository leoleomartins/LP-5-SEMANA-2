package padroesdecriacao.factorymethod.factory;

import padroesdecriacao.factorymethod.model.Servico;

public class ServicoFactory {

    public static Servico obterServico(String tipoServico) {
        Class classe;
        Object objeto;
        try {
            classe = Class.forName("padroesdecriacao.factorymethod.model.Servico" + tipoServico);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof Servico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (Servico) objeto;
    }
}
