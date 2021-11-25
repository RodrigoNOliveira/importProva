package br.compreaqui;

public class Conta {




    //CLIENTES  

    private static int qtdContas;

    private Cliente cliente;
    private String pessoa;
    private int numero;

    
    //PRODUTOS  
    private static int qtdProdutos;
    private Produto produto;
    private String item;
    private int nmr;
    
       
    
    
    
    
    
    

    public Conta(){
        Conta.qtdContas = Conta.qtdContas+1;
        Conta.qtdProdutos = Conta.qtdProdutos+1;
        
    }
    
    public Conta (Cliente cliente){
        this();
        this.cliente = cliente;
    }
    public Conta (String pessoa, Cliente cliente){
        this(cliente);
        this.pessoa = pessoa;
    }

    public Conta (Produto produto){
        this();
        this.produto = produto;
    }
    

    public boolean adicionar(String qualpdt){
        this.item = qualpdt;
        return true; 
       
    }

    public void excluir(String qualpdt){
        this.item = qualpdt;
        
    }

    


    









    /**
     * @return Cliente return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * @return int return the x
     */
    public String getPessoa() {
        return pessoa;
    }

    /**
     * @param x the x to set
     */
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }


   public int getQtdContas(){
       return Conta.qtdContas;
   }


    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * @return Produto return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return String return the comprado
     */
    public String getItem() {
        return item;
    }

    /**
     * @param comprado the comprado to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return int return the nmr
     */
    public int getNmr() {
        return nmr;
    }

    /**
     * @param nmr the nmr to set
     */
    public void setNmr(int nmr) {
        this.nmr = nmr;
    }

}
