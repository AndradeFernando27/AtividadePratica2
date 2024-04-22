import java.util.List;

public class Sistema {
    public static void buscarProd(String nome) {
        List<Produto> produtos = Cadastro.getListaProdutos();
        boolean encontrado = false;
        
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {//para aceitar letras maiusculas e minusculas
                System.out.println("Produto encontrado:");
                System.out.println(produto);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
   
    
    public static void Menu() {
        System.out.println("=-=-=-=-=-= Menu  =-=-=-=-=-=");
        System.out.println("Digite 1 para cadastrar novo produto");
        System.out.println("Digite 2 para buscar produto");
        System.out.println("Digite 3 para listar todos os itens cadastrados");
        System.out.println("Digite 7 para excluir todos os itens cadastrados");
        System.out.println("Digite 0 para Sair\n");
    }
    
    private static void opcao(int op){
        
        
        switch (op) {
            case 1:
            System.out.println("\n=-=-=-=-=-= Cadastro de produtos =-=-=-=-=-=  ");
            System.out.println("Digite o tipo de produto: ");
            System.out.println("Digite 0 para cadastrar alimento\nDigite 1 para cadastrar eletronico\nDigite 3 para cadastrar produto de limpeza:\n");
            op = Leitor.lerInt();
            if(op==0){
                System.out.println("Cadastrar alimento");
                System.out.println("Digite o nome do produto: \n");
                String nome = Leitor.lerString();
                System.out.println("Digite o nome do fabricante: \n");
                String fabricante = Leitor.lerString();
                System.out.println("Digite o peso do produto: \n");
                float peso = Leitor.lerFloat();
                System.out.println("Digite o valor do produto: \n");
                float valor = Leitor.lerFloat();
                System.out.println("Produto tem lactose? (Digite S para sim e N para nao.) \n");
                char lactose = Leitor.lerChar();
                
                Produto produto = new Alimento(nome, valor, peso, fabricante, fabricante, fabricante, lactose);
                Cadastro.cadastrar(produto);
                System.out.println("Produto cadastrado:\n");
                System.out.println(produto);
                break;
               }
            else if(op==1){
                System.out.println("Cadastrar eletronico");
                System.out.println("Digite o nome do produto: ");
                String nome2 = Leitor.lerString();
                System.out.println("Digite o nome do fabricante: ");
                String fabricante = Leitor.lerString();
                System.out.println("Digite o peso do produto: ");
                float peso = Leitor.lerFloat();
                System.out.println("Digite o valor do produto: ");
                float valor = Leitor.lerFloat();
                System.out.println("Digite o ano de lancamento: ");
                int lancamento = Leitor.lerInt();
                System.out.println("Digite o sistema operacional: ");
                String sistema = Leitor.lerString();
                
                
                System.out.println("\nProduto cadastrado!");
                Cadastro.cadastrar(null);
                break;


            }else{
                System.out.println("\nCadastrar produto de limpeza\n");
                System.out.println("Digite o nome do produto: ");
                String nome = Leitor.lerString();
                System.out.println("Digite o nome do fabricante: \n");
                String fabricante = Leitor.lerString();
                System.out.println("Digite o peso do produto: \n");
                float peso = Leitor.lerFloat();
                System.out.println("Digite o valor do produto: \n");
                float valor = Leitor.lerFloat();
                System.out.println("Digite a composicao do produto: \n");
                String composicao = Leitor.lerString();
                break;
            }
        
        case 2:{
            System.out.println("\n=-=-=-=-=-= Buscar produto =-=-=-=-=-=");
            System.out.println("Digite o nome do produto a ser procurado: ");
            String nome = Leitor.lerString();
            buscarProd(nome);
            System.out.println(nome);
        }
        case 3:{
            System.out.println("Produtos cadastrados");
        List<Produto> listaProdutos = Cadastro.getListaProdutos(); 
        for(Produto produto : listaProdutos){
        System.out.println(produto);
    }
    break; 
}   case 4:{
            System.out.println("Excluir todos os dados");
            Cadastro.excluirProdutos();
            break;
}           
        }
    
    }
        public static void executar() {

            int op;
    
            do {
    
                Menu();
                op = Leitor.lerInt();
                opcao(op);
    
            } while (op != 0);
    
        }
    }
    
  
   // \n
   