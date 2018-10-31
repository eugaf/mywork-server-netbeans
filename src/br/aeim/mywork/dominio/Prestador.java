package br.aeim.mywork.dominio;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value = "P")
public class Prestador extends Pessoa {
    
    @Column(nullable = false, name = "nome_empresa")
    private String nomeEmpresa;
    @JoinColumn(nullable = false)
    @OneToOne
    private Area area;
    @OneToMany
    private List<Cliente> historico;

    public Prestador() {
    }

    public Servico encerrarServico() {
        return null;
    }


    public Avaliacao avaliarCliente() {
        return null;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Cliente> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Cliente> historico) {
        this.historico = historico;
    }
}
