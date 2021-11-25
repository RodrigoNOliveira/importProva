package br.compreaqui;

public class Cliente {

    private String nome;
    private String email;
    private String cpf;
    private String endereco;

    public Cliente(){

    }
    public Cliente (String cpf){
        if (Cpf.isCPF(cpf)){
            this.cpf = cpf;
        }
        else {
            System.out.println("CPF não é válido");
        }
    }
    
    public Cliente (String nome, String email, String cpf, String endereco){
        if (Cpf.isCPF(cpf) == true){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;}
        else {
            System.out.println("CPF DIGITADO INVALIDO");
        }
     }


    /* public String achaConta(){
        return this.nome();
    }*/


    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
