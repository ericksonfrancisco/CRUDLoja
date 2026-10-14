package br.com.CrudLoja.model;


public class Cliente {

    private int id;
    private String nome;
    private String endereco; 
    private String cep;
    private String cpf;
    private String rg;
    private String email;
    private String telefone;

    // Construtor vazio
    public Cliente() {
    }

    // Construtor sem ID
    public Cliente(String nome, String endereco, String cep, String cpf, String rg, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco; 
        this.cep = cep;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
    }

    // Construtor com ID
    public Cliente(int id, String nome, String endereco, String cep, String cpf, String rg, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco; 
        this.cep = cep;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
    }


    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public String getCep() {
        return cep;
    }

    
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getRg() {
        return rg;
    }

    
    public void setRg(String rg) {
        this.rg = rg;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

