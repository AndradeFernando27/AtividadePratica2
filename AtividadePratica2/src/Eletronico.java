public class Eletronico extends Produto {

    private int lancamento;
    private String sistema;
    public String nome;
      


    public Eletronico(String tipo, float valor, float peso, String fabricante, String nome, int lancamento,
            String sistema, String nome2) {
        super(tipo, valor, peso, fabricante, nome);
        this.lancamento = lancamento;
        this.sistema = sistema;
        nome = nome2;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    
}
