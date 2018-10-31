package br.aeim.mywork.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value = "C")
public class Cliente extends Pessoa {
    
    @Column(length = 100, nullable = false)
    private String pais;
    @Column(length = 100, nullable = false)
    private String estado;
    @Column(length = 100, nullable = false)
    private String cidade;
    @Column(length = 100, nullable = false)
    private String bairro;
    @Column(length = 100, nullable = false)
    private String logradouro;
    @Column(nullable = false)
    private int num;
    @Column(nullable = false)
    private int cep;

    public Cliente() {
    }

    public Servico contrataServico() {
        return null;
    }

    public Servico avaliarServico () {
        return null;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
