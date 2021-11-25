package br.compreaqui;

public class Produto {

    private String nomePdt;
    private String preco;
    private int quantidade;
    private int pdts;

   

    public Produto (String nomePdt, String preco, int quantidade){
        
        this.nomePdt = nomePdt;
        this.preco = preco;
        this.quantidade = quantidade;
        }
    

    /**
     * @return String return the nomePdt
     */
    public String getNomePdt() {
        return nomePdt;
    }

    /**
     * @param nomePdt the nomePdt to set
     */
    public void setNomePdt(String nomePdt) {
        this.nomePdt = nomePdt;
    }

    /**
     * @return String return the preco
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }

    /**
     * @return String return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    /**
     * @return int return the pdts
     */
    public int getPdts() {
        return pdts;
    }

    /**
     * @param pdts the pdts to set
     */
    public void setPdts(int pdts) {
        this.pdts = pdts;
    }

}
