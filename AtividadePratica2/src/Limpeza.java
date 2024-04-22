public class Limpeza extends Produto {
    private String composicao;
    public String nome;

    public Limpeza(String tipo, float valor, float peso, String fabricante, String composicao,String nome) {
        super(tipo, valor, peso, fabricante, nome);
        this.composicao = composicao;
        this.nome = nome;
    }

    

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }



    @Override
    public String toString() {
        return nome;
    }
}
