public class Produto{
   public String tipo;
   public  float valor;
   public float peso;
   public  String fabricante;
   public String nome;
    public Produto(String tipo, float valor, float peso, String fabricante,String nome) {
        this.tipo = tipo;
        this.valor = valor;
        this.peso = peso;
        this.nome = nome;
        this.fabricante = fabricante;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }  
  }