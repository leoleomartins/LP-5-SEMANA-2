package padroesdecriacao.prototype;

public class Acao implements Cloneable {
    private Long id;
    private String codigo;
    private Empresa empresa;
    private Double valor;

    public Acao(Long id, String codigo, Empresa empresa, Double valor) {
        this.id = id;
        this.codigo = codigo;
        this.empresa = empresa;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public Acao clone() throws CloneNotSupportedException {
        Acao acaoClone = (Acao) super.clone();
        acaoClone.empresa = (Empresa)acaoClone.empresa.clone();
        return acaoClone;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", valor=" + valor +
                '}';
    }
}
