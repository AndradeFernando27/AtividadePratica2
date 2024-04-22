
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    public static List<Produto> listaProdutos = new ArrayList<>();

    public static void cadastrar(Produto prod){
        listaProdutos.add(prod);
    }

    public static List<Produto> getListaProdutos() {
        return new ArrayList<>(listaProdutos);
    }
    public static void excluirProdutos() {
        listaProdutos.clear();
    }
    
    public void cadastrarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public static void setListaProdutos(List<Produto> listaProdutos) {
        Cadastro.listaProdutos = listaProdutos;
    }
   
}
