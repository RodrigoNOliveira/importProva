package br.compreaqui;



public class Carrinho {
    
    private Cliente cliente;
    private Produto produto;
    private int pdt;


    public Carrinho(){

    }

    public Carrinho(Cliente cliente){
        this();
        this.cliente = cliente;
    }

    public Carrinho(int pdt, Cliente cliente){
        this(cliente);
        this.pdt = pdt;
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
     * @return int return the produtos
     */
    public int getPdt() {
        return pdt;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setPdt(int pdt) {
        this.pdt = pdt;
    }

}
