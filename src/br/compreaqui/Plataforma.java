package br.compreaqui;

import javax.swing.JOptionPane;

public class Plataforma {

    private int cntdr;
    private Conta[] vtContas;
    private Produto[] vtProdutos;


    public Plataforma(){

    }

    public Plataforma(int nmrContas){
        vtContas = new  Conta[nmrContas];
    }


 
           
            
            
        
        
        
        
       
    /*private boolean comprar(Conta conta, String item){
        return conta.adicionar(item);
    }
*/

    public void iniciar(){
        int option = 0;
        do {
            option = menuApp();
        } while (option !=0);
        
    }

    public void cadastrarPessoa(){
        Cliente z = cadastroCliente();
        Conta x = new Conta(z);
        x.setNumero(x.getQtdContas());
        this.vtContas[cntdr] = x;
        cntdr++;
    }

    public void colocarProduto(){
        
    }

    private String entrada(String texto){
        String entd = JOptionPane.showInputDialog(null, texto);
        return entd;
    }



    private Cliente cadastroCliente(){
        String nome = entrada("Insira o nome do cliente");
        String email = entrada("Insira o email do cliente");
        String cpf = entrada("Insira o CPF do cliente");
        String endereco = entrada("Insira o endereço do cliente");
        Cliente d = new Cliente(nome, email, cpf, endereco);        
        return d;
    }
    
    private Produto cadastroProduto(){
        String nomePdt = entrada("Insira o nome do produto");
        String preco = entrada("Insira o preço do produto");
        String entd = entrada("Insira a quantidade do produto");
        int quantidade = Integer.parseInt(entd);
        Produto nvProduto = new Produto(nomePdt, preco, quantidade);        
        return nvProduto;
    }

    public Conta busCliente (String pessoa){
        for (Conta conta: vtContas){
            if(conta.getPessoa() == pessoa){
                /*conta = d.getNome();*/
                return conta;
            }
        }
        return null;
    }

    public Produto adcProduto(int pdts){
        for (Produto compra: vtProdutos){
            if (compra.getPdts() == pdts){
                return compra;
            }
        }
        return null;
    }


     public int menuApp(){
        System.out.println("Escolha a Opção desejada: ");
        System.out.println("1- Cadastro de cliente");
        System.out.println("2- Cadastro de produto");
        System.out.println("3- Buscar cliente");
        System.out.println("4- Adicionar produto no carrinho de compras");
        System.out.println("5- Excluir produto");
        System.out.println("6- Nota fiscal");
        System.out.println("0- Sair");
        String entd = entrada("Insira a opção desejada");
        int opcao = Integer.parseInt(entd);
        

        if (opcao == 1){
           cadastrarPessoa();
        } else if (opcao == 2){ 
            cadastroProduto();
        } else if (opcao == 3){ 
            String pessoa = entrada("Digite o nome da pesssoa");
            Conta x = busCliente(pessoa);
            if (x != null){
            //Cliente z = getNome();
            }
        } else if (opcao == 4){
            String pessoa = entrada("Digite o nome da pesssoa");
            Conta x = busCliente(pessoa);
            if (x != null){
            System.out.println(x);
            String item = entrada("Digite o item desejado");
            x.adicionar(item);
            
        }}
             return opcao;
    }

        

    /**
     * @return int return the cntdr
     */
    public int getCntdr() {
        return cntdr;
    }

    /**
     * @param cntdr the cntdr to set
     */
    public void setCntdr(int cntdr) {
        this.cntdr = cntdr;
    }

    /**
     * @return Conta[] return the vtContas
     */
    public Conta[] getVtContas() {
        return vtContas;
    }

    /**
     * @param vtContas the vtContas to set
     */
    public void setVtContas(Conta[] vtContas) {
        this.vtContas = vtContas;
    }


    /**
     * @return Produtos[] return the vtProdutos
     */
    public Produto[] getVtProdutos() {
        return vtProdutos;
    }

    /**
     * @param vtProdutos the vtProdutos to set
     */
    public void setVtProdutos(Produto[] vtProdutos) {
        this.vtProdutos = vtProdutos;
    }

}
