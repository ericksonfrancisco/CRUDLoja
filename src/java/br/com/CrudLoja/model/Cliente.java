package br.com.CrudLoja.model;


public class Cliente {
    private int id;
    private String nome;
    private String edereco;
    private String cep;
    private String cpf;
    private String rg;
    private String email;
    private String telefone;

        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * @return the nome
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
         * @return the edereco
         */
        public String getEdereco() {
            return edereco;
        }

        /**
         * @param edereco the edereco to set
         */
        public void setEdereco(String edereco) {
            this.edereco = edereco;
        }

        /**
         * @return the cep
         */
        public String getCep() {
            return cep;
        }

        /**
         * @param cep the cep to set
         */
        public void setCep(String cep) {
            this.cep = cep;
        }

        /**
         * @return the cpf
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
         * @return the rg
         */
        public String getRg() {
            return rg;
        }

        /**
         * @param rg the rg to set
         */
        public void setRg(String rg) {
            this.rg = rg;
        }

        /**
         * @return the email
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
         * @return the telefone
         */
        public String getTelefone() {
            return telefone;
        }

        /**
         * @param telefone the telefone to set
         */
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    
}

public Cliente() {}

public Cliente (String nome, String endereco, String cep, String cpf, String rg, String email, String telefone) {
    this.nome = nome;
    this.cep = cep;
    this.cpf = cpf;
    this.rg = rg;
    this.email = email;
    this.telefone = telefone;
}

public Cliente (int id, String nome, String endereco, String cep, String cpf, String rg, String email, String telefone) {
    this.id = id;
    this.nome = nome;
    this.cep = cep;
    this.cpf = cpf;
    this.rg = rg;
    this.email = email;
    this.telefone = telefone;
}