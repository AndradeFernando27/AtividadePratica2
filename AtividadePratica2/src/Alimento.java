public class Alimento extends Produto {
    private String tipo_alimento;
    private char lactose;
                    
    public Alimento(String tipo, float valor, float peso, String fabricante, String nome, String tipo_alimento,
            char lactose) {
        super(tipo, valor, peso, fabricante, nome);
        this.tipo_alimento = tipo_alimento;
        this.lactose = lactose;
    }

    public String getTipo_alimento() {
        return tipo_alimento;
    }

    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    public char isLactose() {
        return lactose;
    }

    public void setLactose(char lactose) {
        this.lactose = lactose;
    }

    public char getLactose() {
        return lactose;
    }

    @Override
    public String toString() {
        return nome;
    }

    }
    
