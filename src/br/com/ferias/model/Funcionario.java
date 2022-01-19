package br.com.ferias.model;

public class Funcionario extends Cliente{
    
    private String cargo;
    private String senha;
    private String nivelAcesso;
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
    
}
