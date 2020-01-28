package br.com.EventosKrazyDog.SistemaEventos.Model;

import javax.persistence.*;

@Entity
@Table(name ="evento")
public class eventosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column
    private String nomeEvento;

    @Column
    private String descricaoEvento;

    @Column
    private String tipoEvento;

    @Column
    private String dataCriacaoEvento;

    @Column
    private String dataEvento;

    @Column
    private String horaInicioEvento;

    @Column
    private String horaTerminoEvento;

    @Column
    private String ruaEvento;

    @Column
    private String numeroEvento;

    @Column
    private String bairro;

    @Column
    private String cidade;

    @Column
    private String estadoEvento;

    @Column
    private String paisEvento;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDataCriacaoEvento() {
        return dataCriacaoEvento;
    }

    public void setDataCriacaoEvento(String dataCriacaoEvento) {
        this.dataCriacaoEvento = dataCriacaoEvento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getHoraInicioEvento() {
        return horaInicioEvento;
    }

    public void setHoraInicioEvento(String horaInicioEvento) {
        this.horaInicioEvento = horaInicioEvento;
    }

    public String getHoraTerminoEvento() {
        return horaTerminoEvento;
    }

    public void setHoraTerminoEvento(String horaTerminoEvento) {
        this.horaTerminoEvento = horaTerminoEvento;
    }

    public String getRuaEvento() {
        return ruaEvento;
    }

    public void setRuaEvento(String ruaEvento) {
        this.ruaEvento = ruaEvento;
    }

    public String getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(String numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstadoEvento() {
        return estadoEvento;
    }

    public void setEstadoEvento(String estadoEvento) {
        this.estadoEvento = estadoEvento;
    }

    public String getPaisEvento() {
        return paisEvento;
    }

    public void setPaisEvento(String paisEvento) {
        this.paisEvento = paisEvento;
    }
}
